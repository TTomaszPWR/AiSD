package lab_list2;

public class HourlyWorker extends Worker{
    private int hours;
    private double baseHourSalary;
    HourlyWorker(String name, String surname, String position, long pesel, int internship, int hours, double baseHourSalary){
        super(name, surname, position, pesel, internship);
        this.hours = hours;
        this.baseHourSalary = baseHourSalary;
    }
    @Override
    int salary() {
        return hours*(int)baseHourSalary;
    }
    public int getHours() {
        return hours;
    }
    public double getBaseHourSalary() {
        return baseHourSalary;
    }
}
