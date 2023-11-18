package CodeGym;

import java.util.Arrays;

public class KeyBoard {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
    public static String[] findWords(String[] words) {
        int count=0;
        for(String word: words) {
            if(checkWordInKey(word)) {
                count++;
            }
        }
        String[] str = new String[count];
        int index= 0;
        for(String word: words) {
            if(checkWordInKey(word)) {
                str[index] = word;
                index++;
            }
        }
        return str;
    }

    // Hàm kiểm tra một chuỗi của words có nằm hết trong 1 trong 3 chuỗi của keyboard không.
    public static boolean checkWordInKey(String word) {
        String lowerWord = word.toLowerCase();
        char[] charWord = lowerWord.toCharArray();
        String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        boolean flag;
        for(String key: keyboard) {
            flag = true;
            for(int i = 0; i < charWord.length; i++) {
                if (key.indexOf(charWord[i]) == -1) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) return true;
        }
        return false;
    }
}
