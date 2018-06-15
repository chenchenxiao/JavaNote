package com.basic.设计模式;

/**
 * @author Blse
 * @date 2018/4/6
 * @description
 */
public class 装饰者模式 {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage.cost());
    }


}

abstract class Beverage{
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}

/**
 * 装饰者类
 */
abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}

/**
 * 被装饰者
 */
class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    double cost() {
        return 0.89;
    }
}

/**
 * 装饰者
 */
class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocho";
    }
}