package fr.univtln.mgajovski482.D12.Reservable.Equipment;

import fr.univtln.mgajovski482.D12.Other.Consts;
import fr.univtln.mgajovski482.D12.Reservable.Reservable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Maxime on 18/10/2015.
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
