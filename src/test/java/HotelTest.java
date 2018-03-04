import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1, guest2;


    @Before
    public void before(){
        hotel = new Hotel();
        guest1 = new Guest("Donald Trump");
        guest2 = new Guest("Hilary Clinton");
    }

    // SIMPLE GETTER TESTS ////////////////////////////////////////////////////////

    @Test
    public void canGetBedRooms(){
        ArrayList<BedRoom> bedRooms = new ArrayList<BedRoom>();
        assertEquals(bedRooms, hotel.getBedRooms());
    }

    @Test
    public void canGetConferenceRooms(){
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void canGetDiningRooms(){
        ArrayList<DiningRoom> diningRooms = new ArrayList<DiningRoom>();
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    // BEDROOM TESTS //////////////////////////////////////////////////////////////

    @Test
    public void canAddBedRoom___SINGLE(){
        hotel.addBedRoom(RoomType.SINGLE, 109.00, 101);
        assertEquals(1, hotel.getBedRooms().size());
        assertEquals(101, hotel.getBedRooms().get(0).getRoomNumber());
        assertEquals(109.00, hotel.getBedRooms().get(0).getRate(), 0.01);
        assertEquals(RoomType.SINGLE, hotel.getBedRooms().get(0).getType());
        assertEquals("Single", hotel.getBedRooms().get(0).getTitle());
        assertEquals(1, hotel.getBedRooms().get(0).getCapacity());
    }

    @Test
    public void canAddBedRoom___DOUBLE(){
        hotel.addBedRoom(RoomType.DOUBLE, 129.00, 102);
        assertEquals(1, hotel.getBedRooms().size());
        assertEquals(102, hotel.getBedRooms().get(0).getRoomNumber());
        assertEquals(129.00, hotel.getBedRooms().get(0).getRate(), 0.01);
        assertEquals(RoomType.DOUBLE, hotel.getBedRooms().get(0).getType());
        assertEquals("Double", hotel.getBedRooms().get(0).getTitle());
        assertEquals(2, hotel.getBedRooms().get(0).getCapacity());
    }

    @Test
    public void canAddBedRoom___FAMILY(){
        hotel.addBedRoom(RoomType.FAMILY, 159.00, 103);
        assertEquals(1, hotel.getBedRooms().size());
        assertEquals(103, hotel.getBedRooms().get(0).getRoomNumber());
        assertEquals(159.00, hotel.getBedRooms().get(0).getRate(), 0.01);
        assertEquals(RoomType.FAMILY, hotel.getBedRooms().get(0).getType());
        assertEquals("Family", hotel.getBedRooms().get(0).getTitle());
        assertEquals(4, hotel.getBedRooms().get(0).getCapacity());
    }

    @Test
    public void canFindBedRoom___room102(){
        hotel.addBedRoom(RoomType.SINGLE, 109.00, 101);
        hotel.addBedRoom(RoomType.DOUBLE, 129.00, 102);
        hotel.addBedRoom(RoomType.FAMILY, 159.00, 103);
        assertEquals(102, hotel.findBedRoom(102).getRoomNumber());
    }

    @Test
    public void cannotFindBedRoom___room104(){
        hotel.addBedRoom(RoomType.SINGLE, 109.00, 101);
        hotel.addBedRoom(RoomType.DOUBLE, 129.00, 102);
        hotel.addBedRoom(RoomType.FAMILY, 159.00, 103);
        assertEquals(null, hotel.findBedRoom(104));  // NOT GOOD RETURN VALUE - RETHINK
    }

    @Test
    public void canCheckInGuest___guest1___room102(){
        hotel.addBedRoom(RoomType.SINGLE, 109.00, 101);
        hotel.addBedRoom(RoomType.DOUBLE, 129.00, 102);
        hotel.addBedRoom(RoomType.FAMILY, 159.00, 103);
        hotel.checkInGuest(guest2, 102);
        assertEquals(1, hotel.findBedRoom(102).getGuests().size());
        assertEquals("Hilary Clinton", hotel.findBedRoom(102).getGuests().get(0).getName());
    }

    @Test
    public void canCheckInGuest___guest1_and_Guest2___room103(){
        hotel.addBedRoom(RoomType.FAMILY, 159.00, 103);
        hotel.checkInGuest(guest1, 103);
        hotel.checkInGuest(guest2, 103);
        assertEquals(2, hotel.findBedRoom(103).getGuests().size());
        assertEquals("Donald Trump", hotel.findBedRoom(103).getGuests().get(0).getName());
        assertEquals("Hilary Clinton", hotel.findBedRoom(103).getGuests().get(1).getName());
    }

    @Test
    public void canCheckInGuest___ONLY_IF_THERE_IS_SPACE(){
        hotel.addBedRoom(RoomType.SINGLE, 109.00, 101);
        hotel.checkInGuest(guest1, 101);
        hotel.checkInGuest(guest2, 101);
        assertEquals(1, hotel.findBedRoom(101).getGuests().size());
        assertEquals("Donald Trump", hotel.findBedRoom(101).getGuests().get(0).getName());
    }

    @Test
    public void canCheckInGuest___ONLY_IF_THERE_IS_SPACE___AND_ROOM_EXISTS(){
        hotel.addBedRoom(RoomType.SINGLE, 109.00, 101);
        hotel.checkInGuest(guest1, 102);
        hotel.checkInGuest(guest2, 102);
        assertEquals(null, hotel.findBedRoom(102));
        assertEquals(0, hotel.findBedRoom(101).getGuests().size());
    }

    @Test
    public void canGetGuestNames___FOR_GIVEN_ROOM_NUMBER(){
        hotel.addBedRoom(RoomType.FAMILY, 159.00, 103);
        hotel.checkInGuest(guest1, 103);
        hotel.checkInGuest(guest2, 103);
        assertEquals(2, hotel.findBedRoom(103).getGuests().size());
//        assertArrayEquals(["Donald Trump", "Hilary Clinton"], hotel.findBedRoom(103).getGuestNames());
    }

}
