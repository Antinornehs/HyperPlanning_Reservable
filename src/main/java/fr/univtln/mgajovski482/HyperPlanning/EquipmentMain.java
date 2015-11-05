package fr.univtln.mgajovski482.HyperPlanning;

import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Generator.EquipmentGenerator;

import java.util.logging.Logger;

/**
 * Created by Maxime on 26/10/2015.
 */
public class EquipmentMain {

    private static Logger logger = Logger.getLogger("EquipmentMain.class");

    private static volatile EquipmentMain _instance = null;

    public EquipmentMain() throws Exception {

        EquipmentGenerator.generateEquipments(100,100);
        logger.info("Equipments Package Initialized !");
    }

    public static EquipmentMain getInstance() throws Exception {
        if(_instance == null) {
            synchronized (EquipmentMain.class) {
                if (_instance == null) {
                    _instance = new EquipmentMain();
                }
            }
        }
        return _instance;
    }
}
