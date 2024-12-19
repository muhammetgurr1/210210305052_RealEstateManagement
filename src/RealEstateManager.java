import java.util.*;

public class RealEstateManager implements IPropertySearchable{

     List<Property> propertiesList;
     Map<Integer, List<Property>> clientPropertiesMap;

    public RealEstateManager() {
        propertiesList = new ArrayList<>();
        clientPropertiesMap = new HashMap<>();
    }

    public void addProperty(Property property) {
        propertiesList.add(property);
    }

    @Override
    public List<Property> searchByPriceRange(List<Property> properties, int minPrice, int maxPrice) {
        List<Property> result = new ArrayList<>();
        properties.stream()
                .filter(property -> property.price >= minPrice && property.price <= maxPrice)
                .forEach(result::add);
        return result;
    }

    @Override
    public List<Property> searchByLocation(List<Property> properties, String location) {
        List<Property> result = new ArrayList<>();
        properties.stream()
                .filter(property -> property.location.equalsIgnoreCase(location))
                .forEach(result::add);
        return result;
    }

    public void performTransaction(Customer customer, Property property) {
        clientPropertiesMap.putIfAbsent(customer.hashCode(), new ArrayList<>());
        clientPropertiesMap.get(customer.hashCode()).add(property);
        property.status = "Sold";
    }

    public void displayProperties() {
        propertiesList.forEach(Property::displayPropertyDetails);
    }

    public void sortPropertiesByPrice() {
        propertiesList.sort(Comparator.comparingDouble(property -> property.price));
    }

    public void filterPropertiesByLocation(String location) {
        propertiesList.stream()
                .filter(property -> property.location.equalsIgnoreCase(location))
                .forEach(Property::displayPropertyDetails);
    }










}
