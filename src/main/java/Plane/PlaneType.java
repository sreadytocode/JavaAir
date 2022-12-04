package Plane;

public enum PlaneType {
    BOEING747(366, 735000.00),
    ;

    private final int capacity;
    private final double weight;

    PlaneType(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
