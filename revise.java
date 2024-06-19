import java.util.*;

public class revise {
    public static void main(String[] args) {
        int [] arr = {4,6,3,5,8,2};
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }   
    }
     
}
