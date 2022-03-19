public class Cafe extends Building{
    private String foodRating;

    public Cafe(String name, String address, int height, String foodRating) {
        super(name, address, height);
        this.foodRating = foodRating;
    }

    public void takeOrder(String nameOfCustomer) {
        System.out.println(nameOfCustomer + " says they want some food, so just give them something");
    }

    public void serveFood(String nameOfCustomer) {
        System.out.println("food has been served to " + nameOfCustomer + ".");
    }

    public String getFoodRating() {
        return foodRating;
    }
}
