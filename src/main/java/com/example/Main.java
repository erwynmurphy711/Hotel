package main.java.com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hotel pitbull = new Hotel("APCSA");
        Room regular = new Room(2, 40, false);
        Room economy = new Room(2, 600, false);
        Room deluxe = new Room(2, 8000, false);
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(economy);
        rooms.add(regular);
        rooms.add(deluxe);
        pitbull.setRoomList(rooms);
        ArrayList<Room> order = pitbull.book(2,50);
        System.out.println(order);
        for(Room room: order){
            System.out.println(room.getPrice());
        }

    }
}
