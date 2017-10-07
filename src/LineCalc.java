public class LineCalc {

    public static double lineLenght(Line2D line) {

        double lineLenght = Math.sqrt(Math.pow(Math.abs(line.getCoordAX() - line.getCoordBX()), 2) + Math.pow(Math
                .abs(line.getCoordAY() - line.getCoordBY()), 2));

        return lineLenght;
    }

}
