public class AssignmentTwo {
    public static void main(String[] args) {
        // You can call testing methods here later
    }

    public void partThree() {
        Employee operator = new Employee("Chloe", 29, "Sydney CBD", "E101", "Ride Operator");
        Ride ride = new Ride("Superman Escape", 100, 150, operator);

        // Create 5 Visitors
        Visitor v1 = new Visitor("Liam", 19, "Bondi Beach", "A001", "Fun");
        Visitor v2 = new Visitor("Olivia", 21, "Melbourne Central", "A002", "Adventure");
        Visitor v3 = new Visitor("Noah", 23, "Brisbane South", "A003", "Thrill");
        Visitor v4 = new Visitor("Isla", 18, "Perth City", "A004", "Family Time");
        Visitor v5 = new Visitor("Jack", 20, "Adelaide Hills", "A005", "Challenge");

        // Add Visitors to the Queue
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        // Remove one Visitor
        ride.removeVisitorFromQueue();

        // Print the queue
        ride.printQueue();

    }

    public void partFourA() {
  
    }

    public void partFourB() {
  
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
