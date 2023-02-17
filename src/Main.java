import shape.Cube;
import shape.Sphere;

public class Main {
    private static final int WEIGHT_CONST = 100;
    private static final int HEIGHT_CONST = 2;
    private static final int RADIUS_CONST = 3;

    public static void main(String[] args) {
        String sDensity;
        Cube cube = new Cube(WEIGHT_CONST,HEIGHT_CONST);
        sDensity = cube.calcDensity();
        System.out.println("Cube volume: "+sDensity);
        Sphere sphere = new Sphere(WEIGHT_CONST,RADIUS_CONST);
        sDensity = sphere.calcDensity();
        System.out.println("Sphere volume: "+sDensity);
    }
}