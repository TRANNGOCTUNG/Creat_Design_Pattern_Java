package factory_exercise;

public class ShapeFactory {
    private static ShapeFactory INSTANCE = null;
    private ShapeFactory(){
        Circle circle = new Circle();
        circle.draw();
        Square square = new Square();
        square.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        System.out.println("Class ShapeFactory:");
    }
    public static ShapeFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ShapeFactory();
            return INSTANCE;
        }
        return null;
    }

}
