import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Bus bus2;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Bonnyrigg", 60);
        bus2 = new Bus("East Craigs", 2);
        person = new Person();
        busStop = new BusStop("Baird's Way");
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void cannotAddBusFull(){
        bus2.addPassenger(person);
        bus2.addPassenger(person);
        bus2.addPassenger(person);
        assertEquals(2, bus2.countPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canPickUp(){
        bus.pickUpFromStop(busStop);
        assertEquals(1, bus.countPassengers());
        assertEquals(0, busStop.queueCount());
    }

}
