import java.util.*;
public class StackExample 
{
   private int s[],MaxSize,tos; 
   
   public void  createStack(int size)
   {
       MaxSize=size;
       s=new int[MaxSize];
       tos=-1;
   }
   public void push(int e)
   {
       tos++;
       s[tos]=e;
   }
   public boolean isFull()
   {
       if(tos==MaxSize-1)
           return true;
       else
           return false;
   }
   public int pop()
   {
       int temp;
       temp=s[tos];
       tos--;
       return temp;
   }
   
   public int peek()
   {
       return(s[tos]);
   }
   
   public boolean isEmpty()
   {
       if(tos==-1)
           return true;
       else
           return false;
   }
   public void printStack()
   {
       for(int i=tos;i>-1;i--)
       {
           System.out.println(s[i]);
       }
   }
  public static void main(String args[])
  {
      StackExample obj=new StackExample();
      Scanner in=new Scanner(System.in);
      System.out.println("Enter size of stack:");
      int size=in.nextInt();
      int ch;
      obj.createStack(size);
      do
      {
          System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
          ch=in.nextInt();
          switch(ch)
          {
              case 1:
                  if(obj.isFull()!=true)//if(!obj.isFull())
                  {
                      System.out.println("Enter element:");
                      int e=in.nextInt();
                      obj.push(e);
                  }
                  else
                      System.out.println("Stack Full");
                 break;
               
              case 2:
                  if(obj.isEmpty()!=true)//if(!obj.isFull())
                  {
                      System.out.println("element poped: "+obj.pop());
                   }
                  else
                      System.out.println("Stack Empty");
                 break;
                 
                 case 3:
                  if(obj.isEmpty()!=true)//if(!obj.isFull())
                  {
                      System.out.println("element at peek: "+obj.peek());
                   }
                  else
                      System.out.println("Stack Empty");
                 break;
                 
                 case 4:
                  if(obj.isEmpty()!=true)//if(!obj.isFull())
                  {
                      obj.printStack();
                   }
                  else
                      System.out.println("Stack Empty");
                 break;
                 
                 case 0:
                      System.out.println("Thanks for using code... bye");
                      break;
                 
                 default:
                          System.out.println("Error in input");
                      break;
              }
             
      }while(ch!=0);
      
  }
   
}
