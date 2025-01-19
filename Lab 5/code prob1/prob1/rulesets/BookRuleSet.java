package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {

    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub

        if (!(ob instanceof BookWindow bookWindow)) throw new RuleException("Invalid component type.");

        String isbn = bookWindow.getIsbnValue();
        String priceValue = bookWindow.getPriceValue();
        String title = bookWindow.getTitle();

        if ((!isValidIsbn10(isbn) && !isValidIsbn13(isbn))) {
            throw new RuleException("invalid ISBN");
        }

        if (!isValidPrice(priceValue)) {
            throw new RuleException("Invalid Price");
        }

        if(title.trim().isEmpty()){
            throw new RuleException("Title cannot be empty");
        }


    }

    public static boolean isValidIsbn10(String isbn) {
        return isbn.length() == 10 && isbn.matches("\\d+") && (isbn.charAt(0) == '0' || isbn.charAt(0) == '1');
    }

    public static boolean isValidIsbn13(String isbn) {
        return isbn.length() == 13 && isbn.matches("\\d+") && (isbn.startsWith("978") || isbn.startsWith("979"));
    }

    public static boolean isValidPrice(String price) {
        try {
            if (!price.matches("\\d+\\.\\d{2}")) {
                return false;
            }
            double priceValue = Double.parseDouble(price);
            return priceValue > 0.49;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
