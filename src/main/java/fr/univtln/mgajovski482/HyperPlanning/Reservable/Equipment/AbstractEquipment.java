package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment;

import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Reservable;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>AbstractEquipment est une classe abstraite representant les differents equipements disponibles</b>
 * <p>
 * Tout objet etendant AbstractEquipment possede :
 * <ul>
 *     <li>Un id unique et auto-incremental     (Int)</li>
 *     <li>Un état :  OLD, ENOUGH, GOOD, NEW    (CONDITION)</li>
 *     <li>Une marque                           (String)</li>
 *     <li>Des informations diverses            (String)</li>
 * </ul>
 *
 *
 * <p>
 * Les classes qui etendent AbstractEquipment sont :
 * <ul>
 *     <li>Computer</li>
 *     <li>Projector</li>
 * </ul>
 *
 *
 * <p>
 * Les AbstractEquipments sont differenties à l'aide d'un id auto-incrémental.
 * Les differents AbstractEquipments sont stockes à partir d'une Map.
 *
 *
 * @author Maxime
 */

public abstract class AbstractEquipment<T extends AbstractEquipment<?>> implements Reservable {

    public enum CONDITION {OLD, ENOUGH, GOOD, NEW;

        public static CONDITION getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    protected   static int  staticId = 0;
    public      static Map<Integer,AbstractEquipment> staticEquipments = new HashMap<Integer, AbstractEquipment>();


    private final int         id;
    private final String      brand;
    private CONDITION         condition;
    private String            information = Consts.DEFAULT_STRING_VALUE;


    protected AbstractEquipment(String brand) {
        this.brand = brand;
        this.id = staticId;
        staticId++;
        staticEquipments.put(id, this);
    }

    public T condition(CONDITION condition){
        this.condition = condition;
        return (T) this;
    }

    public T informations(String informations){
        this.information = informations;
        return (T)this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEquipment)) return false;

        AbstractEquipment<?> that = (AbstractEquipment<?>) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Objet : " + getClass().getSimpleName() + "\n");
        stringBuilder.append("Id : "                + id            + "\n");
        stringBuilder.append("Marque : "            + brand         + "\n");
        stringBuilder.append("Etat : "              + condition + "\n");
        stringBuilder.append("Info. supp. : "       + information + "\n");
        return stringBuilder.toString();
    }
}
