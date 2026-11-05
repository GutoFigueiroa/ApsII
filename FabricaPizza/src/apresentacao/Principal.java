package apresentacao;

import lojas.ChicagoStylePizzaStore;
import lojas.NYStylePizzaStore;
import lojas.PizzaStore;
import pizzas.Pizza;

public class Principal {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        System.out.println("========== PEDIDO 1 (Nova York - Queijo) ==========");
        Pizza pizzaNY = nyStore.orderPizza("queijo");
        System.out.println("Ethan pediu uma " + pizzaNY.getName() + "\n");
        System.out.println(pizzaNY);

        System.out.println("========== PEDIDO 2 (Chicago - Queijo) ==========");
        Pizza pizzaChicago = chicagoStore.orderPizza("queijo");
        System.out.println("Joel pediu uma " + pizzaChicago.getName() + "\n");
        System.out.println(pizzaChicago);

        System.out.println("========== PEDIDO 3 (Nova York - Mariscos) ==========");
        Pizza clamNY = nyStore.orderPizza("mariscos");
        System.out.println("Ethan pediu uma " + clamNY.getName() + "\n");
        System.out.println(clamNY);

        System.out.println("========== PEDIDO 4 (Chicago - Mariscos) ==========");
        Pizza clamChicago = chicagoStore.orderPizza("mariscos");
        System.out.println("Joel pediu uma " + clamChicago.getName() + "\n");
        System.out.println(clamChicago);
    }
}

