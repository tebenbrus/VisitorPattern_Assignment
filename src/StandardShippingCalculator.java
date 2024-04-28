import java.util.HashMap;
import java.util.Map;

public class StandardShippingCalculator implements ShippingCostCalculator {
    private static final Map<String, Double> shippingRates = new HashMap<>();

    static {
        shippingRates.put("Chair", 700.0);
        shippingRates.put("Table", 15.0);
        shippingRates.put("Sofa", 20.0);
    }

    @Override
    public double computeCost(Furniture furniture) {
        double cost = 0;
        if (furniture instanceof Chair) {
            cost = 700.0;
        } else if (furniture instanceof Table table) {
            cost = table.getWeight() * table.getDistance() * shippingRates.get("Table");
        } else if (furniture instanceof Sofa sofa) {
            cost = sofa.getWeight() * sofa.getDistance() * shippingRates.get("Sofa");
        }
        return cost;
    }
}