package lab_list2;

public class Main {
    public static void main(String[] args) {

        Worker[] workers = new Worker[4];
        workers[0] = new FullTimeWorker("Jan", "Kowalski", "Manager", 12345678901L, 5, Status.FULLTIME, 5000);
        workers[1] = new FullTimeWorker("Anna", "Nowak", "Secretary", 12345678902L, 3, Status.THREEFOURTHS, 3000);
        workers[2] = new HourlyWorker("Piotr", "Kowalczyk", "Driver", 12345678903L, 1, 160, 20);
        workers[3] = new HourlyWorker("Katarzyna", "Wójcik", "Cleaner", 12345678904L, 2, 120, 15);
        ArrayIterator iterator = new ArrayIterator(workers);

        while (iterator.hasNext()) {
            iterator.next().show();
        }
    }
}
