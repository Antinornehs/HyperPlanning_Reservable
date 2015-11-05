package fr.univtln.mgajovski482.HyperPlanning.Class;

import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Room;
import fr.univtln.mgajovski482.HyperPlanning.Schedule.Schedule;
import fr.univtln.mgajovski482.HyperPlanning.TeachingUnit;
import fr.univtln.mgajovski482.HyperPlanning.User.RegisteredUser.Teacher;

import java.util.*;

/**
 * <b>Course est la classe representant les cours dispenses au sein d'un etablissement</b>
 * <p>
 * Un cours est caractérise par les informations suivantes :
 * <ul>
 *     <li>Une unite d'enseignement (TeachingUnit)</li>
 *     <li>Une salle                (Room)</li>
 *     <li>Une tranche horaire      (Schedule)</li>
 *     <li>Un type de cours         (Type) qui peut etre un TP, TD ou un CM.</li>
 *     <li>Un professeur            (Teacher)</li>
 *     <li>Un etat de validation    (isValidated)</li>
 * </ul>
 *
 * <p>
 * Les cours sont differenties à l'aide d'un id auto-incremental.
 * Les differents cours sont stockes à partir d'une Map.
 *
 * @author Maxime
 */


public class Course {

    public enum TYPE{
        TD  ("TD"),
        CM  ("CM"),
        TP  ("TP") ;

        private String name;

        private static final List<TYPE> VALUES =
                Collections.unmodifiableList(Arrays.asList(TD, CM, TP));
        private static final int            SIZE = values().length - 1;
        private static final Random         RANDOM = new Random();


        TYPE(String name){
            this.name = name;
        }

        public static TYPE randomType()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }

    }

    public static Map<Integer, Course> staticClassMap = new HashMap<Integer, Course>();
    public static int ID = 0;


    private final int id;
    private TeachingUnit    teachingUnit;
    private Room            classRoom;
    private Schedule        schedule;
    private TYPE            type;
    private boolean         isValidated;
    private Teacher         teacher;

    public Course(){
        this.id = ID;
        staticClassMap.put(id, this);
        ID++;
    }

    public Course teacher(Teacher teacher){
        this.teacher = teacher;
        return this;
    }

    public Course type(TYPE type){
        this.type = type;
        return this;
    }

    public Course schedule(Schedule schedule){
        this.schedule = schedule;
        return this;
    }

    public Course classRoom(Room classRoom){
        this.classRoom = classRoom;
        return this;
    }

    public Course teachingUnit(TeachingUnit teachingUnit){
        this.teachingUnit = teachingUnit;
        return this;
    }

    public boolean isValidated(){
        return isValidated;
    }

    public void setIsValidated(boolean bool){
        this.isValidated = bool;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public Room getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Room classRoom) {
        this.classRoom = classRoom;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public TeachingUnit getTeachingUnit() {
        return teachingUnit;
    }

    public void setTeachingUnit(TeachingUnit teachingUnit) {
        this.teachingUnit = teachingUnit;
    }

    @Override
    public String toString() {

        String teacherLastName  = teacher.getRuPersonalLogs().getLastName();
        String teacherFirstName = teacher.getRuPersonalLogs().getFirstName();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ce cours de : "       + teachingUnit.getLabel()   + "\n");
        stringBuilder.append("Est un : "            + getType().name            + "\n");
        stringBuilder.append("Dispensé par : "      + teacherFirstName + " " + teacherLastName + "\n");
        stringBuilder.append("Il aura lieu : \t"    + classRoom.getId() + "\n");
        stringBuilder.append(schedule);
        return stringBuilder.toString();
    }
}
