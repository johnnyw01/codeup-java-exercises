package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }
    @Override
    public double getArea(){
        return length * length;
    }
    @Override
    public double getPerimeter(){
        return 4 * length;
    };

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}

