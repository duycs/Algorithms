public class LinkedListQueue {
   private Node front, rear; 
   private int queueSize;
  
   private class Node { 
     int data;
     Node next;
   }

   public LinkedListQueue()
   {
     front = null;
     rear = null;
     queueSize = 0;
   }

   public boolean isEmpty()
   {
      return (queueSize == 0);
   }

   public int dequeue()
   {
     int data = front.data;
     front = front.next;
     
     if (isEmpty()) 
     {
     rear = null;
     }
     
     queueSize--;
     return data;
   }

   public void enqueue(int data)
   {
     Node oldRear = rear;
     rear = new Node();
     rear.data = data;
     rear.next = null;
     
     if (isEmpty()) 
     {
       front = rear;
     }
     else  {
       oldRear.next = rear;
     }
     
     queueSize++;
   }
}
