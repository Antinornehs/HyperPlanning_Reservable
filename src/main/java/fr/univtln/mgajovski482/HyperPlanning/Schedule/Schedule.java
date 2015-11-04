package fr.univtln.mgajovski482.HyperPlanning.Schedule;

import java.util.Calendar;

/**
 * Created by Maxime on 04/11/2015.
 */
public class Schedule {

    private Calendar fromCalendar;
    private Calendar toCalendar;

    public Schedule(Calendar fromCalendar, Calendar toCalendar){
        this.fromCalendar   = fromCalendar;
        this.toCalendar     = fromCalendar;
    }


    public Calendar getFromCalendar() {
        return fromCalendar;
    }

    public void setFromCalendar(Calendar fromCalendar) {
        this.fromCalendar = fromCalendar;
    }

    public Calendar getToCalendar() {
        return toCalendar;
    }

    public void setToCalendar(Calendar toCalendar) {
        this.toCalendar = toCalendar;
    }


}
