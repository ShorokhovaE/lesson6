package lesson6;

public class Task2 {

public boolean checkArray(int[] arr){

    boolean elementOne = false;
    boolean elementFour = false;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] != 1 && arr[i] != 4){
            return false;
        }
        if(arr[i] == 1){
            elementOne = true;
        }
        if(arr[i] == 4){
            elementFour = true;
        }
    }
    if(!elementOne || !elementFour){
        return false;
    }
    return true;
}

}
