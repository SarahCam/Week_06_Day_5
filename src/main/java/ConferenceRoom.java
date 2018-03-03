public class ConferenceRoom extends Room {

    private Double rate;
    private String roomName;

    public ConferenceRoom(RoomType type, Double rate, String roomName) {
        super(type);
        this.rate = rate;
        this.roomName = roomName;
    }

    // Get the room rate (price):
    public Double getRate() {
        return rate;
    }

    // Get the room name, e.g. "Billiard Room" or "Ball Room":
    public String getRoomName() {
        return roomName;
    }
}
