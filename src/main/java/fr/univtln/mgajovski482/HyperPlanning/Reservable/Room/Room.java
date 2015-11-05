package fr.univtln.mgajovski482.HyperPlanning.Reservable.Room;

import fr.univtln.mgajovski482.HyperPlanning.Reservable.Reservable;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Room est la classe representant les salles de cours.</b>
 * <p>
 * Une salle de cours est caracterisee par les informations suivantes :
 * <ul>
 *     <li>Un id unique, qui est le nom de la salle (String)</li>
 *     <li>Une capacite d'accueil                   (Int)</li>
 * </ul>
 *
 * <p>
 * Les salles sont differenties à l'aide d'un id auto-incremental.
 * Les differentes salles sont stockees à partir d'une Map.
 *
 *
 * @author Maxime
 */


public class Room implements Reservable{

    public static Map<String, Room> staticRoomMap
            = new HashMap<String, Room>();

    private final String  id;
    private int     capacity;

    public Room(String id, int capacity){
        this.id         = id;
        this.capacity   = capacity;
        staticRoomMap.put(id, this);
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        return id.equals(room.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nom de la salle : " + id + "\n");
        stringBuilder.append("Capacité : " + capacity + "\n");
        return stringBuilder.toString();
    }
}
