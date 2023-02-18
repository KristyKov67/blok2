import java.util.Objects;

public class Car {
    String brand;
    String model;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

    double engineVolume;
    String color;
    int year;
    String country;


    private static final String Default_Value = "default";
    private static final double Default_engine = 1.5;
    private static final String Default_color = "елый";
    private static final int Default_year = 2000;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        setBrand(brand);
        setModel(model);
        setEngineVolume((int) engineVolume);
        setColor(color);
        setYear(year);
        setCountry(country);
    }

    @Override
    public String toString() {
        return "машина: " + "бренд= " + brand + " ,марка= " + model + ", мощность =" + engineVolume +
                " цвет='" + color + ", год=" + year +
                ", страна='" + country + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = Default_Value;
        } else {
            this.brand = brand;
        }
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = Default_Value;
        } else {
            this.model = model;
        }
    }


    public void setEngineVolume(int engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = Default_engine;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = Default_color;
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = Default_year;
        } else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            this.country = Default_Value;
        } else {
            this.country = country;
        }
    }

}
