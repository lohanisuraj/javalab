
package lab1.pkg1.pkg2;

public class Lab112 {
    
    public static void main(String[] args) {
        int[] arr = new int[]{34,23,4,43,65,61,94};
        bubbleSort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void bubbleSort(int[] arr){
        for(int i = arr.length-1; i > 0;i--){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
