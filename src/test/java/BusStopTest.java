import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;

    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Baird's Way");
        person = new Person();
    }

    @Test
    public void addToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removeFromQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.queueCount());
    }
}
