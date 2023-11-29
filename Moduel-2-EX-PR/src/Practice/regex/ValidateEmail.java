package Practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    private Matcher matcher;
    private static Pattern pattern;

    public ValidateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateEmail emailExample = new ValidateEmail();
        String str = "nhhiepit@gmail.com";
        String str2 = "ab@gmail.com";
        String str3 = "@hiepit@gmail.com";
        String str4 = "1hiepit@gmail.com";


        System.out.println("Email is " + str + " is valid:" + emailExample.validate(str));
        System.out.println("Email is " + str2 + " is valid:" + emailExample.validate(str2));
        System.out.println("Email is " + str3 + " is valid:" + emailExample.validate(str3));
        System.out.println("Email is " + str4 + " is valid:" + emailExample.validate(str4));

    }
}
