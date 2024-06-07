package lesson_18;

public class HW18 {
    public static void main(String[] args) {
IntercityBus iBus = new IntercityBus("Ман01", 2020, 5, 2);

        System.out.println(iBus.toString());

        iBus.takePassenger();
        iBus.takePassenger();
        iBus.takePassengerWithBicycle();
        iBus.takePassengerWithBicycle();

        System.out.println("\n===========================\n");
        System.out.println(iBus.getCountPassengers());
        System.out.println(iBus.getCountBicycle());

        System.out.println(iBus.dropOffPassengerWithBicycle());
        System.out.println(iBus.dropOffPassengerWithBicycle());
        System.out.println(iBus.dropOffPassengerWithBicycle());
    }
}
