public class ControlWork {
    public static void main(String[] args) {
        Cylindr cylindr = new Cylindr(2, 4);
        System.out.println("Объем циландра: " + cylindr.calculateVolume());

        Cube cube = new Cube(5);
        System.out.println("Объем куба: " + cube.calculateVolume());

        Ball ball = new Ball(3);
        System.out.println("Объем шара: " + ball.calculateVolume());
    }
}
