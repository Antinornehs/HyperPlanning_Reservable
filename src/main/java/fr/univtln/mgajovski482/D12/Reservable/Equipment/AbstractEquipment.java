package fr.univtln.mgajovski482.D12.Reservable.Equipment;

import fr.univtln.mgajovski482.D12.Reservable.Reservable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maxime on 18/10/2015.
 */
public abstract class AbstractEquipment<T extends AbstractEquipment<?>> implements Reservable {

    public enum CONDITION {UNKNOWN, OLD, STANDARD, NEW;

        public static CONDITION getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }}

    protected   static int  staticId = 0;
    private     static List<AbstractEquipment> staticEquipments = new ArrayList<AbstractEquipment>();

    protected CONDITION         condition;
    protected int               id;
    protected String            brand;
    protected String            information = "";


    protected AbstractEquipment() {
        this.id = staticId;
        staticId++;
        staticEquipments.add(this);
    }

    public T brand(String brand){
        this.brand = brand;
        return  (T)this;
    }

    public T condition(CONDITION condition){
        this.condition = condition;
        return (T) this;
    }

    public T informations(String informations){
        this.information = informations;
        return (T)this;
    }

    public static List<AbstractEquipment> getStaticEquipments() {
        return staticEquipments;
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
