package Practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "_________", "123456"};
    private static final String[] invalidAccount = new String[]{".@3454", "12345", "1234_", "abcde"};
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();

        for(String account: validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is " + isValid);
        }
        for(String account: invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is " + isValid);
        }

    }
}
