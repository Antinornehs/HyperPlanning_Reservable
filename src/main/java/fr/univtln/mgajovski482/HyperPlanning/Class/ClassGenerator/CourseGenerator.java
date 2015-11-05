package fr.univtln.mgajovski482.HyperPlanning.Class.ClassGenerator;

import fr.univtln.mgajovski482.HyperPlanning.Class.Course;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Room;
import fr.univtln.mgajovski482.HyperPlanning.Schedule.Generator.ScheduleGenerator;
import fr.univtln.mgajovski482.HyperPlanning.TeachingUnit;
import fr.univtln.mgajovski482.HyperPlanning.User.RegisteredUser.Teacher;

import java.util.Random;

/**
 * <b>CourseGenerator est la classe generant aleatoirement differents cours</b>
 * <p>
 * Cette classe recupere les maps des :
 * <ul>
 *     <li>Professeurs                  (Teacher.staticTeacherMap)</li>
 *     <li>Des unités d'enseignements   (TeachingUnit.teachingUnitMap)</li>
 *     <li>Salles                       (Room.staticRoomMap)</li>
 * </ul>
 *
 * Afin de tirer aléatoirement parmis les valeurs disponibles
 *
 *  @see Course
 *  @author Maxime
 */


public class CourseGenerator {

    private static Random random
            = new Random();

    private static Teacher[] teachers =
            Teacher.staticTeacherMap.values().toArray(new Teacher[0]);

    private static Room[] rooms =
            Room.staticRoomMap.values().toArray(new Room[0]);

    private static TeachingUnit[] teachingUnits  =
            TeachingUnit.teachingUnitMap.values().toArray (new TeachingUnit[0]);

    public static Course generateCourse(){

        int randomTeacherIndex      = random.nextInt(teachers.length);
        int randomRoomIndex         = random.nextInt(rooms.length);
        int randomTeachingUnitIndex = random.nextInt(teachingUnits.length);

        return new Course()
                .teacher(teachers[randomTeacherIndex])
                .schedule(ScheduleGenerator.generateSchedule())
                .classRoom(rooms[randomRoomIndex])
                .type(Course.TYPE.randomType())
                .teachingUnit(teachingUnits[randomTeachingUnitIndex]);
    }
    public static void generateCourses(int courses){
        for(int i = 0; i < courses; i++)generateCourse();
    }

    
}
