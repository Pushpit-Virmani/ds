import java.io.*;
    class Node
{
static  int info;
 static Node next;
  Node(int info)
  {
    this.info=info;
    next=null;
  }
}

class ok
{
static  Node head;

  public Node reverse(Node curr,Node prev)
  {
    if(curr.next==null)
    {
    head=curr;
    curr.next=prev;
    return null;

    }

    Node next1=curr.next;
      curr.next=prev;

       reverse(next1,curr);
       return head;

  }

  // public void call()
  // {
  //   prev=head;
  //   head=head.next;
  //   head= reverse(head,prev);
  // }

  public void print( Node head1)
  {

    while(head1 != null)
    {


      System.out.print(head1.info+"->");
      head1=head1.next;

}
    System.out.println(head1.info);
  }
  public static void main(String args[])throws IOException
  {


       ok list = new ok();
       list.head = new Node(1);
      // list.head.next = new Node(2);
      //  list.head.next.next = new Node(3);
      //  list.head.next.next.next = new Node(4);
      //  list.head.next.next.next.next = new Node(5);
      //  list.head.next.next.next.next.next = new Node(6);
      //  list.head.next.next.next.next.next.next = new Node(7);
      //  list.head.next.next.next.next.next.next.next = new Node(8);


    System.out.println("the original is:");
    list.print(head);
    // Node hello=list.reverse(head,null);
    //   System.out.println("the reversed is is:");
    //   list.print(hello);


  }
}
