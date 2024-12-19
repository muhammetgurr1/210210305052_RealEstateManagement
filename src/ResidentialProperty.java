public class ResidentialProperty extends Property {



    String rooms;

    public ResidentialProperty(String location, int price, String status, String rooms) {

        super(location, price, status);
        this.rooms = rooms;

    }
    @Override
    public void displayPropertyDetails() {
        System.out.println("Location: " + location + ", Price: " + price + ", Status: " + status + ", Rooms: " + rooms);
    }
}
