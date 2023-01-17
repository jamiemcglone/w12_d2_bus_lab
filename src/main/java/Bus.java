import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if (this.countPassengers() < this.capacity) {
        this.passengers.add(person);}
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUpFromStop(BusStop busStop){
        Person person = busStop.removePerson();
        this.passengers.add(person);
    }
}
