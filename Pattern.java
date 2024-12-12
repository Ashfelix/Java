import java.util.Scanner;
public class Main2
{
    public static void main(String[] args){
        int r,c;
        Scanner imbatocome = new Scanner(System.in);
        int n = imbatocome.nextInt();

        for(r = 1;r<=n;r++){
            for(c=1;c<=r;c++){
                if(r==1||c==1||c==n||r==n||r==c){
                System.out.print(" * ");
                }
            }System.out.println();
        }
    }
}