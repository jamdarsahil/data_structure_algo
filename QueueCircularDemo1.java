/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class QueueCircularDemo1 
{
  private int q[],MaxSize,rear,front,count;
  
  public void createQueue(int size)
  {
      MaxSize=size;
      q=new int[MaxSize];
      front=0;
      rear=-1;
      count=0;
  }
  
  public void Enqueue(int e)
  {
      count++;
      rear=(rear+1)%MaxSize;
      q[rear]=e;
      
   }
  
  public boolean isFull()
  {
      if(count==MaxSize)
          return true;
      else
          return false;
  }

public int Dequeue()
{
    int temp;
    temp=q[front];
    front=(front+1)%MaxSize;
    count--;
    return temp;
}
public boolean isEmpty()
  {
      if(count==0)
          return true;
      else
          return false;
  }
public void printQueue()
{
    int i,c;
    i=front;
    c=0;
    while(c<count)
    {
        System.out.print(q[i]+"--");
        i=(i+1)%MaxSize;
        c++;
    }
}

}




























