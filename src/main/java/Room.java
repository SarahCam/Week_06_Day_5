public abstract class Room {

    private RoomType type;

    public Room(RoomType type) {
        this.type = type;
    }

    // Get the RoomType ENUM, e.g. SINGLE, DOUBLE etc:
    public RoomType getType() {
        return type;
    }

    // Get the room's capacity - which is a property of the RoomType ENUM:
    public int getCapacity() {
        return type.getCapacity();
    }

    // Get the room's title, e.g. "Single", "Double" - which is a property of the RoomType ENUM:
    public String getTitle() {
        return type.getTitle();
    }

}
