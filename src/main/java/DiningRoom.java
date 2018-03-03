public class DiningRoom extends Room {

    private String roomName;

    public DiningRoom(RoomType type, String roomName) {
        super(type);
        this.roomName = roomName;
    }

    // Get the room name, e.g. "Bar, "Conservatory" or "Formal Dining Room":
    public String getRoomName() {
        return roomName;
    }
}
