package main.java.com.example;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomlist;
    private String name;

    public Hotel(String name) {
        this.name = name;
        this.roomlist = new ArrayList<Room>();
    }

    public ArrayList<Room> getRoomList() {
        return this.roomlist;
    }

    public void setRoomList(ArrayList<Room> roomlist){
        this.roomlist = roomlist;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> book(int numberofpeople, double budget) {
        ArrayList<Room> avaliable = new ArrayList<Room>();
        for (Room room : this.roomlist) {
            if (room.getOccupied() == false) {
                avaliable.add(room);
            }
        }
        for (int i = 0; i < avaliable.size(); i++) {
            for (int j = 0; j < avaliable.size() - 1 - i; j++) {
                if (avaliable.get(j).getPrice() > avaliable.get(j + 1).getPrice()) {
                    Room temp = avaliable.get(j);
                    avaliable.set(j, avaliable.get(j + 1));
                    avaliable.set(j + 1, temp);
                }
            }
        }
        return avaliable;
    }
}