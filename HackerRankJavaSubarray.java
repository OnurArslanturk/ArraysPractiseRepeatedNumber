import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class HackerRankJavaSubarray {
    public static void main(String[] args) {
        int[] arr;
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n>=1 && n<=100) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }
            int posIndex = 0, counter=0;
            n=0;
            while(posIndex<=arr.length){
                for(int i = posIndex;i < arr.length; i++){
                    if((n=n+arr[i]) <0)counter++;
                }
                n=0;
                for(int i = posIndex;i < 0; i--){
                    if((n+=arr[i])<0) counter++;
                }
                posIndex++;
                n=0;
            }
            System.out.println(counter);
        }
    }
}
