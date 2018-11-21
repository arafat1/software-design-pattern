package design.patterns.strategypattern.algorithms;

public class AttackStrategy implements WarStrategy {
    @Override
    public void prepare() {
        System.out.println("Prepare for the attack");
    }

    @Override
    public String select() {
        return "Executing AttackStrategy";
    }

}
