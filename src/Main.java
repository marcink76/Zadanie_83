import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(10);
        Cube cube = new Cube(10);
        Line2D line2D = new Line2D(0, 0, 6, 8);
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Objętość kuli: " + shapeCalculator.ballVolume(ball));

        System.out.println("Objętość sześcianu: " + shapeCalculator.cubeVolume(cube));

        System.out.printf(Locale.ROOT, "Długość lini od punktu A o współrzędnych XA:%.1f, YA:%.1f do punktu B o " +
                "współrzędnych XB:%.1f, YB:%.1f wynosi %.2f\n", line2D.getCoordAX(), line2D.getCoordAY(), line2D
                .getCoordBX(), line2D.getCoordBY(), LineCalc.lineLenght(line2D));

        System.out.println("Pole prostokąta: " + shapeCalculator.rectArea(rectangle));

        System.out.println("Pole koła: " + shapeCalculator.circleArea(circle));
    }
}
