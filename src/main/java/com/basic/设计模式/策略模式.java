package com.basic.设计模式;

/**
 * @author Blse
 * @date 2018/4/6
 * @description    可以更换策略，实现不同的行为
 */
public class 策略模式 {
    public static void main(String[] args) {
        StrategyTest strategyTest = new StrategyTest(new StrategyImpA());
        strategyTest.sounds();
    }
}

interface Strategy{
    void sounds();
}

class StrategyImpA implements Strategy{

    @Override
    public void sounds() {
        System.out.println("StrategyImpA-------");
    }
}

class StrategyImpB implements Strategy{

    @Override
    public void sounds() {
        System.out.println("StrategyImpB-------");
    }
}

class StrategyTest{
    Strategy strategy;

    public StrategyTest(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sounds() {
        strategy.sounds();
    }
}