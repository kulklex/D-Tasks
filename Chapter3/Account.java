package Chapter3;

public class Account {
    private String firstName; //instance variables
    private String surName;

    public Account(String firstName, String surName){
        this.firstName = firstName;
        this.surName = surName;
    }

    public void setName(String name, String surName){
        firstName = name; //store the name
        this.surName = surName; //store the surname
    }

    public String getName(){
        return firstName + " " + surName;
    }
}
