public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo a2 = new AssignmentTwo();
        a2.partThree(); // Test Part 3 here
        a2.partFourA(); // Test Part 4A here
        a2.partFourB(); // Test Part 4B here
        a2.partFive(); // Test Part 5 here

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
        Employee operator = new Employee("Ruby", 31, "Fremantle", "E103", "Ride Manager");
        Ride ride = new Ride("Green Lantern Coaster", 130, 170, operator);

        Visitor v1 = new Visitor("Harper", 21, "Wollongong", "A120", "Fun");
        Visitor v2 = new Visitor("Archie", 23, "Townsville", "A115", "Excitement");
        Visitor v3 = new Visitor("Matilda", 18, "Ballarat", "A140", "Adventure");
        Visitor v4 = new Visitor("Hudson", 25, "Cairns", "A110", "Challenge");
        Visitor v5 = new Visitor("Sienna", 22, "Launceston", "A135", "Thrill");


        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);


        ride.printRideHistory();


        ride.sortRideHistory();

        
        ride.printRideHistory();
    }


    public void partFive() {
        Employee operator = new Employee("Cooper", 34, "Sunshine Coast", "E104", "Ride Captain");
        Ride ride = new Ride("Doomsday Destroyer", 145, 4, operator ); // maxRider = 4

        // Create 10 Visitors and add them to the queue
        String[] names = {"Ella", "Hunter", "Willow", "Levi", "Emily", "Henry", "Sophie", "Charlie", "Grace", "Max"};
        String[] addresses = {"Byron Bay", "Albury", "Rockhampton", "Bendigo", "Toowoomba", "Mackay", "Shepparton", "Wagga Wagga", "Mildura", "Coffs Harbour"};
        for (int i = 0; i < 10; i++) {
            Visitor visitor = new Visitor(names[i], 18 + i, addresses[i], "A2" + String.format("%02d", i + 1), "Enjoyment");
            ride.addVisitorToQueue(visitor);
        }

        ride.printQueue();

        ride.runOneCycle();

        ride.printQueue();

        ride.printRideHistory();
    }


    public void partSix() {
        Employee operator = new Employee("Jasper", 39, "Parramatta", "E105", "Safety Lead");
        Ride ride = new Ride("Justice League Ride", 120, 3, operator);

        // Add 5 visitors to ride history
        ride.addVisitorToHistory(new Visitor("Olive", 23, "Glenelg", "A201", "Hero Fans"));
        ride.addVisitorToHistory(new Visitor("Angus", 21, "Mandurah", "A202", "Curiosity"));
        ride.addVisitorToHistory(new Visitor("Poppy", 19, "Bunbury", "A203", "Fun"));
        ride.addVisitorToHistory(new Visitor("Harvey", 36, "Alice Springs", "A204", "Family"));
        ride.addVisitorToHistory(new Visitor("Evie", 41, "Broome", "A205", "Chill"));

        // Export to file
        ride.exportRideHistory();
    }

    public void partSeven() {
    }
}
