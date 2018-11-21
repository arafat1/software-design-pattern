package design.patterns.strategypattern.algorithms;

public class DefenceStrategy implements WarStrategy {
    @Override
    public void prepare() {
        System.out.println("Prepare for the defence");
    }

    @Override
    public String select() {
        return "Executing DefenceStrategy";
    }

}
