package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

public class CustomRuleTest {

    @Rule
    public MyCustomRule customRule = new MyCustomRule("custom");

    @Rule
    public RuleChain chain = RuleChain.outerRule(new MyCustomRule("outer")).around(new MyCustomRule("inner"));

    @Test
    public void customRuleTest(){
        System.out.println("Test OK");
    }

    @Test
    public void ruleChainWorks(){
        System.out.println("Chaining OK");
    }

}
