import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel() {
        this.bedRooms = new ArrayList<BedRoom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new ArrayList<DiningRoom>();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void setBedRooms(ArrayList<BedRoom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void setDiningRooms(ArrayList<DiningRoom> diningRooms) {
        this.diningRooms = diningRooms;
    }

    // Add new bedroom, with it's number and rate, (with no guests) to the hotel:
    public void addBedRoom(RoomType type, Double rate, int roomNumber){
        BedRoom bedroom = new BedRoom(type, rate, roomNumber);
        this.bedRooms.add(bedroom);
        System.out.println("Added " + type + " bedroom: " + roomNumber + ", rate: " + rate);
    }

    // Find a particular bedroom number in this hotel, and return the BedRoom instance - return a null bedroom if not:
    public BedRoom findBedRoom(int roomNumber){
        BedRoom foundBedRoom = null;
        for (BedRoom bedRoom : this.bedRooms){
            if (bedRoom.getRoomNumber() == roomNumber){
                System.out.println("Found bedroom: " + roomNumber);
                foundBedRoom = bedRoom;
            }
        }
        return foundBedRoom;
    }

    // Check-in guest to a specified room number - ONLY if the room exists and there is capacity:
    public void checkInGuest(Guest guest, int roomNumber){
        if (this.findBedRoom(roomNumber) != null) {
            this.findBedRoom(roomNumber).addGuest(guest);
        }
        System.out.println("Checked in guest: " + guest.getName() + " into room: " + roomNumber);
    }
}
