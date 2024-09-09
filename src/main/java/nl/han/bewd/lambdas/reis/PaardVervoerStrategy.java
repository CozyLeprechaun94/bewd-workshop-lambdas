package nl.han.bewd.lambdas.reis;

public class PaardVervoerStrategy implements VervoerStrategy{

    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 60;
    }
}
