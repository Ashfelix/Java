import java.util.*;
class gobbu{
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);
        int n = h.nextInt();
        int sum = 0;
        int ray[] = new int[n];
        for(int i = 0;i<n;i++){
            ray[i] = h.nextInt();
        }
       //System.out.println(ray);
       //ray[] = {1,2,3,4,5};
        
       // for(int i = 0;i<n;i++){
         //sum = sum + ray[i];
         //}
        //System.out.println(sum);
        for(int i = 0;i<n;i++){
            if(ray[i]%2==0){
                System.out.println("even "+ray[i]);
            }else{
                System.out.println("odd "+ray[i]);
            }
        }
    }
}
