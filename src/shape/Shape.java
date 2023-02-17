package shape;

class Shape { //package-private
    private int shapeWeight;
    private float shapeDensity;
    protected float shapeVolume;

    protected Shape(int weight) {
        shapeWeight = weight;
    }

    public String calcDensity() {

        if (shapeVolume > 0 && shapeWeight > 0) {
            shapeDensity = shapeWeight / shapeVolume;
        } else shapeDensity = 0;

        return String.format("%.2f", shapeDensity);
    }
}

