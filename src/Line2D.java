public class Line2D extends Shape2D {
    private double coordAX = 0;
    private double coordAY = 0;
    private double coordBX = 0;
    private double coordBY = 0;

    public Line2D(double coordAX, double coordAY, double coordBX, double coordBY) {
        this.coordAX = coordAX;
        this.coordAY = coordAY;
        this.coordBX = coordBX;
        this.coordBY = coordBY;
    }

    public double getCoordAX() {
        return coordAX;
    }

    public void setCoordAX(double coordAX) {
        this.coordAX = coordAX;
    }

    public double getCoordAY() {
        return coordAY;
    }

    public void setCoordAY(double coordAY) {
        this.coordAY = coordAY;
    }

    public double getCoordBX() {
        return coordBX;
    }

    public void setCoordBX(double coordBX) {
        this.coordBX = coordBX;
    }

    public double getCoordBY() {
        return coordBY;
    }

    public void setCoordBY(double coordBY) {
        this.coordBY = coordBY;
    }
}
