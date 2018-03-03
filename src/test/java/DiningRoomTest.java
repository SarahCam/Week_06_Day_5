import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom mainBar, conservatory, formalDining;

    @Before
    public void before(){
        mainBar      = new DiningRoom(RoomType.SMALL_DINING, "Main Bar");
        conservatory = new DiningRoom(RoomType.MEDIUM_DINING, "Conservatory");
        formalDining = new DiningRoom(RoomType.LARGE_DINING, "Main Dining Room");
    }

    @Test
    public void canGetType(){
        assertEquals(RoomType.SMALL_DINING, mainBar.getType());
        assertEquals(RoomType.MEDIUM_DINING, conservatory.getType());
        assertEquals(RoomType.LARGE_DINING, formalDining.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(30, mainBar.getCapacity());
        assertEquals(70, conservatory.getCapacity());
        assertEquals(200, formalDining.getCapacity());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Small Dining Room", mainBar.getTitle());
        assertEquals("Medium Dining Room", conservatory.getTitle());
        assertEquals("Large Dining Room", formalDining.getTitle());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Main Bar", mainBar.getRoomName());
        assertEquals("Conservatory", conservatory.getRoomName());
        assertEquals("Main Dining Room", formalDining.getRoomName());
    }
}
