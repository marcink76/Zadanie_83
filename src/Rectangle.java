public class Rectangle extends GeometricShape {
    double rectSideA = 0;
    double rectSideB = 0;

    public Rectangle(double rectSideA, double rectSideB) {
        this.rectSideA = rectSideA;
        this.rectSideB = rectSideB;
    }

    public double getRectSideA() {
        return rectSideA;
    }

    public void setRectSideA(double rectSideA) {
        this.rectSideA = rectSideA;
    }

    public double getRectSideB() {
        return rectSideB;
    }

    public void setRectSideB(double rectSideB) {
        this.rectSideB = rectSideB;
    }
}
