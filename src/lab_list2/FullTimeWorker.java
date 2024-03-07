package lab_list2;

import static java.lang.Math.round;

public class FullTimeWorker extends Worker{
    private double baseSalary;
    private Status status;

    FullTimeWorker(String name, String surname, String position, long pesel, int internship, Status status, double baseSalary){
        super(name, surname, position, pesel, internship);
        this.status = status;
        this.baseSalary = baseSalary;
    }
    @Override
    int salary() {
        return (int) round(baseSalary* status.fraction);
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public Status getStatus() {
        return status;
    }
}
