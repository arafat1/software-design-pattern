package design.patterns.strategypattern;

import design.patterns.strategypattern.algorithms.WarStrategy;

public class CommanderContext {
    private WarStrategy warStrategy;

    public CommanderContext(WarStrategy warStrategy) {
        this.warStrategy = warStrategy;
    }

    public String executeStrategy() {
        warStrategy.prepare();
        return warStrategy.select();
    }

    public void changeStrategy(WarStrategy warStrategy) {
        this.warStrategy = warStrategy;
    }
}
