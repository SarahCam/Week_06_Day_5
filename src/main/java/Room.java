public abstract class Room {

    private RoomType type;

    public Room(RoomType type) {
        this.type = type;
    }

    public RoomType getType() {
        return type;
    }

    public int getCapacity() {
        return type.getCapacity();
    }

    public String getTitle() {
        return type.getTitle();
    }

}
