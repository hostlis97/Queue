public class Person {
    protected String lastName;
    protected String firstName;
    protected int tickets;

    public Person(String lastName, String firstName, int tickets) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.tickets = tickets;
    }

    public void useTicket() {
        this.tickets--;
    }
}
