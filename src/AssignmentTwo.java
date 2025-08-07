public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        a2.partThree(); // Test Part 3 here
        a2.partFourA(); // Test Part 4A here
        
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
        Employee operator = new Employee("Mason", 27, "Gold Coast", "E102", "Ride Attendant");
        Ride ride = new Ride("Batwing Spaceshot", 100, 130, operator);

        // Create 5 Visitors
        Visitor v1 = new Visitor("Ava", 20, "Darwin Waterfront", "A010", "Excitement");
        Visitor v2 = new Visitor("Lucas", 22, "Canberra City", "A011", "Fun");
        Visitor v3 = new Visitor("Mia", 19, "Hobart Bay", "A012", "Thrill");
        Visitor v4 = new Visitor("Ethan", 24, "Geelong", "A013", "Challenge");
        Visitor v5 = new Visitor("Zoe", 18, "Newcastle", "A014", "Adventure");

        // Add them to ride history
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // Check if a visitor is in history
        ride.checkVisitorFromHistory(v3); // Should be found

        // Get total number of visitors
        ride.numberOfVisitors();

        // Print ride history
        ride.printRideHistory();
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
