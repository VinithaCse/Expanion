import java.util.Scanner;
 
/*  Class Node  */
class Node
{
    public int data;
    public Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
  
}
class linkedList
{
    public Node start;
    public Node end ;
    public int size ;
 
    /*  Constructor  */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    
    /*  Function to insert an element at begining  */
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            nptr.link = start;
            start = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.link = nptr;
            end = nptr;
        }
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink() ;
                ptr.link = nptr;
                nptr.link = tmp;
                break;
            }
            ptr = ptr.getLink();
        }
        size++ ;
    }
    
    public void findMiddle(Node head)\\ to find middle element
    {
       public Node first, second;
       first = head;
       second = new Node(null,null);
       if(head.link !=null){
       second = head.link.link;
       }
       else
       {
         return head;
       }
       while(second != null){
       if(second.next != null){
       second = second.next.next;
       }
       else{
       return first;
       }
       first = first.next;
       }
       System.out.println("The Node at the middle is" + first.value);
   }  
   public void deleteNode(Node pointed)
   {
     public Node delete;
     if(pointed.next == null){
     System.out.println("Its the last node and thus cannot be deleted");
     }
     delete = pointed.next;
     ppointed.data = pointed.next.data;
     pointed.next = pointed.next.next;
   }
   public void loop(Node head)
   {
      public Node first, second;
      first=second=head;
      while(first && seccond)
      {
       first = first.next;
       second = second.next;
       if(!second)
       {
         System.out.println("NO LOOP");
       }
       else
       {
         second=second.next;
       }
       if(first==second){
       System.out.println("Yes there is a loop");
       }
    }
  }
  public void nodefromlast(Node head, int k)
  {
    public Node first,second;
    int i;
    first = second = head;
    while(i<k && secondp != null){
    second = second.next;
    i++;
    }
    if(second==null)
    {
      System.out.println("No such Valid Node");
    }
    while(second.next != null){
    second = second.next
    first=first.next;
    }
    System.out.println("The Node is "+ first.value);
  }
}  
public class SinglyLinkedList
{    
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        linkedList list = new linkedList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. Find nth from last");
            System.out.println("5. Delete a node");
            System.out.println("6. Middle Element");
            System.out.println("7. Loop");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : nodeFromLast(list,2);
                   
                break;
            case 5 : 
                    deleteNode(list);
                break;                   
            case 6 : 
                findMiddle(list);
                break;           
            case 7: 
                  loop(list);
            
                  break;
                  
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            
}
