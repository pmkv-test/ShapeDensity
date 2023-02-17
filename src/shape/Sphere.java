package shape;

public class Sphere extends Shape {
    private int sphereR;

    public Sphere(int weight, int r) {
        super(weight);
        sphereR = r;
        shapeVolume = sphereVolume();
    }

    private float sphereVolume() {
        float v = (float) (4 * Math.PI * Math.pow(sphereR, 3)) / 3;
        return v;
    }
}
