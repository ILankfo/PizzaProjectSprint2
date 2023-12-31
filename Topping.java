public class Topping {
    // Fields
    private String name;
    private double price;

    int ID;
    static int MaxID=0;

    // Constructors
    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
        ID=MaxID++;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method for a readable representation of the object
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
