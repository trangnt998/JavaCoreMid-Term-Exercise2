package password;

import java.util.Scanner;

public class Password {
    /*
    Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên,
        trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . - _ …
            1. Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu
            2. Nếu thiếu một trong các ký tự đặc biệt thì thông báo mật khẩu chưa đủ mạnh

     */
    public static String inputPassword() {
        System.out.println("Nhập Password dài từ 10 kí tự trở lên, chứa cả chữ in hoa, số và kí tự đặc biệt: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean isWeakPassword(String strPass) { //true nếu password yếu
        return strPass.length() < 10;
    }

    public static boolean isNotEnoughStrongPassword(String strPass) {//true nếu password không đủ mạnh (thiếu kí tự đặc biệt)
        char c;

        for (int i = 0; i < strPass.length(); i++) {
            c = strPass.charAt(i);
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    public static void checkPassword(String strPass) {
        if (isWeakPassword(strPass)) {
            System.out.println("Mật khẩu yếu");
        } else if (isNotEnoughStrongPassword(strPass)) {
            System.out.println("Mật khẩu chưa đủ mạnh");
        }

    }


}
