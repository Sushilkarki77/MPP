package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;
import java.util.Objects;


import lesson5.labs.prob1.gui.CDWindow;
import lesson5.labs.prob1.gui.BookWindow;


final public class RuleSetFactory {
    private RuleSetFactory() {
    }

    static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

    static {
        map.put(BookWindow.class, new BookRuleSet());
        map.put(CDWindow.class, new CDRuleSet());
    }

    public static RuleSet getRuleSet(Component component) {
        RuleSet ruleSet = map.get(component.getClass());

        if (ruleSet == null) {
            throw new RuntimeException("RulesSet does not exist!");
        }
        return ruleSet;
    }

}
