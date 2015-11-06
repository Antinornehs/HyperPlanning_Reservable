package fr.univtln.mgajovski482.HyperPlanning.Other;

/**
 * <b>Consts est une classe contenant toutes les constantes propres à son package</b>
 * <p>
 * Il contient notamment des constantes liees aux:
 * <ul>
 *     <li>Salles</li>
 *     <li>Tranches Horaires</li>
 *     <li>Equipements (Computer, Projectors)</li>
 *     <li>Autres...</li>
 *</ul>
 *
 * @author Maxime
 */

public class Consts {

    public static String DEFAULT_STRING_VALUE = "ND";

    public static final int MIN_ROOM_CAPACITY   = 10;
    public static final int MAX_ROOM_CAPACITY   = 50;
    public static final int ROOM_NAME_LENGTH    = 4;

    public static final int ROOMS_TO_GENERATE       = 300;
    public static final int COMPUTERS_TO_GENERATE   = 100;
    public static final int PROJECTORS_TO_GENERATE  = 100;

    public static final int MIN_DAY_TO_ADD = 1;
    public static final int MAX_DAY_TO_ADD = 200;

    public static final int ENDING_SCHOOL_HOUR      = 16;
    public static final int BEGINNING_SCHOOL_HOUR   = 8;

    public static final int MAX_HOUR_TO_TEACH       = 4;
    public static final int MIN_HOUR_TO_TEACH       = 1;
}
