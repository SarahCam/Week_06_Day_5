import java.util.ArrayList;

public abstract class Room {

    private RoomType type;
    private ArrayList<Guest> guests;

    public Room(RoomType type) {
        this.type = type;
        this.guests = new ArrayList<Guest>();
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

    // Get an ArrayList of all the guests checked into this room:
    public ArrayList<Guest> getGuests(){
        return guests;
    }

    // Get an Array of all the guests' names who are checked into this room:
    public String[] getGuestNames(){
        String[] guestNames = new String[this.guests.size()];
        for (int i = 0; i < this.guests.size(); i++){
            guestNames[i] = this.guests.get(i).getName();
        }
        return guestNames;
    }

    // Add guest to this room - ONLY if there is capacity - return TRUE if guest successfully added:
    public boolean addGuest(Guest guest){
        if (this.guests.size() < this.getCapacity()) {
            this.guests.add(guest);
            return true;
        }
        return false;
    }

}
