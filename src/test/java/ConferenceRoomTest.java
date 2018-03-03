import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom billiardRoom, drawingRoom, ballRoom;

    @Before
    public void before(){
        billiardRoom = new ConferenceRoom(RoomType.SMALL_CONFERENCE, 500.00, "Billiard Room");
        drawingRoom  = new ConferenceRoom(RoomType.MEDIUM_CONFERENCE, 1000.00, "Drawing Room");
        ballRoom     = new ConferenceRoom(RoomType.LARGE_CONFERENCE, 2000.00, "Ball Room");
    }

    @Test
    public void canGetType(){
        assertEquals(RoomType.SMALL_CONFERENCE, billiardRoom.getType());
        assertEquals(RoomType.MEDIUM_CONFERENCE, drawingRoom.getType());
        assertEquals(RoomType.LARGE_CONFERENCE, ballRoom.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, billiardRoom.getCapacity());
        assertEquals(50, drawingRoom.getCapacity());
        assertEquals(100, ballRoom.getCapacity());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Small Conference Room", billiardRoom.getTitle());
        assertEquals("Medium Conference Room", drawingRoom.getTitle());
        assertEquals("Large Conference Room", ballRoom.getTitle());
    }

    @Test
    public void canGetRate(){
        assertEquals(500.00, billiardRoom.getRate(), 0.01);
        assertEquals(1000.00, drawingRoom.getRate(), 0.01);
        assertEquals(2000.00, ballRoom.getRate(), 0.01);
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Billiard Room", billiardRoom.getRoomName());
        assertEquals("Drawing Room", drawingRoom.getRoomName());
        assertEquals("Ball Room", ballRoom.getRoomName());
    }
}
