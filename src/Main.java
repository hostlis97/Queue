import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> person = (Queue<Person>) generateClients();

        while (!person.isEmpty()) {
            Person client = person.poll();
            System.out.println(client.firstName + " " + client.lastName + " " + "прокатился на аттракционе");
            client.useTicket();
            if (client.tickets > 0) {
                person.offer(client);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> client = new LinkedList<>();
        client.add(new Person("Иванов", "Иван", 2));
        client.add(new Person("Петров", "Петр", 1));
        client.add(new Person("Сидоров", "Артем", 4));
        client.add(new Person("Орлов", "Алексей", 3));
        return client;
    }
}
