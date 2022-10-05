package creational_patterns.abstract_factory;

public class Factoryproducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded)
            return new RoundedShapeFactory();
        else
            return new RoundedShapeFactory();
    }
}
