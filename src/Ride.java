import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private int minHeightRequirement;
    private int maxRider;      // Max visitors per cycle
    private int numOfCycles;   // Number of times the ride has been run
    private Employee rideOperator;

    // Declared now for upcoming parts
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, int minHeightRequirement, int maxRider,  Employee rideOperator) {
        this.rideName = rideName;
        this.minHeightRequirement = minHeightRequirement;
        this.maxRider = maxRider;
        this.rideOperator = rideOperator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
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
        if (visitor != null) {
            queue.offer(visitor); 
            System.out.println("Visitor " + visitor.getName() + " added to the queue.");
        } else {
            System.out.println("Cannot add a null visitor to the queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removed = queue.poll(); 
        if (removed != null) {
            System.out.println("Visitor " + removed.getName() + " removed from the queue.");
        } else {
            System.out.println("Queue is empty. No visitor to remove.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("Current visitors in the queue:");
            for (Visitor v : queue) {
                System.out.println("- " + v.getName() + " (Ticket: " + v.getTicketNumber() + ")");
            }
        }
    }


    @Override
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("Ride cannot run. No ride operator assigned.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("Ride cannot run. Queue is empty.");
            return;
        }

        int count = 0;
        while (!queue.isEmpty() && count < maxRider) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
            System.out.println("Visitor " + visitor.getName() + " took the ride.");
            count++;
        }

        numOfCycles++;
        System.out.println("Ride has been run. Total cycles completed: " + numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " added to ride history.");
        } else {
            System.out.println("Cannot add null visitor to ride history.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.println("Visitor " + visitor.getName() + 
            (found ? " is in" : " is NOT in") + " the ride history.");
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println("Total number of visitors in ride history: " + count);
        return count;
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors in ride history.");
            return;
        }

        System.out.println("Visitors who took the ride:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor v = iterator.next();
            System.out.println("- " + v.getName() + " (Ticket: " + v.getTicketNumber() + ")");
        }
    }

    public void sortRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("Cannot sort. Ride history is empty.");
            return;
        }

        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history has been sorted by name and ticket number.");
    }

    public int getNumOfCycles() { return numOfCycles; }
    public void setNumOfCycles(int numOfCycles) { this.numOfCycles = numOfCycles; }

    public int getMaxRider() { return maxRider; }
    public void setMaxRider(int maxRider) { this.maxRider = maxRider; }
}
