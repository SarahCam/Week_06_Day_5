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

    // Add new single bedroom, with it's number and rate, (with no guests) to the hotel:
    public void addSingleBedroom(Double rate, int roomNumber){
        BedRoom bedroom = new BedRoom(RoomType.SINGLE, rate, roomNumber);
        this.bedRooms.add(bedroom);
        System.out.println("Added single bedroom: " + roomNumber + ", rate: " + rate);
    }

    // Add new double bedroom, with it's number and rate, (with no guests) to the hotel:
    public void addDoubleBedroom(Double rate, int roomNumber){
        BedRoom bedroom = new BedRoom(RoomType.DOUBLE, rate, roomNumber);
        this.bedRooms.add(bedroom);
        System.out.println("Added double bedroom: " + roomNumber + ", rate: " + rate);
    }

    // Add new family bedroom, with it's number and rate, (with no guests) to the hotel:
    public void addFamilyBedroom(Double rate, int roomNumber){
        BedRoom bedroom = new BedRoom(RoomType.FAMILY, rate, roomNumber);
        this.bedRooms.add(bedroom);
        System.out.println("Added family bedroom: " + roomNumber + ", rate: " + rate);
    }
}
