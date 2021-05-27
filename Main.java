package sample;

public class Main {
    public static void main(String[] args) {
        Card card6 = new Card();
        card6.setValue(6.0);

        Card card7 = new Card();
        card7.setValue(7.0);

        Card card17 = new Card();
        card17.setValue(17.0);

        System.out.println("card 6 -->" + RuleMatrix.getRule(card6).apply(card6));
        System.out.println("card 7 -->" + RuleMatrix.getRule(card7).apply(card7));
        System.out.println("card 17 -->" + RuleMatrix.getRule(card17).apply(card17));
    }
}
