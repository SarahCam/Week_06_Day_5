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
    private final String title;

    RoomType(int capacity, String title) {
        this.capacity = capacity;
        this.title = title;
    }

    // Get the RoomType capacity for a given RoomType ENUM:
    public int getCapacity() {
        return capacity;
    }

    // Get the RoomType title for a given RoomType ENUM:
    public String getTitle() {
        return title;
    }
}
