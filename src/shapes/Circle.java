package shapes;

public class Circle {

    private double radius;
    private static int numberOfCircles = 0;

    public Circle(double radius){
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea( double radius){
        double pi = Math.PI;
        double area = pi * (radius * radius);
        double areaRoundedDown = Math.round(area * 100.0) / 100.0;

        return areaRoundedDown ;
    }

    public double getCircumference(double radius){
        double pi = Math.PI;
        double circle = 2 * pi * radius;
        double circleRoundedDown = Math.round(circle * 100.0) / 100.0;
        return  circleRoundedDown;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.5);
        System.out.println(myCircle.getArea(5.5));
        System.out.println(myCircle.getCircumference(6.2));
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }
}
