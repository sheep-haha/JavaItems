/**  菜品类
 * Id  Name    Price
 * 1  香辣肉丝  39.0
 *
 */
public class Dish {
    private int Id;
    private String Name;
    private double Price;

    public Dish() {
    }

    public Dish(int id, String name, double price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        return Id +"  "+ Name + "  " + Price ;
    }
}
