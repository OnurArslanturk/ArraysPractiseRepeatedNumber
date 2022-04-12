import java.util.*;
public class HackerRankChallenge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] a = new int[scan.nextInt()];
        scan.close();

        for (int i = 0; i < a.length; i++){
            a[i]=scan.nextInt();
        }
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
