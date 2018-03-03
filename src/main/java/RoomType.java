public enum RoomType {
    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    FAMILY(4, "Family"),
    SMALL_CONFERENCE(10, "Small Conference Room"),
    MEDIUM_CONFERENCE(50, "Medium Conference Room"),
    LARGE_CONFERENCE(100, "Large Conference Room"),
    SMALL_DINING(30, "Small Dining Room"),
    LARGE_DINING(100, "Large Dining Room");

    private final int capacity;
    private final String type;

    RoomType(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}
