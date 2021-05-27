package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class RuleMatrix {

    public RuleMatrix(){}
    private static Map<Predicate, Function> ruleMatrix = new HashMap<>();

    static {
        ruleMatrix.put(CardPredicates.WHEN_CARD_VALUE_IS_SIX, CardFunctions.MULTIPLE_WHIT_ONE_POINT_FIVE);
        ruleMatrix.put(CardPredicates.WHEN_CARD_VALUE_IS_SEVEN, CardFunctions.MULTIPLE_WHIT_TWO_POINT_FIVE);
    }

    public static Function getRule(Card card) {
        return ruleMatrix
            .entrySet()
            .stream()
            .filter(entry -> entry.getKey().test(card))
            .map(entry -> entry.getValue())
            .findFirst().orElse(CardFunctions.DEFAULT);
    }
 }
