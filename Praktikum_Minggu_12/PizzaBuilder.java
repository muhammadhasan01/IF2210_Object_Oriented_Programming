public class PizzaBuilder {
    protected Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder size(String sizeInfo) {
        if (sizeInfo.equals("small")) {
            this.pizza.setDiameter(25);
        } else if (sizeInfo.equals("medium")) {
            this.pizza.setDiameter(35);
        } else if (sizeInfo.equals("large")) {
            this.pizza.setDiameter(40);
        }
        return this;
    }

    public PizzaBuilder crust(String crustInfo) {
        this.pizza.setCrust(crustInfo);
        // if (crustInfo.equals("Original")) {
        //     // just do nothing
        // } else if (crustInfo.equals("Cheesy Bites")) {
        //     this.pizza.setPrice(this.pizza.getPrice() + 10);
        // } else if (crustInfo.equals("Stuffed")) {
        //     this.pizza.setPrice(this.pizza.getPrice() + 20);
        // }
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        if (topping.equals("Meat Lovers")) {
            this.pizza.addToppingIngredient("beef");
            this.pizza.addToppingIngredient("mozarella");
        } else if (topping.equals("Tuna Melt")) {
            this.pizza.addToppingIngredient("tuna");
            this.pizza.addToppingIngredient("corn");
            this.pizza.addToppingIngredient("mozarella");
        } else if (topping.equals("Supreme")) {
            this.pizza.addToppingIngredient("pepperoni");
            this.pizza.addToppingIngredient("beef");
            this.pizza.addToppingIngredient("mushroom");
            this.pizza.addToppingIngredient("pineapple");
        }
        return this;
    }

    public Pizza build() {
        int newPrice = 15 * this.pizza.getDiameter();
        newPrice += (10 * this.pizza.getToppingIngredients().size());
        String crust = this.pizza.getCrust();
        if (crust.equals("Cheesy Bites")) {
            newPrice += 10;
        } else if (crust.equals("Stuffed")) {
            newPrice += 20;
        }
        this.pizza.setPrice(newPrice);
        return this.pizza;
    }
}