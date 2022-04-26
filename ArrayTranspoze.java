import java.util.Arrays;
import java.util.Scanner;
public class ArrayTranspoze {
    public static void main(String[] args) {
        int[][] matris, transpoze;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen kaç sütunlü bir matris istediğinizi yazın : ");
        int bStun = inp.nextInt();
        System.out.print("Lütfen kaç satırlı bir matris istediğinizi yazın : ");
        int aSatir = inp.nextInt();
        matris = new int[aSatir][bStun];
        transpoze = new int[bStun][aSatir];
        for (int i = 0; i < aSatir; i++) {
            System.out.print("Lütfen " + (i + 1) + ". satıra gelecek elemanları boşluk bırakarak giriniz : ");
            for (int j = 0; j < bStun; j++) {
                matris[i][j] = inp.nextInt();
            }
        }

        System.out.println("Matris : ");
        for (int i = 0; i < aSatir; i++) {
            for (int j = 0; j < bStun; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");

        for (int i = 0; i < aSatir; i++) {
            for (int j = 0; j < bStun; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        for (int i = 0; i < bStun; i++) {
            for (int j = 0; j < aSatir; j++) {
                System.out.print(transpoze[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev