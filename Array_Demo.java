/* Question->   Multiplay odd Indexed element by 2 and 10 to even indexed elements  */

public class Array_Demo {
    public static void main(String[] args) {
        int[] arr = { 1, 46, 8, 9, 5, 3};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            if(i%2 != 0)
                arr[i]*=2;
        
            else 
                arr[i]+=10;
                   
        }  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
