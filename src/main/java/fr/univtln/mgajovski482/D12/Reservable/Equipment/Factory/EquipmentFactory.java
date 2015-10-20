package fr.univtln.mgajovski482.D12.Reservable.Equipment.Factory;

import fr.univtln.mgajovski482.D12.Reservable.Equipment.AbstractEquipment;
import fr.univtln.mgajovski482.D12.Reservable.Equipment.Computer;
import fr.univtln.mgajovski482.D12.Reservable.Equipment.Projector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Maxime on 18/10/2015.
 */
public class EquipmentFactory {

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
                    = new Computer().brand(randomBrand).condition(randomCondition).os(randomOs);
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
                    = new Projector().brand(randomBrand).condition(randomCondition);
        }
    }

    public static void createEquipments(int computersToCreate, int projectorsToCreate){
        createComputers(computersToCreate);
        createProjectors(projectorsToCreate);
    }

}
