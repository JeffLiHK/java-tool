package data_structure.list.array_list;

/**
 * @author Jeff Li, Kong Shuen
 * @date 8/6/2021 - 18:05
 * @description
 */
public class ArrayUtil {

    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr){
        return getSum(arr) / arr.length;
    }

    public void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int index2 = arr[arr.length-i-1];
            int temp = arr[i];
            arr[i] = arr[index2];
            arr[index2] = temp;
        }
    }

    public int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void print(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public int getIndex(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element)
                return i;
        }
        return -1;
    }


}
