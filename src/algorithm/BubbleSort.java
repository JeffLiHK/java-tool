package algorithm;

/**
 * @author Jeff Li, Kong Shuen
 * @date 7/6/2021 - 13:56
 * @description Bubble Sort of array
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,-2,6,-3,-1,-7,9,12,-5,0};

        for (int i = array.length-1; i >= 1; i--) {
            boolean exchange = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    exchange = true;
                }
            }
            if (!exchange){
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
