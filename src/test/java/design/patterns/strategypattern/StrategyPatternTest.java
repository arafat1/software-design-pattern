package design.patterns.strategypattern;

import design.patterns.strategypattern.algorithms.AttackStrategy;
import design.patterns.strategypattern.algorithms.DefenceStrategy;
import design.patterns.strategypattern.algorithms.StandByStrategy;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Changing behavior at run time
 */
public class StrategyPatternTest {

    @BeforeClass
    public static void setUp() {
        System.out.println("Executing Strategy Pattern -> Type: Behavioral");
    }

    @Test
    public void executeStrategyTest() {
        CommanderContext commander = new CommanderContext(new AttackStrategy());
        assertEquals("King sends the commander to attack", "Executing AttackStrategy", commander.executeStrategy());

        // changing behavior at runtime
        commander.changeStrategy(new DefenceStrategy());
        assertEquals("King order the commander to defend", "Executing DefenceStrategy", commander.executeStrategy());

        // changing behavior at runtime
        commander.changeStrategy(new StandByStrategy());
        assertEquals("King order the commander to standby", "Executing StandByStrategy", commander.executeStrategy());

        // if king wants to add a new strategy, he can make a new class implement the WarStrategy interface.
        // He can then pass the relevant strategy according to how able are the commanders.
        // Forexample: CommanderContext Marcus;
        //             CommanderContext Maximus;
        // King can use Marcus for defence and Maximus for attack and may be switch the role after sometime.

        // 1) This is the open close principle: open for extension and close for modification
        // Since we are not implementing strategies directly in the CommanderContext class, we can easily define a
        // new strategy by implementing the WarStrategy and without changin the CommanderContext.
        // A Commander only receives the strategy from the king composition) and can change it as per
        // king's order (set strategy).

        // 2) The implentation details of the strategies are hidden from the outer world
    }

}