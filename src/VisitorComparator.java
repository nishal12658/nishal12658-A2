import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int nameCompare = v1.getName().compareToIgnoreCase(v2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return v1.getTicketNumber().compareToIgnoreCase(v2.getTicketNumber());
    }
}
