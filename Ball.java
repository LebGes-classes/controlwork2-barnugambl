public class Ball extends  Shape {
    private double radius; // радиус
    public Ball(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4 / 3)*Math.PI*Math.pow(radius, 3);
    }
}
