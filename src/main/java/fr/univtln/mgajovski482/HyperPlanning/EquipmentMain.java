package fr.univtln.mgajovski482.HyperPlanning;

import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Generator.EquipmentGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Generator.RoomGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Room;
import fr.univtln.mgajovski482.HyperPlanning.Schedule.Generator.ScheduleGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Schedule.Schedule;

import java.util.logging.Logger;

/**
 * Created by Maxime on 26/10/2015.
 */
public class EquipmentMain {

    private static Logger logger = Logger.getLogger("EquipmentMain.class");

    private static volatile EquipmentMain _instance = null;

    public EquipmentMain() throws Exception {

        EquipmentGenerator.generateEquipments(
                Consts.COMPUTERS_TO_GENERATE,
                Consts.PROJECTORS_TO_GENERATE);

        RoomGenerator.generateRooms(
                Consts.ROOMS_TO_GENERATE);

        for(int i = 0; i < 10; i++)
            ScheduleGenerator.generateSchedule();

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
