public class FurnitureStore {
    public static void main(String[] args) {
        Furniture chair = new Chair(0.0);
        Furniture table = new Table(10.0, 7.0);
        Furniture sofa = new Sofa(20.0, 7.0);

        ShippingCostCalculator calculator = new StandardShippingCalculator();

        System.out.println("Chair shipping cost: ₱" + chair.accept(calculator));
        System.out.println("Table shipping cost: ₱" + table.accept(calculator));
        System.out.println("Sofa shipping cost: ₱" + sofa.accept(calculator));
    }
}