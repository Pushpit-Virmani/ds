import java.io.*;
class Node
{
  Node next;
  int info;
  Node(int info)
  {
    this.info=info;
    next=null;
  }
}

class Om
{
static  Node head;
public void push(int key)
{
  Node newnode=new Node(key);
  newnode.next=head;
  head=newnode;
}
public void display()
{
  Node current1=head;
  while(current1!=null)
  {
    System.out.print(current1.info+",");
    current1=current1.next;
  }
}

public Node reverse(Node current,Node prev)
{
  if(current.next==null)
  {
      head=current;
    current.next=prev;

    return null;

  }
  Node next1=current.next;
  current.next=prev;
 reverse(next1,current);
  return head;
}



public void del(int key)
{
  Node current=head;
  Node prev=null;

  if(head.info==key)
  {
  //  head.next=null;
    head=head.next;
    return ;
  }
  while(current.info!=key)
  {
    prev=current;
    current=current.next;
  }
  prev.next=current.next;
  current.next=null;
}
public static void main(String[] args) {
  Om o1=new Om();

  o1.push(1);
  o1.push(2);
  o1.push(3);
  o1.push(5);
  o1.push(2);
  o1.push(10);

o1.display();
System.out.println();
o1.reverse(head,null);
o1.del(1);
o1.reverse(head,null);
o1.display();

}

}
