public class Visitor extends Person {
    private String ticketNumber;
    private String visitPurpose;

    public Visitor() {}

    public Visitor(String name, int age, String address, String ticketNumber, String visitPurpose) {
        super(name, age, address);
        this.ticketNumber = ticketNumber;
        this.visitPurpose = visitPurpose;
    }

    // Getters and setters
    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    public String getVisitPurpose() { return visitPurpose; }
    public void setVisitPurpose(String visitPurpose) { this.visitPurpose = visitPurpose; }
}
