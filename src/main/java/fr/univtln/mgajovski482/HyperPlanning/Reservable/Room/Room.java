package fr.univtln.mgajovski482.HyperPlanning.Reservable.Room;

import fr.univtln.mgajovski482.HyperPlanning.Reservable.Reservable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maxime on 18/10/2015.
 */

public class Room implements Reservable{

    public static Map<String, Room> staticRoomMap = new HashMap<String, Room>();

    private String  id;
    private int     capacity;

    public Room(String id, int capacity){
        this.id         = id;
        this.capacity   = capacity;
        staticRoomMap.put(id, this);
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
