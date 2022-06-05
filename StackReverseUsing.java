
//Reverse word using stack
import java.util.Scanner;

class ReverseString
{
	private char s[];
	private int top;

    public void  createstack(int size)
    {
        top=-1;
        s=new char[size];
    }
    public void push(char e)
    {
        top++;
        s[top]=e;
    }
    
    public void printstack()
    {
        System.out.println("reverse of String is :");
        for(int i=top;i>=0;i--)
        {
            System.out.print(s[i]);
        }
    }
}
public class StackReverseUsing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ReverseString r= new ReverseString();
          Scanner s=new Scanner(System.in);
          System.out.println("Enter String :");
          String str=s.next();
          char arr[]=str.toCharArray();
          r.createstack(arr.length);
          for(int i=0;i<arr.length;i++)
          {
        	  r.push(arr[i]);
          }
          r.printstack();
	}

}