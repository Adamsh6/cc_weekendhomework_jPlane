public enum PlaneType {
    BOEING747(80, 1000),
    AIRBUS380(20, 500),
    CONCORDE(5, 600),
    DOUGLASDC3(3, 400);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
