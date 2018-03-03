import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    ArrayList<BedRoom> bedRooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;


    @Before
    public void before(){
        hotel = new Hotel();
    }

//    @Test
//    public void canGetBedrooms(){
//        hotel.getBedRooms();
//    }

    @Test
    public void canAddSingleBedRoom(){
        hotel.addSingleBedRoom(109.00, 101);
        assertEquals(101, hotel.getBedRooms().get(0).getRoomNumber());
        assertEquals(109.00, hotel.getBedRooms().get(0).getRate(), 0.01);
        assertEquals(RoomType.SINGLE, hotel.getBedRooms().get(0).getType());
        assertEquals("Single", hotel.getBedRooms().get(0).getTitle());
        assertEquals(1, hotel.getBedRooms().get(0).getCapacity());
    }

    @Test
    public void canAddDoubleBedRoom(){
        hotel.addDoubleBedRoom(129.00, 102);
        assertEquals(102, hotel.getBedRooms().get(0).getRoomNumber());
        assertEquals(129.00, hotel.getBedRooms().get(0).getRate(), 0.01);
        assertEquals(RoomType.DOUBLE, hotel.getBedRooms().get(0).getType());
        assertEquals("Double", hotel.getBedRooms().get(0).getTitle());
        assertEquals(2, hotel.getBedRooms().get(0).getCapacity());
    }

    @Test
    public void canAddFamilyBedRoom(){
        hotel.addFamilyBedRoom(159.00, 103);
        assertEquals(103, hotel.getBedRooms().get(0).getRoomNumber());
        assertEquals(159.00, hotel.getBedRooms().get(0).getRate(), 0.01);
        assertEquals(RoomType.FAMILY, hotel.getBedRooms().get(0).getType());
        assertEquals("Family", hotel.getBedRooms().get(0).getTitle());
        assertEquals(4, hotel.getBedRooms().get(0).getCapacity());
    }

}
