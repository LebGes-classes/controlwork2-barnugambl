public class Cube extends Shape{
    private double sideLength; // сторона квадрата
    public Cube(double sideLength){
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
