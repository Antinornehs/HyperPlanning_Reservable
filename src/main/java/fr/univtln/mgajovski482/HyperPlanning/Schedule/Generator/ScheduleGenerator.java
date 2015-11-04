package fr.univtln.mgajovski482.HyperPlanning.Schedule.Generator;

import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by Maxime on 04/11/2015.
 */
public class ScheduleGenerator {

    public static Calendar generateSchedule(){

        Calendar fromCalendar;
        Calendar toCalendar;

        fromCalendar = Calendar.getInstance();
        fromCalendar.add(
                Calendar.DAY_OF_YEAR,
                getRandomNumber(
                        Consts.MIN_DAY_TO_ADD,
                        Consts.MAX_DAY_TO_ADD));

        fromCalendar.set(Calendar.HOUR, getRandomNumber(8, 20));


        System.out.println("Année : " + fromCalendar.get(Calendar.YEAR));
        System.out.println("Mois : "  + fromCalendar.get(Calendar.MONTH));
        System.out.println("Jour : "  + fromCalendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Heure : "  + fromCalendar.get(Calendar.HOUR) );
        System.out.println(fromCalendar.get(Calendar.AM_PM) + "\n");

        return fromCalendar;
    }


    public static int getRandomNumber (int min, int max){
        if (min < max)
            return min + new Random().nextInt(Math.abs(max - min));
        return min - new Random().nextInt(Math.abs(max - min));
    }

}
