public class DuplicateElement {  
public static void main(String[] args) {
	int [] arr = new int [] {1,11,22,44,66,22,44,66,1100};  
        System.out.println("Duplicate elements in given array: ");
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  