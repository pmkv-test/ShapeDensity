import shape.Cube;
import shape.Shape;
import shape.Sphere;

public class Main {
    private static final int WEIGHT_CONST = 100;
    private static final int HEIGHT_CONST = 2;
    private static final int RADIUS_CONST = 3;

    public static void main(String[] args) {
        String sDensity;
        Shape shape = new Cube(WEIGHT_CONST,HEIGHT_CONST);
        sDensity = shape.calcDensity(shape.calcVolume());
        System.out.println("Cube volume: "+sDensity);
        shape = new Sphere(WEIGHT_CONST,RADIUS_CONST);
        sDensity = shape.calcDensity(shape.calcVolume());
        System.out.println("Sphere volume: "+sDensity);
    }
}