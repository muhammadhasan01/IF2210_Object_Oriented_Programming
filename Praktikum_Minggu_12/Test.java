public class Test {
    public static void main(String[] args) {
        Pizza p = new PizzaBuilder()
           .crust("Cheesy Bites")
           .addTopping("Meat Lovers")
           .addTopping("Tuna Melt")
           .size("large")
           .build();
        System.out.println(p.getDiameter());
        System.out.println(p.getCrust());
        System.out.println(p.getToppingIngredients().size());
        System.out.println(p.getPrice());
    }
}