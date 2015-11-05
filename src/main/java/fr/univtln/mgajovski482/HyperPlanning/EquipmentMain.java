package fr.univtln.mgajovski482.HyperPlanning;

import fr.univtln.mgajovski482.HyperPlanning.Class.ClassGenerator.CourseGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Generator.EquipmentGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Generator.RoomGenerator;
import java.util.logging.Logger;


/**
 * <b>EquipmentMain est la classe mere du package Reservable</b>
 * <p>
 * Cette classe qui est un singleton, génère tous les elements qui sont propres
 * au package Reservable tel que :
 * <ul>
 *     <li>Des equipements          (Computer and Projectors)</li>
 *     <li>Des salles               (Room)</li>
 *     <li>Des cours                (Course)</li>
 * </ul>
 *
 * Cette classe est appelee dans le Main de l'application.
 * <b>Attention : Cette classe doit être instaciee après les packages : </b>
 * <ul>
 *     <li>Actors : Les cours possèdent obligatoirement un Professeur;
 *     il faut donc que des acteurs soient instancies</li>
 *     <li>Formation : Les cours possedent obligatoirement une unite d'enseignement;
 *     il faut donc que des formations soient instanciees
 *     </li>
 * </ul>
 *
 * <p>
 *     Un logger a été mis en place pour verifier que le package est bien initialise.
 *
 * @see ActorsMain
 * @author Maxime
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

        CourseGenerator.generateCourses(
                Consts.COURSES_TO_GENERATE);

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
