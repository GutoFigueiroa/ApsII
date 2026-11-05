package pizzas;

import ingredientes.Cheese;
import ingredientes.Clam;
import ingredientes.Dough;
import ingredientes.Pepperoni;
import ingredientes.Sauce;
import ingredientes.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Assar por 25 minutos a 350°");
    }

    public void cut() {
        System.out.println("Cortar a pizza em fatias diagonais");
    }

    public void box() {
        System.out.println("Colocar a pizza na caixa oficial da pizzaria");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append("Massa: ").append(dough).append("\n");
        }
        if (sauce != null) {
            result.append("Molho: ").append(sauce).append("\n");
        }
        if (cheese != null) {
            result.append("Queijo: ").append(cheese).append("\n");
        }
        if (veggies != null) {
            result.append("Vegetais: ");
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append("Pepperoni: ").append(pepperoni).append("\n");
        }
        if (clam != null) {
            result.append("Mariscos: ").append(clam).append("\n");
        }
        return result.toString();
    }
}

