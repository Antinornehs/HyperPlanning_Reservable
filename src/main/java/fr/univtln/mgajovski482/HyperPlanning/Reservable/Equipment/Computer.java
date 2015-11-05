<<<<<<< HEAD
package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment;

/**
 * Created by Maxime on 18/10/2015.
 */
public class Computer  extends AbstractEquipment<Computer>{

    public  enum OS{UNKNOWN, LINUX, WINDOWS, IOS;

        public static OS getRandom() {

            return values()[(int) (Math.random() * values().length)];
        }
    }

    private OS os;

    public Computer(String brand){
        super(brand);
    }

    public Computer os(OS os){
        this.os = os;
        return this;
    }

    public Computer build(){
        return this;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Os : " + os + "\n\n");
        return super.toString() + stringBuilder.toString();
    }
}
=======
package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment;

/**
 * <p>
 * <b>Computer est la classe representant les ordinateurs, il etend AbstractEquipment</b>
 * Un ordinateur est caracterise par les informations suivantes :
 * <ul>
 *     <li>Son Os : UNKNOWN, LINUX, WINDOWS, IOS    (OS)</li>
 *     <li>Sa marque                                (String)</li>
 * </ul>
 *
 * @see AbstractEquipment
 * @author Maxime
 */


public class Computer  extends AbstractEquipment<Computer>{

    public  enum OS{UNKNOWN, LINUX, WINDOWS, IOS;

        public static OS getRandom() {

            return values()[(int) (Math.random() * values().length)];
        }
    }

    private OS os;

    public Computer(String brand){
        super(brand);
    }

    public Computer os(OS os){
        this.os = os;
        return this;
    }

    public Computer build(){
        return this;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Os : " + os + "\n\n");
        return super.toString() + stringBuilder.toString();
    }
}
>>>>>>> ed137d0fc0e52efc2f8369eac73f5c8820af76bb
