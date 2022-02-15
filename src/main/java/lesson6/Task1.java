package lesson6;

public class Task1 {

    public int[] pullFromArray(int[] arr){

        if(arr.length == 0){
            System.out.println("Этот массив пустой!");
            return arr;
        }

            for (int i = (arr.length-1); i >= 0; i--) {
                if(arr[i] == 4){
                    int[] newArray = new int[arr.length - i - 1];
                    System.arraycopy(arr, (i+1), newArray, 0, (arr.length - i - 1));
                    return newArray;
                }
            }

            throw new RuntimeException();
    }


}
