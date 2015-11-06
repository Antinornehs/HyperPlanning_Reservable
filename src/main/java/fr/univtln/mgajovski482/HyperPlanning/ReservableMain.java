package fr.univtln.mgajovski482.HyperPlanning;

import fr.univtln.mgajovski482.HyperPlanning.Course.CourseGenerator.CourseGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Course.Course;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Equipment.Generator.EquipmentGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Generator.RoomGenerator;
import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;

import java.util.List;
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

    public class ReservableMain {

        private static Logger logger = Logger.getLogger("ReservableMain.class");

        private static volatile ReservableMain _instance = null;

        public ReservableMain() throws Exception {

            EquipmentGenerator.generateEquipments(
                    Consts.COMPUTERS_TO_GENERATE,
                    Consts.PROJECTORS_TO_GENERATE);

            RoomGenerator.generateRooms(Consts.ROOMS_TO_GENERATE);

            CourseGenerator.generateCourses(100);

            List<Course> courses = Course.getCoursesOfTheWeek();
            logger.info("Reservable Package Initialized !");
        }

        public static ReservableMain getInstance() throws Exception {
            if(_instance == null) {
                synchronized (ReservableMain.class) {
                    if (_instance == null) {
                        _instance = new ReservableMain();
                    }
                }
            }
            return _instance;
        }
}
