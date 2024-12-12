import java.util.*;
class JOJO{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        /*for(int i = N;i>=0;i--){
            for(int j = N;j<=i;j--){
                //if(i==N||j==1||j==N||j==i) {
                    System.out.print(" + ");
                //} else {
                 //   System.out.print("   ");
                //}
            }System.out.println();
        }*/
       for (int i = 1;i<=N;i++) {
        for(int j = 1;j<=i;j++){
            if(i+j>N){
            System.out.print(" * ");
            }
            else{
            System.out.print("   ");}
        }
        System.out.println();   
       }
    }
}