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

    // Find a particular bedroom number in this hotel, and return the BedRoom instance:
    public BedRoom findBedRoom(int roomNumber){
        for (BedRoom bedRoom : this.bedRooms){
            if (bedRoom.getRoomNumber() == roomNumber){
                System.out.println("Found bedroom: " + roomNumber);
                return bedRoom;
            }
        }
        System.out.println("Cannot find bedroom: " + roomNumber);
        return this.bedRooms.get(0);
    }

    // Check-in guest to a specified room number:
    public void checkInGuest(Guest guest, int roomNumber){
//        this.findBedRoom(roomNumber).addGuest(guest);
        System.out.println("Checked in guest: " + guest.getName() + " into room: " + roomNumber);
    }
}
