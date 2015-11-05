<<<<<<< HEAD
package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Generator;

import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.AbstractEquipment;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Computer;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Projector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Maxime on 18/10/2015.
 */
public class EquipmentGenerator {

    private static List<String> computerBrands =
            new ArrayList<String>(Arrays.asList(
                    "Apple", "Dell", "Hp", "Msi",
                    "Samsung", "Lenovo", "Asus",
                    "Toshiba", "Acer"));

    private static List<String> projectorBrands =
            new ArrayList<String>(Arrays.asList(
                    "Acer", "Barco", "BenQ", "BoxLight",
                    "Canon", "Casio", "Christie",
                    "Dell", "Digital Projection"));

    public static void createComputers(int computersToCreate){
        String randomBrand;
        AbstractEquipment.CONDITION randomCondition;
        Computer.OS randomOs;

        Random random = new Random();

        for(int i = 0; i < computersToCreate; i++){
            randomBrand     = computerBrands.get(random.nextInt(computerBrands.size()));
            randomCondition = AbstractEquipment.CONDITION.getRandom();
            randomOs        = Computer.OS.getRandom();

            AbstractEquipment<Computer> newComputer
                    = new Computer(randomBrand).condition(randomCondition).os(randomOs);
        }
    }
    public static void createProjectors(int projectorsToCreate) {
        String randomBrand;
        AbstractEquipment.CONDITION randomCondition;
        Random random = new Random();

        for (int i = 0; i < projectorsToCreate; i++) {
            randomBrand = projectorBrands.get(random.nextInt(projectorBrands.size()));
            randomCondition = AbstractEquipment.CONDITION.getRandom();

            AbstractEquipment<Projector> newProjector
                    = new Projector(randomBrand).condition(randomCondition);
        }
    }

    public static void generateEquipments(int computersToCreate, int projectorsToCreate){
        createComputers(computersToCreate);
        createProjectors(projectorsToCreate);
    }

}
=======
package fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Generator;

import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.AbstractEquipment;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Computer;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Projector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * <b>EquipmentGenerator est une classe permettant de generer des objets qui etendent AbstractEquipment</b>
 * <p>
 * Dans cette classe se trouvent :
 * <ul>
 *     <li>Des listes de marques d'ordinateurs  (computerBrands)</li>
 *     <li>Des listes de marques de projecteurs (projectorBrands)</li>
 *     <li>Les methodes statiques permettant de créer ordinateurs et projecteurs</li>
 * </ul>
 *
 * @see AbstractEquipment
 * @see Computer
 * @see Projector
 * @author Maxime
 */
public class EquipmentGenerator {

    private static List<String> computerBrands =
            new ArrayList<String>(Arrays.asList(
                    "Apple", "Dell", "Hp", "Msi",
                    "Samsung", "Lenovo", "Asus",
                    "Toshiba", "Acer"));

    private static List<String> projectorBrands =
            new ArrayList<String>(Arrays.asList(
                    "Acer", "Barco", "BenQ", "BoxLight",
                    "Canon", "Casio", "Christie",
                    "Dell", "Digital Projection"));

    private static Random random = new Random();

    public static Computer createComputer(int computersToCreate){
        String                      randomBrand;
        AbstractEquipment.CONDITION randomCondition;
        Computer.OS                 randomOs;

        randomBrand     = computerBrands.get(random.nextInt(computerBrands.size()));
        randomCondition = AbstractEquipment.CONDITION.getRandom();
        randomOs        = Computer.OS.getRandom();

        return new Computer(randomBrand).condition(randomCondition).os(randomOs);

    }
    public static Projector createProjector(int projectorsToCreate) {
        String randomBrand;
        AbstractEquipment.CONDITION randomCondition;
        randomBrand = projectorBrands.get(random.nextInt(projectorBrands.size()));
        randomCondition = AbstractEquipment.CONDITION.getRandom();
        return new Projector(randomBrand ).condition(randomCondition);
    }

    public static void generateEquipments(int computersToCreate, int projectorsToCreate){
        for (int i = 0; i < computersToCreate; i++)     createComputer(computersToCreate);
        for (int i = 0; i < projectorsToCreate; i++)    createComputer(computersToCreate);
    }

}
>>>>>>> ed137d0fc0e52efc2f8369eac73f5c8820af76bb
