package password;

import static password.Password.*;

public class App {
    public static void main(String[] args) {
        String strPass = inputPassword();
        checkPassword(strPass);
    }
}
