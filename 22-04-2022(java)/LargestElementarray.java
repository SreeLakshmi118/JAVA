public class LargestElementarray {  
    public static void main(String[] args) {  
  
          
        int [] arr = new int [] {235, 511, 57, 5, 6};  
        
        int max = arr[0];  
         
        for (int i = 0; i < arr.length; i++) {  
         
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in  array: " + max);  
    }  
}  