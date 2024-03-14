package lab_list2;

import java.io.Serializable;

public abstract class Worker implements Serializable {
    private String name, surname, position;
    private long pesel;
    private int internship;
    Worker(String name, String surname, String position, long pesel, int internship){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.pesel = pesel;
        this.internship = internship;
    }
    abstract int salary();
    public void show() { System.out.println(this); }
    @Override
    public String toString() {
        int howManySpaces1 = 15 - name.length();
        int howManySpaces2 = 15 - surname.length();
        int howManySpaces3 = 15 - position.length();
        int howManySpaces4 = 15 - String.valueOf(pesel).length();
        int howManySpaces5 = 15 - String.valueOf(internship).length();
        int howManySpaces6 = 15 - String.valueOf(salary()).length();
        return String.format("|%s%s|%s%s|%s%s|%s%d|%s%d|%s%d|",
                name," ".repeat(howManySpaces1), surname," ".repeat(howManySpaces2), position," ".repeat(howManySpaces3)," ".repeat(howManySpaces4), pesel," ".repeat(howManySpaces5), internship," ".repeat(howManySpaces6), salary());
    }
}
