package shape;

public abstract class Shape {
    private int shapeWeight;
    private float shapeDensity;

    protected Shape(int weight) {
        shapeWeight = weight;
    }

    public float calcDensity() {

        if (calcVolume() > 0 && shapeWeight > 0) {
            shapeDensity = shapeWeight / calcVolume();
        } else System.err.println("Argument density failed");

        return shapeDensity;
    }

    protected abstract float calcVolume();

}


