<<<<<<< HEAD
package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment;

/**
 * Created by Maxime on 18/10/2015.
 */
public class Projector extends AbstractEquipment<Projector> {


    public Projector(String brand){
        super(brand);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
=======
package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment;


/**
 * <b>Projector (Projecteur) est la classe representant les projecteurs, il étend AbstractEquipement</b>
 *
 * <p>
 * Un projecteur est caractérise par les informations suivantes :
 * <ul>
 *     <li>Sa résolution            (Int)</li>
 *     <li>Sa marque                (String)</li>
 * </ul>
 *
 * @see AbstractEquipment
 * @author Maxime
 */

public class Projector extends AbstractEquipment<Projector> {

    private int resolution;

    public Projector(String brand){
        super(brand);
        this.resolution = resolution;
    }

    public Projector resolution(int resolution){
        this.resolution = resolution;
        return this;
    }

    public int getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resolution : " + resolution);
        return super.toString() + stringBuilder.toString() ;
    }
}
>>>>>>> ed137d0fc0e52efc2f8369eac73f5c8820af76bb
