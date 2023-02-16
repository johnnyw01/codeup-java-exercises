package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        System.out.println("********************");
//        Rectangle box2 = new Square(5);
//        System.out.println(box2);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
        Measurable myShape;

        Rectangle rectangle = new Rectangle(5,10);
//        myShape = rectangle;
//        System.out.println("The area of the rectangle is: " + myShape.getArea() + ", and its perimeter is: " + myShape.getPerimeter());
        Square square = new Square(5);
        myShape = square;
        System.out.println("The area of the square is: " + myShape.getArea() + ", and its perimeter is: " + myShape.getPerimeter());
    }

}
