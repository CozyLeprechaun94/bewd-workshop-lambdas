package nl.han.bewd.lambdas.reis;

/*
VervoerStrategy heeft een enkele methode voor het berekenen van de reistijd. Afstand is hierin nog niet meegenomen.
Alleen of de reis in de spits is kan meegenomen worden in de berekening.
 */
@FunctionalInterface
//Een FunctionalInterface mag geen 2 abstracte methodes hebben.
public interface VervoerStrategy {
    int berekenReistijd(boolean isReisTijdensSpits) ;
}