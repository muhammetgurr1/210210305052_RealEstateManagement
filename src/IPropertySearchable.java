import java.util.List;

public interface IPropertySearchable {

    List<Property> searchByPriceRange(List<Property> properties, int minPrice, int maxPrice);
    List<Property> searchByLocation(List<Property> properties, String location);



}
