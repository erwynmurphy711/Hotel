package main.java.com.example;

public class Guest extends Person {
    private int ID;
    private boolean breakfast;

    public Guest(int ID, boolean breakfast, int age, String name, String sex, double height, double weight) {
        super(age, name, sex, height, weight);
        this.ID = ID;
        this.breakfast = true;
    }
    
    public boolean getBreakfast(){
        return this.breakfast;
    }
    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setPosition(boolean breakfast){
        this.breakfast = breakfast;
    }
}
