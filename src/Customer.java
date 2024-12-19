public class Customer {
     String name;
     String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void displayCustomer() {
        System.out.println("Name:" + name+", "+"Email: " + email);
    }


}
