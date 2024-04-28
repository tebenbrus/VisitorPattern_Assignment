public class    Chair implements Furniture {
    private double distance;

    public Chair(double distance) {
        this.distance = distance;
    }

    @Override
    public double accept(ShippingCostCalculator calculator) {
        return calculator.computeCost(this);
    }

    public double getDistance() {
        return distance;
    }
}
