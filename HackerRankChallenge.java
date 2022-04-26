import java.util.*;
public class HackerRankChallenge {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int position =0;
        while(position<game.length){
            if (position+leap < game.length && position+1 < game.length) {
                if (game[position + leap] == 0 ) {
                    position += leap;
                } else if (game[position + 1] == 0){
                    position++;
                }
                else if (position+leap == game.length-1 || position+1 == game.length-1) return true;
                else return false;
            }
            else return true;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        if ((q <= 5000) &&(1 <= q)) {
            while (q-- > 0) {
                int n = scan.nextInt();
                if ((n <= 100) && (2 <= n)) {
                    int leap = scan.nextInt();
                    if (leap <= 100 && 0 <= leap) {
                        int[] game = new int[n];
                        for (int i = 0; i < n; i++) {
                            game[i] = scan.nextInt();
                        }
                        // if (leap >= 0)
                        System.out.println((canWin(leap, game)) ? "YES" : "NO");
                    } else break;
                } else break;
            }
        }
        scan.close();
    }
}
