package shape;

public class Cube extends Shape {
    private int cubeH;

    public Cube(int weight, int h) {
        super(weight);
        cubeH = h;
        shapeVolume = cubeVolume();
    }

    private float cubeVolume() {
        float v = (float) Math.pow(cubeH, 3);
        return v;
    }

}
