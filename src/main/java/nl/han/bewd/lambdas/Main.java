package nl.han.bewd.lambdas;

import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private final List<String> hobbits = Arrays.asList("Frodo", "Sam", "Merry", "Pippin");

    public static void main(String[] args) {
//        System.out.println("Buiten spits met fiets");
//        Reis mijnReis = new Reis(false);
//        VervoerStrategy vervoer = new FietsVervoerStrategy();
//        mijnReis.simuleerReis(vervoer);
//
//        System.out.println("Tijdens de spits");
//        mijnReis.setSpits(true);
//        mijnReis.simuleerReis(vervoer);                   // Met fiets
//        mijnReis.simuleerReis(new AutoVervoerStrategy()); // Met auto
//        mijnReis.simuleerReis(new OVVervoerStrategy());   // Met OV
//        mijnReis.simuleerReis(new PaardVervoerStrategy()); //Met paard
//
//        System.out.println("Met <nieuw> vervoer (Stap 2)  ");
//        System.out.println("TODO:");
//
//        System.out.println("Met <nieuw> vervoer, lambda edition! (Stap 5)");
//        System.out.println("TODO:");
//
//        VervoerStrategy teleportatieLambda = (isReisTijdensSpits) -> 0; //Lambda
//        mijnReis.simuleerReis(teleportatieLambda); // Met teleportatieLambda object

        Main main = new Main();
        main.run();
    }

    public void run() {

        hobbits.sort(Comparator.comparingInt(String::length)); //String::length is een methode refferentie. Syntaxic sugar voor een lambda expressie.
        // Sorteer op lengte van de namen.
        // Dit is een lambda expressie die een Comparator object maakt.
        hobbits.forEach(System.out::println);
    }

    public static class Scheduler implements Runnable {
        @Override
        public void run()
        {
            System.out.println("Scheduler is running");
        }
    }
}