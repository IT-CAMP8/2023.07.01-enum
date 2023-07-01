package pl.camp.it.enumy;

public enum Console {
    PS5("Sony", "PlayStation"),
    XBOXSX("Microsoft", "XBox XS"),
    SWITCH("Nintendo", "Switch");

    private String brand;
    private String model;

    Console(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
