public class BedRoom extends Room {

    private Double rate;

    public BedRoom(RoomType type, Double rate) {
        super(type);
        this.rate = rate;
    }

    // Get the room rate (price):
    public Double getRate() {
        return rate;
    }
}
