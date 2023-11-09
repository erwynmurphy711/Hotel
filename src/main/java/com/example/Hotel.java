package main.java.com.example;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomlist;
    private String name;
    private ArrayList<Employee> employeelist;

    public Hotel(String name) {
        this.name = name;
        this.roomlist = new ArrayList<Room>();
        this.employeelist = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        this.employeelist.add(employee);
    }

    // add employee
    public void removeEmployee(Employee employee) {
        this.employeelist.remove(employee);
    }

    // remove employee
    public ArrayList<Employee> getEmployeelist() {
        return this.employeelist;
    }

    // getters
    public ArrayList<Room> getRoomList() {
        return this.roomlist;
    }

    // setters
    public void setRoomList(ArrayList<Room> roomlist) {
        this.roomlist = roomlist;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean book(ArrayList<Guest> guests, double budget) {
        ArrayList<Room> available = new ArrayList<Room>();
        ArrayList<Room> bookingrooms = new ArrayList<Room>();
        int count = 0;
        double price = 0;
        int guestcount = 0;

        // Making a list for all rooms not currently occupied >
        for (Room room : this.roomlist) {
            if (room.getOccupied() == false) {
                available.add(room);
            }
        }

        // Bubble sorting >
        for (int i = 0; i < available.size(); i++) {
            for (int j = 0; j < available.size() - 1 - i; j++) {
                if (available.get(j).getPrice() > available.get(j + 1).getPrice()) {
                    Room temp = available.get(j);
                    available.set(j, available.get(j + 1));
                    available.set(j + 1, temp);
                }
            }
        }

        // Making a new list of rooms for the amount of guests booking >
        for (int i = 0; count < guests.size(); i++) {
            if (count > guests.size()) {
                break;
            }
            count += available.get(i).getOccupancy();
            bookingrooms.add(available.get(i));
        }

        // Getting the price of the new list of rooms >
        for (int i = 0; i < bookingrooms.size(); i++) {
            price += bookingrooms.get(i).getPrice();
        }

        // Conditional for if the budget is enough for all the rooms >
        if (budget > price) {

            // If conditional is true then set all rooms in the new list to occupied since-
            // its booked >
            for (int i = 0; i < bookingrooms.size(); i++) {
                bookingrooms.get(i).setOccupied(true);
                // spread the guests across the rooms
                // room.add(guest)
                for (int j = 0; j < guests.size(); j++) {
                    bookingrooms.get(i).addGuest(guests.get(j));
                    guestcount++;
                    guests.remove(j);
                    j--;
                    if (guestcount == bookingrooms.get(i).getOccupancy()) {
                        break;
                    }
                }
            }

            // Printing out the information for me >
            for (int i = 0; i < roomlist.size(); i++) {
                ArrayList<Guest> guest = new ArrayList<Guest>();
                System.out.println(" ");
                System.out.println("Room " + (i + 1) + " Occupied " + roomlist.get(i).getOccupied());
                System.out.println("Price " + roomlist.get(i).getPrice());
                System.out.println("Occupancy " + roomlist.get(i).getOccupancy());
                if (roomlist.get(i).getGuestlist().size() != 0){
                    guest.addAll(roomlist.get(i).getGuestlist());
                }
                for(int j = 0; j < guest.size(); j++){
                    System.out.print("Guest " + guest.get(j).getName() + " , ");
                }
                System.out.println(" ");
            }
            return true;
        }
        return false;
    }
}