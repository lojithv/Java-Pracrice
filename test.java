public class ReverseArray {  //public class name
    public static void main(String[] args) {  //main method
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5}; //array length 5 (index of 1 = 0, index of 5 = 4) 
        System.out.println("Original array: ");  //log
        for (int i = 0; i < arr.length; i++) {  //for loop 1 to 5
            System.out.print(arr[i] + " ");  //i++ means increment value of i by 1 after each itteration (itteration means cycle)
        }  
        System.out.println(); // empty line 
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  // for loop 5 to 1 
            System.out.print(arr[i] + " ");  // i-- means decrement value of i by 1 after each itteration (itteration means cycle)
        }  
    }  
}