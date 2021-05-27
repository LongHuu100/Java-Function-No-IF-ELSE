package sample;

import java.util.function.Function;

public class CardFunctions {
    public static final Function<Card, Double> MULTIPLE_WHIT_ONE_POINT_FIVE = o -> o.getValue() * 1.5;
    public static final Function<Card, Double> MULTIPLE_WHIT_TWO_POINT_FIVE = o -> o.getValue() * 2.5;
    public static final Function<Card, Double> DEFAULT = card -> 3.5;
}
