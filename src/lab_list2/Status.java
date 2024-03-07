package lab_list2;

public enum Status {
    HALFTIME(0.5),
    THREEFOURTHS(0.75),
    FULLTIME(1);

    public final double fraction;

    Status(double fraction) {
        this.fraction = fraction;
    }
}
