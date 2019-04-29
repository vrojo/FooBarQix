public class FooBarQix {

    static String compute(int givenNbr) {
        if (givenNbr == 0)
            return "*";

        StringBuilder number = new StringBuilder();
        if (givenNbr % 3 == 0) {
            number.append("Foo");
        }
        if (givenNbr % 5 == 0) {
            number.append("Bar");
        }
        if (givenNbr % 7 == 0) {
            number.append("Qix");
        }

        String givenNumberString = Integer.toString(givenNbr);
        for (String letter : givenNumberString.split("")) {
            if (letter.equals("0")) {
                number.append("*");
            }
            if (letter.equals("3")) {
                number.append("Foo");
            }
            if (letter.equals("5")) {
                number.append("Bar");
            }
            if (letter.equals("7")) {
                number.append("Qix");
            }
        }
        if (number.toString().equals("")) {
            return givenNumberString;
        }
        return number.toString();
    }
}
