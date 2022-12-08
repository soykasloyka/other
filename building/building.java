public class building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        building building = new building();
        building.initialize("Барбершоп");
    }

}
