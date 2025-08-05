import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private int minHeightRequirement;
    private Employee rideOperator;

    // Declared now for upcoming parts
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, int minHeightRequirement, Employee rideOperator) {
        this.rideName = rideName;
        this.minHeightRequirement = minHeightRequirement;
        this.rideOperator = rideOperator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getters and Setters
    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public int getMinHeightRequirement() { return minHeightRequirement; }
    public void setMinHeightRequirement(int minHeightRequirement) {
        this.minHeightRequirement = minHeightRequirement;
    }

    public Employee getRideOperator() { return rideOperator; }
    public void setRideOperator(Employee rideOperator) { this.rideOperator = rideOperator; }

    // Interface Method Stubs – to be implemented in later parts

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        // Implementation in Part 3
    }

    @Override
    public void removeVisitorFromQueue() {
        // Implementation in Part 3
    }

    @Override
    public void printQueue() {
        // Implementation in Part 3
    }

    @Override
    public void runOneCycle() {
        // Implementation in Part 5
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        // Implementation in Part 4A
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        // Implementation in Part 4A
        return false;
    }

    @Override
    public int numberOfVisitors() {
        // Implementation in Part 4A
        return 0;
    }

    @Override
    public void printRideHistory() {
        // Implementation in Part 4A
    }
}
