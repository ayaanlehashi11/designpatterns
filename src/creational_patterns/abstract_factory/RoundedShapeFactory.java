package creational_patterns.abstract_factory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle"))
            return new RoundingRectangle();
        else if (shape.equalsIgnoreCase("Square"))
            return new RoundingSquare();
        else
            return null;
    }
}
