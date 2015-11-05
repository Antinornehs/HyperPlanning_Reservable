package fr.univtln.mgajovski482.HyperPlanning.Schedule;

import java.util.Calendar;

/**
 * <b>Schedule est la classe représentant des tranches horaires</b>
 * <p>
 * Une tranche horaire est caractérisée par les informations suivantes :
 * <ul>
 *     <li>Un calendrier de début   (fromCalendar)</li>
 *     <li>Un calendrier de fin     (toCalendar)</li>
 * </ul>
 *
 * @author Maxime
 */

public class Schedule {

    private String[] months = {
            "Janvier","Février","Mars","Avril",
            "Mai","Juin","Juillet","Aout","Septembre",
            "Octobre","Novembre","Décembre"
    };


    private Calendar fromCalendar;
    private Calendar toCalendar;

    public Schedule(Calendar fromCalendar, Calendar toCalendar){
        this.fromCalendar   = fromCalendar;
        this.toCalendar     = toCalendar;
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

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tranche horaire : \n");
        stringBuilder.append("Du "  + fromCalendar.get(Calendar.DAY_OF_MONTH));
        stringBuilder.append(" "    + months[fromCalendar.get(Calendar.MONTH)]);
        stringBuilder.append(" "    + fromCalendar.get(Calendar.YEAR));
        stringBuilder.append(" à "   + fromCalendar.get(Calendar.HOUR) + "h");
        stringBuilder.append((fromCalendar.get(Calendar.AM_PM) == Calendar.AM ? " du matin" : " de l'après - midi")+"\n");

        stringBuilder.append("Au "  + toCalendar.get(Calendar.DAY_OF_MONTH));
        stringBuilder.append(" "    + months[toCalendar.get(Calendar.MONTH)]);
        stringBuilder.append(" "    + toCalendar.get(Calendar.YEAR));
        stringBuilder.append(" à "   + toCalendar.get(Calendar.HOUR) + "h");
        stringBuilder.append((toCalendar.get(Calendar.AM_PM) == Calendar.AM ? " du matin" : " de l'après - midi")+"\n");
        return stringBuilder.toString();
    }
}
