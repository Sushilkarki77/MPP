package lesson5.labs.prob1.rulesets;

import java.awt.Component;

//import lesson5.labsolns.prob1.gui.CDWindow;
import lesson5.labs.prob1.gui.BookWindow;
import lesson5.labs.prob1.gui.CDWindow;

import static lesson5.labs.prob1.rulesets.BookRuleSet.isValidPrice;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {

    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub

        if (!(ob instanceof CDWindow cdWindow)) throw new RuleException("Invalid component type.");

        String artist = cdWindow.getArtistValue();
        String price = cdWindow.getPriceValue();
        String title = cdWindow.getTitleValue();

        if (artist.trim().isEmpty()) {
            throw new RuleException("Artist cannot be empty!");
        }

        if (!isValidPrice(price)) {
            throw new RuleException("Not a valid Price!");
        }

        if (title.trim().isEmpty()) {
            throw new RuleException("Title cannot be Empty");
        }


    }

}
