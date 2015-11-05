package fr.univtln.mgajovski482.HyperPlanning.Schedule.Generator;

import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;
import fr.univtln.mgajovski482.HyperPlanning.Schedule.Schedule;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * <b>ScheduleGenerator est la classe générant aléatoirement différentes tranches horaires</b>
 *
 * <p>
 * Cette classe génère un premier calendrier (fromCalendar) à partir de la date courante
 * à laquelle on ajoute des jours (bornés entre : MIN_DAY_TO_ADD et MAX_DAY_TO_ADD)
 * tout en fixant une heure plausible correspondant aux heures de cours étudiantes.
 *
 * <p>
 * Un deuxième calendrier (toCalendar) copie ce premier calendrier et rajoute seulement des heures
 * (bornées entre MIN_HOUR_TO_TEACH et MAX_HOUR_TO_TEACH) correspondant aux heures de cours données.
 *
 *  @see Calendar
 *  @see Schedule
 *  @author Maxime
 */

public class ScheduleGenerator {

    public static Schedule generateSchedule(){

        Calendar fromCalendar       = Calendar.getInstance();
        Calendar toCalendar         = new GregorianCalendar();

        fromCalendar.add(
                Calendar.DAY_OF_YEAR,
                getRandomNumber(
                        Consts.MIN_DAY_TO_ADD,
                        Consts.MAX_DAY_TO_ADD));

        fromCalendar.set(
                Calendar.HOUR_OF_DAY,
                Consts.BEGINNING_SCHOOL_HOUR + getRandomNumber(0,
                        Consts.ENDING_SCHOOL_HOUR - Consts.MAX_HOUR_TO_TEACH));

        toCalendar.setTime  (fromCalendar.getTime());
        toCalendar.add      (Calendar.HOUR, getRandomNumber(
                        Consts.MIN_HOUR_TO_TEACH ,
                        Consts.MAX_HOUR_TO_TEACH));

       return new Schedule(fromCalendar, toCalendar);
    }


    public static int getRandomNumber (int min, int max){
        if (min < max)
            return min + new Random().nextInt(Math.abs(max - min));
        return min - new Random().nextInt(Math.abs(max - min));
    }

}
