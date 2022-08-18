package day20Assignment;
import java.util.regex.*;

/**
 * regex program for Day 20 Assignment
 */

public class regex {
     /*
      * Enter valid First name from user
      */

        public boolean firstName(String firstName) {
            Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
    /*
     * Enter valid Last name from user
     */

        public boolean lastName(String lastName) {
            Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        }
    /*
     * enter valid mail id
     */
        public boolean Email(String email) {
            Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[@]+[a-z]{2,5}[.][a-z]{2,4}");
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    /*
     * Enter valid Mobile number with country code
     */
        public boolean MobileNumber(String number) {
            Pattern pattern = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
            Matcher matcher = pattern.matcher(number);
            return matcher.matches();
        }
    /*
     * enter password minimum 8 small latter character
     */
        public boolean pass1(String pass) {
            Pattern pattern = Pattern.compile("[a-z]{8,12}");
            Matcher matcher = pattern.matcher(pass);
            return matcher.matches();
        }
    /*
     * enter password at least one capital latter
     */

        public boolean pass2(String pass) {
            Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z]).{8,}$");
            Matcher matcher = pattern.matcher(pass);
            return matcher.matches();
        }
    /*
     * enter password at least one numeric number
     */
        public boolean pass3(String pass) {
            Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$");
            Matcher matcher = pattern.matcher(pass);
            return matcher.matches();
        }
    /*
     * enter password at least one Special character
     */
        public boolean pass4(String pass) {
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,24}$");
            Matcher matcher = pattern.matcher(pass);
            return matcher.matches();
        }

}


