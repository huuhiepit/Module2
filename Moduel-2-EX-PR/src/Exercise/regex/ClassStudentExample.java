package Exercise.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassStudentExample {
    public static final String CLASS_REGEX = "^[CAP][0-9]{4,}[GHIK]$";
    public static String[] valid = new String[]{"C0223G","A0323K"};
    public static String[] isValid = new String[]{"P0318I","P023H"};
    public boolean isValid(String regex) {
        Pattern p = Pattern.compile(CLASS_REGEX);
        Matcher m = p.matcher(regex);
        return m.matches();
    }

    public static void main(String[] args) {
        ClassStudentExample st = new ClassStudentExample();

        for(String item: valid) {
            System.out.println("Class is " + item + " is " + st.isValid(item));
        }
        for(String item: isValid) {
            System.out.println("Class is " + item + " is " + st.isValid(item));
        }

    }
}
