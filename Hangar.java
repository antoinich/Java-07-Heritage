public class Hangar {

    public static void main (String[] args) {

        Car Clio = new Car ("Clio");
        Boat Titanic = new Boat ("Titanic");

        System.out.println("Je suis " + Clio.getBrand() + " et je fais " + Clio.doStuff());
        System.out.println("Je suis " + Titanic.getBrand() + " et je fais " + Titanic.doStuff());
    }
}