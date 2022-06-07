
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

public class LinearLinkedList 
{
   Node root;
   
   public void createList()
   {
       root=null;
   }

   public void insertLeft(int e)
   {
       Node n=new Node(e);
       if(root==null)
       {
           root=n;
       }
       else
       {
         n.next=root;//1
         root=n;
       }
       System.out.println("Node inserted..");
   }
    public void insertRight(int e)
   {
       Node n=new Node(e);
       if(root==null)
       {
           root=n;
       }
       else
       {
          Node t=root;//1
          while(t.next!=null)//2
          {
              t=t.next;
          }
          t.next=n;//3
       }
       System.out.println("Node inserted..");
   }
    public void deleteLeft()
   {
       if(root==null)
       {
           System.out.println("Empty List");
       }
       else
       {
          Node t=root;//1
          root=root.next;//2
          System.out.println(t.data+" deleted");
       }
       
   }
     public void deleteRight()
   {
       if(root==null)
       {
           System.out.println("Empty List");
       }
       else
       {
          Node t=root;//1
          Node t2=t;//1
          while(t.next!=null)//2
          {
              t2=t;
              t=t.next;
          }
          t2.next=null;//3
          System.out.println(t.data+" deleted");//4
       }
       
   }
     
      public void printList()
   {
       if(root==null)
       {
           System.out.println("Empty List");
       }
       else
       {
          Node t=root;//1
          while(t!=null)
          {
           System.out.print(t.data+"-->");
           t=t.next;
          }
       }     
       }
       
      
      public void search(int key)
       {
       if(root==null)
       {
           System.out.println("Empty List");
       }
       else
       {
          Node t=root;//1
          while(t!=null && t.data!=key)
          {
            t=t.next;
          }
          if(t==null)
              System.out.println("not Found");
          else
              System.out.println("Found");
       }
       
       
       
       
   }
 public static void main(String args[])
  {
     LinearLinkedList obj=new LinearLinkedList();
     Scanner in=new Scanner(System.in);
     int ch,e;
      obj.createList();
      do
      {
          System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right"
                  + "\n5.Print List\n0.Exit\n:");
          ch=in.nextInt();
          switch(ch)
          {
              case 1:
                        System.out.println("Enter element:");
                        e=in.nextInt();
                        obj.insertLeft(e);
                        break;
               
              case 2:
                        System.out.println("Enter element:");
                        e=in.nextInt();
                        obj.insertRight(e);
                        break;
            
                 
                 case 3:
                            obj.deleteLeft();
                            break;
                 
                 case 4:
                           obj.deleteRight();
                            break;
                 
                 case 5:
                           obj.printList();
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














