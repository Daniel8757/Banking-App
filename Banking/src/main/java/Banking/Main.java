/*
 * Method for online banking
 * Contains login
 * Requires strong pasword
 * Locks out if attempted wrong password three times
 * Can reset password
 */
package Banking;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Daniel
 */
public class Main { // Opens the user interface to login and creates datafile

    public static void main(String[] args) throws FileNotFoundException, Exception {
        File file = new File("data.txt");
        Login log = new Login();
        log.setVisible(true);
    }

}
