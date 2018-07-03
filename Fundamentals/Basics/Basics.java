import java.lang.Exception;
import java.lang.Integer;
import java.util.ArrayList;

public class Basics {
    // 1.
    public static void print1to255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // 2
    public static void printOddTo255() {
        for (int i = 1; i <= 255; i += 2) {
            System.out.println(i);
        }

    }

    // 3
    public static void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New Number:  " + i + " " + "Sum: " + sum);
        }

    }
    ///4
    public static void IterateArray(Object[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    ///5
    public static void findMax(int[] arr){
        for(int i=0, max = arr[0];i<arr.length;i++){
            max = arr[i];
            if (i == arr.length - 1)
            System.out.println(max);
            }
        }
    //6
    public static void findAvg(int[] arr){
        int avg = 0; 
        for(int i=0;i<arr.length;i++){
           avg += arr[i];
            }
            System.out.println(avg /arr.length);
        }

    //7
    public static void arrOdds(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++) {
            if(i % 3 == 1){ 
                newArr.add(i);
            } 
        }
        System.out.println(newArr);

    }

    //8
    public static void greaterThanY(int[] arr, int y){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }
    //9
    public static void squareVals(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
                newArr.add(arr[i] * arr[i]);
        }
        System.out.println(newArr);
    }
    //10
    public static void noNegatives(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
             if (arr[i]>=0){
                newArr.add(i);
               }
        }
        System.out.println(newArr);
    }
    //11
    public static void maxMinAvg(int[] arr){
            ArrayList<Object> newArr = new ArrayList<Object>();
            int sum = 0;
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++){
                if (arr[i]>max){
                    max = arr[i];   
                }
                if (arr[i]<min){
                    min = arr[i];
                }
                sum += arr[i];
            }
            double avg = sum/arr.length; // this will give a float
            newArr.add(min); //in order
            newArr.add(max);
            newArr.add(avg);
            System.out.println(newArr);
        }

        //12
        public static void shiftingVals(int[] shiftArr) {
            for(int i = 0; i < shiftArr.length-1; i++) {
              shiftArr[i] = shiftArr[i+1];
            }
            shiftArr[shiftArr.length-1] = 0;
            System.out.println(arrays.toString(shiftArr));
          }
    

    public static void main(String[] args) {
        // Basics.print1to255();
        // Basics.printOddTo255();
        // Basics.printSum();
        // Basics.IterateArray(new Object[]{10,20,30,40,50});
        //  Basics.findMax(new int[]{15,20,50,40,59});
        // Basics.findAvg(new int[]{2,2,2,2});
        //Basics.greaterThanY(new int[]{2,28,7,2}, 9);
        //  Basics.maxMinAvg(new int[]{1, 5, 10, -2});
         Basics.shiftingVals(new int[]{1, 5, 10, 7, -2}); // this is not working. need to ask Erik about.
    }
}
