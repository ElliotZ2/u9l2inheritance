public class Building {
    private String address;
    private int height;
    private String name;

    public Building(String name, String address, int height) {
        this.name = name;
        this.address = name;
        this.height = height;
    }

    public void close() {
        System.out.println(name + " is now closed");
    }

}