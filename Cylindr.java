public class Cylindr extends Shape{
    private double radius; // радиус
    private double heihtg; // высота
    public Cylindr(double radius, double heihtg){
        this.radius = radius;
        this.heihtg = heihtg;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeihtg() {
        return heihtg;
    }

    public void setHeihtg(double heihtg) {
        this.heihtg = heihtg;
    }

    @Override
    public double calculateVolume() {
        return Math.PI*Math.pow(radius, 2) * heihtg;
    }
}
