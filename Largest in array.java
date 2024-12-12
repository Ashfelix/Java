import java.util.Scanner;
class jo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
              arr[i] = sc.nextInt();

        }
        int l = arr[0];
        for(int i = 0;i<=size-1;i++){
            if(l>arr[i]){
            }else{
                l = arr[i];

            }

        }//System.out.println("second max= "+arr[size-1]);
        System.out.println("max = "+l);
    }
}