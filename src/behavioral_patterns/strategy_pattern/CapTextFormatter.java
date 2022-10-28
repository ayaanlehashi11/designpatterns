package behavioral_patterns.strategy_pattern;

public class CapTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("the capitalized text is "+text.toUpperCase());
    }
}
