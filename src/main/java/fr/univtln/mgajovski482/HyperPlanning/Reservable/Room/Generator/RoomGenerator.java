package fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Generator;


import fr.univtln.mgajovski482.HyperPlanning.Other.Consts;
import fr.univtln.mgajovski482.HyperPlanning.Reservable.Room.Room;

import java.util.Random;

/**
 * Created by Maxime on 04/11/2015.
 */
public class RoomGenerator {

    private static final char[] letters;
    private static final char[] numbers;
    private static final Random random = new Random();

    static{
        StringBuilder lettersTemp = new StringBuilder();
        StringBuilder numbersTemp= new StringBuilder();

        for(char ch = 'A'; ch <= 'Z'; ch++)
            lettersTemp.append(ch);

        for(char ch = '0'; ch <= '9'; ch++)
            numbersTemp.append(ch);

        letters = lettersTemp.toString().toCharArray();
        numbers = numbersTemp.toString().toCharArray();
    }

    public static String getRandomRoomName(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(letters[random.nextInt(letters.length)]);
        for(int i = 0; i < Consts.ROOM_NAME_LENGTH - 1; i++)
            stringBuilder.append(numbers[random.nextInt(numbers.length)]);

        return stringBuilder.toString();
    }

    public static int getRandomCapacity (int minCapacity, int MaxCapacity){
        if (minCapacity < MaxCapacity)
            return minCapacity + new Random().nextInt(Math.abs(MaxCapacity - minCapacity));
        return minCapacity - new Random().nextInt(Math.abs(MaxCapacity - minCapacity));
    }

    public static void generateRooms(int numberOfRooms){
        Room currentRoom;
        for(int i = 0; i < numberOfRooms; i++)
            currentRoom = new Room(
                    getRandomRoomName(),
                    getRandomCapacity(
                            Consts.MIN_ROOM_CAPACITY,
                            Consts.MAX_ROOM_CAPACITY));
    }
}
