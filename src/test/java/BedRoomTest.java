import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom singleBedRoom;

    @Before
    public void before(){
        singleBedRoom = new BedRoom(RoomType.SINGLE);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, singleBedRoom.getCapacity());
    }
}
