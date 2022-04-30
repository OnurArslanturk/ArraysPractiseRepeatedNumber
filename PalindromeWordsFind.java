import java.util.Locale;
import java.util.Scanner;
public class PalindromeWordsFind {
    static boolean isTrue (String str){
        str = str.toLowerCase(Locale.ROOT);
        int i = 0, j =str.length() - 1;
        while (i<j)
        {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("kelimeyi giriniz :");
        System.out.println(isTrue(inp.nextLine()));
    }
}

//https://app.patika.dev/onurarslanturk
//https://github.com/OnurArslanturk?tab=repositories
//https://www.hackerrank.com/onur_arslanturk
//www.patika.dev