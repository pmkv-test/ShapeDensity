import shape.Cube;
import shape.Shape;
import shape.Sphere;

public class Main {
    private static final int WEIGHT_CONST = 100;
    private static final int HEIGHT_CONST = 2;
    private static final int RADIUS_CONST = 3;

    public static void main(String[] args) {
        Cube cube = new Cube(WEIGHT_CONST, HEIGHT_CONST);
        Sphere sphere = new Sphere(WEIGHT_CONST, RADIUS_CONST);
        densityShape(cube);
        densityShape(sphere);
    }

    public static void densityShape(Shape shape) {
        float volume = shape.calcVolume();
        String density = shape.calcDensity(volume);
        System.out.println("Density " + shape.getClass().getName() + ": " + density);
    }
}