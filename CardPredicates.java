package sample;

import java.util.function.Predicate;

public class CardPredicates {
    public static final Predicate<Card> WHEN_CARD_VALUE_IS_SIX = card -> card.getValue() == 6;
    public static final Predicate<Card> WHEN_CARD_VALUE_IS_SEVEN = card -> card.getValue() == 7;
}
