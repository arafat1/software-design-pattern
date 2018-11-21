package design.patterns.strategypattern.algorithms;

public class StandByStrategy implements WarStrategy {
    @Override
    public void prepare() {
        System.out.println("No preparation");
    }

    @Override
    public String select() {
        return "Executing StandByStrategy";
    }

}
