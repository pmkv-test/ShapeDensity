package shape;

public class Shape {
    private int shapeWeight;
    private float shapeDensity;

    protected Shape(int weight) {
        shapeWeight = weight;
    }

    public String calcDensity(float shapeVolume) {

        if (shapeVolume > 0 && shapeWeight > 0) {
            shapeDensity = shapeWeight / shapeVolume;
        } else shapeDensity = 0;

        return String.format("%.2f", shapeDensity);
    }

    public float calcVolume() {
        return 0;
    }
}

