public class Table implements Furniture {
    private double weight;
    private double distance;

    public Table(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public double accept(ShippingCostCalculator calculator) {
        return calculator.computeCost(this);
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }
}