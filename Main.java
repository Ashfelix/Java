
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = {2,3,4,5,5,6,6};
        for(int i : a){
           if(i==n){
            System.out.println(i +"is equal to"+ n);
           }else{
            System.out.println("nuh huh");
           }
        }
    }
}


