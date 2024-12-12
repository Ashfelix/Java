import java.util.*;
class NAY
{
	public static void main(String[]args)
	{
	  Scanner obj = new Scanner(System.in);
	  int n = obj.nextInt();
	  if(n<=0){
	      System.out.print("Invalid Input");
	  }else{
	  for(int i = 1;i<=n;i++){
	      for(int j = 1;j<=n;j++){
	          if(j==n||j==1||j==i)
			  {
	              System.out.print("* ");
	          }else{
	              System.out.print("  ");
	          }
	      }System.out.println();
	  }//System.out.println();	
	}
	}
}
