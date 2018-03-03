public class BedRoom extends Room {

    private Double rate;
    private int roomNumber;

    public BedRoom(RoomType type, Double rate, int roomNumber) {
        super(type);
        this.rate = rate;
        this.roomNumber = roomNumber;
    }

    // Get the room rate (price):
    public Double getRate() {
        return rate;
    }

    // Get the room number:
    public int getRoomNumber(){
        return roomNumber;
    }

}
