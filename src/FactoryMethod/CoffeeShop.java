package FactoryMethod;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType coffeeType){
        Coffee coffee = createCoffee(coffeeType);
        coffee.makeCoffee();
        coffee.pourIntoCoup();
        System.out.println("Get your coffee");
        return coffee;
    }
    protected abstract Coffee createCoffee(CoffeeType coffeeType);
}
