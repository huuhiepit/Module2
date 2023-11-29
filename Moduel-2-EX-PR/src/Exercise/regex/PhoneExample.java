package Exercise.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    public static final String PHONE_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public static String[] phoneValid = new String[]{"(84)-(0978489649)"};
    public static String[] isPhoneValid = new String[]{"(a8)-(222222222)", "(84)-(22b222222)", "(84)-(9812751497)"};

    public static boolean isValid(String regex) {
        Pattern p = Pattern.compile(PHONE_REGEX);
        Matcher m = p.matcher(regex);
        return m.matches();
    }

    public static void main(String[] args) {
        for(String phone: phoneValid) {
            System.out.println("Phone is: " + phone + " is " + isValid(phone));
        }
        for(String phone: isPhoneValid) {
            System.out.println("Phone is: " + phone + " is " + isValid(phone));
        }
    }
}
