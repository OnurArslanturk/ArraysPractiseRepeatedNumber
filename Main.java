
public class Main {
    static boolean isFound(int [] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    static void toStr(int[] arr){
        for (int i : arr){
            if (i != 0) System.out.print(i + ", ");
        }
    }
    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,2,4,4};
        int[] duplicate = new int[list.length];
        int index = 0;
        for (int i = 0; i <list.length; i++){
            for (int j= 0; j <list.length; j++){
                if((i!=j) && (list[i] == list[j])){
                    if (list[i] %2 == 0) {
                        if (!isFound(duplicate, list[i]))duplicate[index++]= list[i];
                    }
                    break;
                }
            }
        }
        toStr(duplicate);
    }
}


//https://app.patika.dev/onurarslanturk
//www.patika.dev