package main.java.com.example;

public class Employee extends Person {
    private String position;
    private int ID;

    public Employee(int ID, String position, int age, String name, String sex, double height, double weight) {
        super(age, name, sex, height, weight);
        this.ID = ID;
        this.position = position;
    }
    
    public String getPosition(){
        return this.position;
    }
    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setPosition(String position){
        this.position = position;
    }
}
