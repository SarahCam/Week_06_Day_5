import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom singleBedRoom, doubleBedRoom, familyBedRoom;
    Guest guest1, guest2;

    @Before
    public void before(){
        singleBedRoom = new BedRoom(RoomType.SINGLE, 109.00, 101);
        doubleBedRoom = new BedRoom(RoomType.DOUBLE, 129.00, 102);
        familyBedRoom = new BedRoom(RoomType.FAMILY, 159.00, 103);
        guest1 = new Guest("Mary Poppins");
        guest2 = new Guest("Willy Wonka");
    }

    @Test
    public void canGetType(){
        assertEquals(RoomType.SINGLE, singleBedRoom.getType());
        assertEquals(RoomType.DOUBLE, doubleBedRoom.getType());
        assertEquals(RoomType.FAMILY, familyBedRoom.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, singleBedRoom.getCapacity());
        assertEquals(2, doubleBedRoom.getCapacity());
        assertEquals(4, familyBedRoom.getCapacity());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Single", singleBedRoom.getTitle());
        assertEquals("Double", doubleBedRoom.getTitle());
        assertEquals("Family", familyBedRoom.getTitle());
    }

    @Test
    public void canGetRate(){
        assertEquals(109.00, singleBedRoom.getRate(), 0.01);
        assertEquals(129.00, doubleBedRoom.getRate(), 0.01);
        assertEquals(159.00, familyBedRoom.getRate(), 0.01);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(101, singleBedRoom.getRoomNumber());
        assertEquals(102, doubleBedRoom.getRoomNumber());
        assertEquals(103, familyBedRoom.getRoomNumber());
    }

    @Test
    public void canAddGuest(){
        singleBedRoom.addGuest(guest1);
    }

    @Test
    public void canGetGuests___SINGLE_BEDROOM(){
        singleBedRoom.addGuest(guest1);
        assertEquals(1, singleBedRoom.getGuests().size());
    }

    @Test
    public void canAddGuests___UP_TO_ROOM_CAPACITY_ONLY(){
        assertEquals(true, singleBedRoom.addGuest(guest1));
        assertEquals(false, singleBedRoom.addGuest(guest2));
        assertEquals(1, singleBedRoom.getGuests().size());
    }

    @Test
    public void canGetGuestNames(){
        doubleBedRoom.addGuest(guest1);
        doubleBedRoom.addGuest(guest2);
        assertArrayEquals(new String[]{"Mary Poppins", "Willy Wonka"}, doubleBedRoom.getGuestNames());
    }
}
