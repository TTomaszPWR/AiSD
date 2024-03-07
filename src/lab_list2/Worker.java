package lab_list2;

public abstract class Worker {
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
        return String.format("Worker{name='%s', surname='%s', position='%s', pesel=%d, internship=%d, salary=%d}",
                name, surname, position, pesel, internship, salary());
    }
}
