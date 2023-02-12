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

 @Override
 public String toString() {
  return "Car{" +
          "brand='" + brand + '\'' +
          ", model='" + model + '\'' +
          ", engineVolume=" + engineVolume +
          ", color='" + color + '\'' +
          ", year=" + year +
          ", country='" + country + '\'' +
          '}';
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


 public void setEngineVolume(int engineVolume) {
  this.engineVolume = engineVolume;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public int getYear() {
  return year;
 }

 public void setYear(int year) {
  this.year = year;
 }

 public String getCountry() {
  return country;
 }

 public void setCountry(String country) {
  this.country = country;
 }

}
