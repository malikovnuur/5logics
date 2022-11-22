import Java8.Announcement.Announcement;
import Java8.Device.Laptop;
import Java8.Device.Phone;
import Java8.Home.Home;
import Java8.Transport.Airplane;
import Java8.Transport.Car;
import Java8.Transport.Helicopter;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Iphone", "\uD83D\uDE0E", 147000, "Amazing phone", "14 PRO Max", 256);
        Phone phone2 = new Phone("Samsung", "\uD83E\uDD29", 5000, "Great phone", "S21", 128);
        Phone[] phones = {phone1, phone2};

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D", 129000, "Wonderful laptop", "Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16", 176000, "Productive laptop", "Windows");
        Laptop[] laptops = {laptop1, laptop2};

        Home home1 = new Home("Ihlas", "\uD83C\uDFE2", 5000, "Great Home", "Multi-storey", 10);
        Home home2 = new Home("Chaos", "\uD83C\uDFE0", 4500, "Amazing Home", "House", 25);
        Home[] homes = {home1, home2};

        Car car1 = new Car("Mercedes-Benz", "\uD83D\uDE98", 15000000, "Wonderful Car", "Black", LocalDate.of(2010, 3, 6));
        Car car2 = new Car("BMW", "\uD83D\uDE99", 4500, "Fast Car", "Purple", LocalDate.of(2020, 8, 28));
        Car[] cars = {car1, car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire", "\uD83D\uDEE9", 5000, "Fast Airplane", "White", LocalDate.of(2015, 1, 14));
        Airplane airplane2 = new Airplane("Airbus A320", "✈️", 4500, "Large Airplane", "Blue", LocalDate.of(2004, 11, 16));
        Airplane[] airplanes = {airplane1, airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender", "\uD83D\uDE81", 13500000, "Fast Helicopter", "Brown", LocalDate.of(2012, 12, 23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache", "\uD83D\uDE81", 115000000, "Large Helicopter", "Red", LocalDate.of(1999, 7, 9));
        Helicopter[] helicopters = {helicopter1, helicopter2};


        Announcement[] announcements = {
                phone1, phone2, car1, car2, home1, home2, airplane1, airplane2, laptop1, laptop2, helicopter1, helicopter2


        };
        findByPrice(5000, announcements);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");


        findByPrice(4500, phones, laptops, homes, cars, helicopters, airplanes);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        findByPrice(announcements);
    }
    public static void findByPrice( Announcement[] announcements){
        for (Announcement a:announcements) {
            System.out.println(a);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        allthings(500000,announcements);
    }
    public static void allthings(int san,Announcement[]announcements){
        System.out.println("Things under "+san+"$");
        for (Announcement a: announcements ) {
            if(a.getPrice()>san) {
                System.out.println(a);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        allblackthings(announcements);
    }public static void allblackthings(Announcement[]announcements){
        System.out.println("Amazing things");
        for (Announcement c:
                announcements) {
            if(c.getDescription().contains("Amazing")){
                System.out.println(c);
            }

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        picture(announcements);

    } public static void picture(Announcement[]announcements){
        for (Announcement d: announcements) {
            System.out.println(d.getImage());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        something(announcements);

    } public static void something(Announcement[]announcements){
        int a=0;
        System.out.print("You would spend ");
        for (Announcement e:
                announcements  ) {
            a= (int) (a+ e.getPrice());

        }
        System.out.println(a+"$ if you want buy all  things");
        somt(announcements);

    }public static void somt(Announcement[]announcements){
        for (Announcement r:announcements
        ) {if (r.getPrice()<1000) System.out.println(r);
        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Not found");
            break;
        }

        }
    }

    public static void findByPrice(double price, Phone[] phones, Laptop[] laptops,
                                   Home[] homes, Car[] cars, Helicopter[] helicopters, Airplane[] airplanes) {

        for (Phone phone : phones) {
            if (phone.getPrice() == price) {
                System.out.println(phone);
            }
        }
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() == price) {
                System.out.println(laptop);
            }
        }
        for (Home home : homes) {
            if (home.getPrice() == price) {
                System.out.println(home);
            }
        }
        for (Car car : cars) {
            if (car.getPrice() == price) {
                System.out.println(car);
            }
        }
        for (Helicopter helicopter : helicopters) {
            if (helicopter.getPrice() == price) {
                System.out.println(helicopter);
            }
        }
        for (Airplane airplane : airplanes) {
            if (airplane.getPrice() == price) {
                System.out.println(airplane);
            }
        }
    }
    public static void findByPrice(double price, Announcement[]announcements){
        for (Announcement announcement1 : announcements) {
            if(announcement1.getPrice()==price){
                System.out.println(announcement1);
            }
        }
    }
}