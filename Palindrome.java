import java.util.Scanner;
class fifth{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str);
        String rev = "";
        String temp = "";
        int size = str.length();
        for (int i = size-1;i>=0;i--){
            rev = rev+str.charAt(i);
            rev.join(temp);
        }
        System.out.println(rev);
        if(rev.equals(str)){
            System.out.println("yeahahaha");
        }
        else{
            System.out.println("nuhuh");
        }
         
    }

}