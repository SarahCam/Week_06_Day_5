public class ConferenceRoom extends Room {

    private Double rate;
    private String roomName;

    public ConferenceRoom(RoomType type, Double rate, String roomName) {
        super(type);
        this.rate = rate;
        this.roomName = roomName;
    }

    public Double getRate() {
        return rate;
    }

    public String getRoomName() {
        return roomName;
    }
}
