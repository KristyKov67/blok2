import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "lada";
        car1.model = "granta";
        car1.country = "Россия";
        car1.color = "желтый";
        car1.engineVolume = 1.7;

        Car car2 = new Car();
        car2.brand = "audi";
        car2.model = "a8 50 l tdi quattro";
        car2.country = "Германия";
        car2.color = "черный";
        car2.engineVolume = 3;
        car2.year = 2021;

        Car car3 = new Car();
        car3.brand = "kia";
        car3.model = "sportage 4 поколения";
        car3.country = "Южная Корея";
        car3.color = "красный";
        car3.engineVolume = 2.4;
        car3.year = 2018;

        Car car4 = new Car();
        car4.brand = "hyndai";
        car4.model = "avante";
        car4.country = "Южная Корея";
        car4.color = "оранжевый";
        car4.engineVolume = 1.6;
        car4.year = 2016;
        System.out.print(car1 + " " + car2);

    }

}