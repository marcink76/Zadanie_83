public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double ballVolume(Ball ball) {
        double ballVolume = (Math.pow(ball.getRadius(), 3)) * 3 / 4;
        return ballVolume;
    }

    public double cubeVolume(Cube cube) {
        double cubeVolume = Math.pow(cube.getSide(), 3);
        return cubeVolume;
    }

    public double rectArea(Rectangle rectangle) {
        double rectArea = rectangle.getRectSideA() * rectangle.getRectSideB();
        return rectArea;
    }

    public double circleArea(Circle circle) {
        double circleArea = Math.PI * Math.pow(circle.getRadius(), 2);
        return circleArea;
    }
}
