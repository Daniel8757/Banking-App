/*
 * Class to manipulate the file
 */
package Banking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class checkFile {

    private final FileWriter fw;
    String fileName;

    public checkFile(String fileName) throws IOException {
        this.fw = new FileWriter(fileName, true);
        this.fileName = fileName;
    }

    public void changeMoney(int id, int amount) throws IOException { // Changes money
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        File newfile = new File("tempData.txt");
        File oldFile = new File("data.txt");

        FileWriter fw2 = new FileWriter("tempData.txt", true); // Creates temporary file

        String line;
        String userData[] = new String[3];
        //Writes until it hits the user whose money will be changed
        for (int i = 1; i < id; i++) {
            line = reader.readLine();
            userData[0] = line.split(" ")[0];
            fw2.write(userData[0] + " " + userData[1] + " " + userData[2] + "\n");
            fw2.flush();
        }

        //Changes their money
        line = reader.readLine();
        userData = line.split(" ");
        fw2.write(userData[0] + " " + userData[1] + " " + Integer.toString(Integer.parseInt(userData[2]) + amount) + "\n");
        fw2.flush();
        line = reader.readLine();

        //Writes the rest
        while (line != null) {
            userData = line.split(" ");
            fw2.write(userData[0] + " " + userData[1] + " " + userData[2] + "\n");
            fw2.flush();
            line = reader.readLine();
        }

        //Changes new file to normal file name and overwrites its data
        newfile.renameTo(oldFile);
    }

    public String findMoney(int id) throws IOException {
        //Returns money that a user has
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        String line = null;
        String money[] = new String[3];
        for (int i = 1; i <= id; i++) {
            line = reader.readLine();
        }
        money = line.split(" ");
        return money[2];
    }

    public void newUser(String user, String pass) {
        //Creates a new user
        try {
            fw.write(user + " " + pass + " " + 0 + "\n");
            fw.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int checkExist(String user, String pass) throws IOException {
        //Checks if user can login
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String id[] = new String[3];
        int counter = 1;
        while (line != null) {
            id = line.split(" ");
            if (id[0].equals(user)) {
                if (id[1].equals(pass)) {
                    return counter; // Returns user id(line number)
                } else {
                    return 0; // Wrong password
                }
            }
            counter++;
            line = reader.readLine();
        }
        return -1; // No such user
    }

    public int userId(String user) throws IOException {
        //Finds user ID
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String id[] = new String[3];
        int counter = 1;
        while (line != null) {
            id = line.split(" ");
            if (id[0].equals(user)) {
                return counter;
            }
            counter++;
            line = reader.readLine();
        }
        return -1; // No such user
    }

    public boolean freeName(String user, String pass) throws IOException {
        //Checks if a name is free
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String id[] = new String[3];
        while (line != null) {
            id = line.split(" ");
            line = reader.readLine();
            if (id[0].equals(user)) {
                return false;
            }
        }
        return true;
    }

    public int totalUsers() throws FileNotFoundException, IOException {
        //Finds total number of users
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        int counter = 0;
        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
            counter++;
        }
        return counter;
    }

    public boolean changePass(String username, String oldPass, String newPass) throws FileNotFoundException, IOException {
        //Changes a password
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        File newfile = new File("tempData.txt");
        File oldFile = new File("data.txt");

        FileWriter fw2 = new FileWriter("tempData.txt", true); //Create temporary file

        String line;
        String userData[] = new String[3];

        while (true) { // Copies text from old file to temporary file
            line = reader.readLine();;
            if (line == null) {
                return false;
            }
            userData = line.split(" ");
            if (userData[0].equals(username)) { //If the username matches
                if (userData[1].equals(oldPass)) { // If the password is correct
                    break; // Exits loop
                } else {
                    return false; // Returns false if the password is wrong
                }
            }
            fw2.write(userData[0] + " " + userData[1] + " " + userData[2] + "\n");
            fw2.flush();
        }
        fw2.write(userData[0] + " " + newPass + " " + userData[2] + "\n"); // Changes password
        fw2.flush();
        line = reader.readLine();
        while (line != null) { //Copies rest of code
            userData = line.split(" ");
            fw2.write(userData[0] + " " + userData[1] + " " + userData[2] + "\n");
            fw2.flush();
            line = reader.readLine();
        }
        newfile.renameTo(oldFile); // Renames temp file to overwrite data
        return true;//Returns sucess
    }

}
