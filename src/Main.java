import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,4, 2, 8, 56, 34, 28, 67};
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));


    }

    public static void heapSort(int[] arr) {
        for(int i = arr.length/2-1; i>=0; i--){
            heapBuilding(arr, arr.length, i);
        }

        for(int i = arr.length-1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapBuilding(arr, i, 0);
        }

    }



    public static void heapBuilding(int[] arr, int lendhth, int number) {
        int parent = number;
        int leftChild = 2 * number +1;
        int rightChild = 2 * number + 2;

        if(leftChild < lendhth && arr[parent] < arr[leftChild]){
            parent = leftChild;
        }
        if(rightChild < lendhth && arr[parent] < arr[rightChild]){
            parent = rightChild;
        }

        if(parent != number){
            int temp = arr[number];
            arr[number] = arr[parent];
            arr[parent] = temp;

            heapBuilding(arr, lendhth, parent);
        }


    }
}
