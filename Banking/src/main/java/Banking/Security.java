/*
 * Manages security
 */
package Banking;

/**
 *
 * @author Daniel
 */
public class Security {

    int[] id; // Security attempts of all ids

    public Security(int id) {
        this.id = new int[id];
    }

    public boolean strongPass(String pass) { // Checks if password is strong
        boolean upper = false;
        boolean lower = false;
        boolean number = false;
        if (pass.length() >= 8) { // Must be above 8 characters
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isLowerCase(pass.charAt(i))) { // Has lowercase
                    lower = true;
                } else if (Character.isUpperCase(pass.charAt(i))) { // Has uppercase
                    upper = true;
                } else if (Character.isLetter(i) == false) { // Has number
                    number = true;
                }
            }
            if (number && lower && upper) { // If it has lowercase, uppercase, and number, it is strong
                return true;
            } else { // not strong
                return false;
            }
        } else { // bellow 8 characters
            return false;
        }

    }

}
