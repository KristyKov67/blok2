import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("lada","granta",1.7,"желтый",0,"Россия" );
        Car car2 = new Car("audi", "a8 50 l tdi quattro", 3,"черный",2021, "Германия");
        Car car3 = new Car("kia","sportage 4 поколения",2.4, "красный", 2018,"Южная Корея");
        Car car4 = new Car("hyndai", "avante", 1.6, "оранжевый", 2016,"Южная Корея" );
        System.out.print(car1 + " " + car2 + ' ' + car3 + ' ' + car4 + ' ' );

    }

}