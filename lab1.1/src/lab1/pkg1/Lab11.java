/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg1;

/**
 *
 * @author Suraj
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{34,32,5,54,65,34,2};
        int  minimum = min(arr);
        System.out.println("minimum number is "+ minimum);
        int maximum = max(arr);
        System.out.println("maximum number is "+ maximum);
    }
    static int min(int[] arr){
        int m = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < m)
                m = arr[i];
        }
        return m;
    }
    static int max(int[] arr){
        int m = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > m)
                m = arr[i];
        }
        return m;
    }
}
