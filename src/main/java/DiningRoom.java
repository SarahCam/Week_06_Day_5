public class DiningRoom extends Room {

    private String roomName;

    public DiningRoom(RoomType type, String roomName) {
        super(type);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
