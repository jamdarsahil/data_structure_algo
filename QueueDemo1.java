/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class QueueDemo1 
{
  private int q[],MaxSize,rear,front;
  
  public void createQueue(int size)
  {
      MaxSize=size;
      q=new int[MaxSize];
      front=0;
      rear=-1;
  }
  
  public void Enqueue(int e)
  {
      rear++;
      q[rear]=e;
      //q[++rear]=e
  }
  
  public boolean isFull()
  {
      if(rear==MaxSize-1)
          return true;
      else
          return false;
  }

public int Dequeue()
{
    int temp;
    temp=q[front];
    front++;
    return temp;
}
public boolean isEmpty()
  {
      if(front>rear)
          return true;
      else
          return false;
  }
public void printQueue()
{
    for(int i=front;i<=rear;i++)
    {
        System.out.print(q[i]+"--");
    }
}

}




























