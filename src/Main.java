public class Main {
    public static void main(String[] args) {

        RealEstateManager manager = new RealEstateManager();

        manager.addProperty(new ResidentialProperty("İstanbul", 600000, "Available", "2+1"));
        manager.addProperty(new ResidentialProperty("Ankara", 500000, "Available", "3+1"));
        manager.addProperty(new ResidentialProperty("İstanbul", 900000, "Available", "4+1"));
        manager.addProperty(new ResidentialProperty("Ankara", 400000, "Available", "2+1"));

        Customer customer = new Customer("Bekir", "bekir1903@gmail.com");

        System.out.println("All Properties:");
        manager.displayProperties();

        System.out.println("\nProperties sorted by price:");
        manager.sortPropertiesByPrice();
        manager.displayProperties();

        System.out.println("\nProperties in Ankara:");
        manager.filterPropertiesByLocation("Ankara");

        System.out.println("\nPerforming transaction...");
        Property selectedProperty = new ResidentialProperty("Ankara", 500000, "Available", "3+1");
        manager.performTransaction(customer, selectedProperty);

        System.out.println("\nCostumer Properties:");
        customer.displayCustomer();
        manager.clientPropertiesMap.get(customer.hashCode()).forEach(Property::displayPropertyDetails);
    }
}