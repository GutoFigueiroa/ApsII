package fabrica;

import ingredientes.BlackOlives;
import ingredientes.Cheese;
import ingredientes.Clam;
import ingredientes.Dough;
import ingredientes.Eggplant;
import ingredientes.FrozenClams;
import ingredientes.MozzarellaCheese;
import ingredientes.Pepperoni;
import ingredientes.PlumTomatoSauce;
import ingredientes.Sauce;
import ingredientes.SlicedPepperoni;
import ingredientes.Spinach;
import ingredientes.ThickCrustDough;
import ingredientes.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }
}
