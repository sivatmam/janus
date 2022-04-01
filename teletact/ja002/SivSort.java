package teletact.ja002;

import java.util.Arrays;

public class SivSort {

  public static int[] sort(int[] arr){
    
    int temp;
    for(int j = 0; j < arr.length; j++)
      for(int i = 0; i < arr.length - 1; i++){
        temp = arr[i];
        if (temp > arr[i+1]){
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }

    return arr;
  }
  
  public static void main(String[] args){

    int[] unsort = {5, 3, 2, 7, 1, 23, 12, 4, 8, 16, 33, 0, 14};

    System.out.println(Arrays.toString(unsort));

    long startTime = 0;
    long endTime = 0;


    int[] sivsort = Arrays.copyOf(unsort, unsort.length);
   
    startTime = System.nanoTime();
      SivSort.sort(sivsort);
    endTime = System.nanoTime();    
    System.out.println(Arrays.toString(sivsort));
    System.out.println("Duration: " + String.valueOf(endTime-startTime));
    
    int[] javasort = Arrays.copyOf(unsort, unsort.length);

    startTime = System.nanoTime();
      Arrays.sort(javasort);
    endTime = System.nanoTime();
    System.out.println(Arrays.toString(javasort));
    System.out.println("Duration: " + String.valueOf(endTime-startTime));
  }

}
