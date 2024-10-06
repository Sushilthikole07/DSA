
    class LNode
{
   int data;
   LNode next;
   LNode(int d)
   {
      data = d;
   }
}

class TNode
{
   int val;
   TNode left;
   TNode right;
   TNode(int v)
   {
     val = v;
   }
}

class MyLinkedList
{
   LNode head = null;
   void add(int d)
   {
      LNode n = new LNode(d);
      if(head == null)
      {
          head = n;
      }
      else
      {
         LNode current = head;
         while(current.next != null)
         {
             current = current.next;
         }
         current.next = n;
      }
   }
}

class BST
{
   public static void main(String args[])
   {
      MyLinkedList l = new MyLinkedList();
      String s = "1 2 3 4 5 6 7";
      String sarr[] = s.split("\\s+");
      for(int i=0;i<sarr.length;i++)
      {
          l.add(Integer.parseInt(sarr[i]));
      }
      LNode current = l.head;
      while(current != null)
      {
         System.out.print(current.data + " ");
         current = current.next;
      }
   }
    
}
