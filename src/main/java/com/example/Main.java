package main.java.com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee apple = new Employee(666, "manager", 26, "apple", "male", 230, 71.5);
        Employee banana = new Employee(696, "accountant", 20, "banana", "female", 155, 89);
        Guest kiwi = new Guest(222, true, 20, "apple", "apple", 190, 72.5);
        Guest peach = new Guest(333, true, 35, "peach", "male", 170, 80);
        Hotel pitbull = new Hotel("APCSA");
        Room regular = new Room(2, 40, false);
        Room balance = new Room(2, 100, false);
        Room economy = new Room(2, 300, false);
        Room suite = new Room(2, 500, false);
        Room deluxe = new Room(2, 1000, false);
        Room ultradeluxe = new Room(2, 2000, false);
        ArrayList<Room> rooms = new ArrayList<Room>();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Guest> guestlist = new ArrayList<Guest>();
        employees.add(apple);
        employees.add(banana);
        pitbull.addEmployee(apple);
        pitbull.addEmployee(banana);
        guestlist.add(kiwi);
        guestlist.add(peach);
        rooms.add(economy);
        rooms.add(regular);
        rooms.add(deluxe);
        rooms.add(balance);
        rooms.add(suite);
        rooms.add(ultradeluxe);
        pitbull.setRoomList(rooms);
        System.out.println(pitbull.book(guestlist, 50));
    }

}
