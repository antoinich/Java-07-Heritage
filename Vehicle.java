public abstract class Vehicle {

    // attributes
    private String brand;
    private int kilometers;

    // Construct
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // access and mutations
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();


}