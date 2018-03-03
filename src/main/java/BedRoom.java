public class BedRoom extends Room {

    private Double rate;

    public BedRoom(RoomType type, Double rate) {
        super(type);
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }
}
