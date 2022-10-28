package behavioral_patterns.strategy_pattern;

public class LowerTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("the lower case representation is" + text.toLowerCase());
    }
}
