public class carconcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
