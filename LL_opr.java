import java.util.*;

public class LL_opr {
    

    static class Node
    {
        int data;
        Node next;
        Node head;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static void insert(Node root,int ele)
    {
        Node temp = new Node(ele);
        temp.next=null;

        if(root.head==null)
        {
            root.head = temp;
        }
        else
        {
            Node last = root.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            last.next = temp; 
        }
    }

    static int delete(Node root)
    {
        Node temp = root.head;
        if(temp==null)
        {
            System.out.println("Empty List!!");
            return -1;
        }
        else
        {
            int ans =  temp.data;
            root.head = temp.next;
            return ans;
        }
    }

    static void displayList(Node root)
    {
        Node temp = root.head;

        if(temp==null)
        {
            System.out.println("List is Empty");
            return;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static Node reverseLL(Node root)
    {
        Node prev = null;
        Node curr = root;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
        return root;
    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int opt = 0;
       Node root = new Node(0);
       do{
        opt = sc.nextInt();
        switch(opt)
        {
            case 1 ://Insert
                    int ele = sc.nextInt();
                    insert(root,ele);
                    break;
            case 2 ://delete
                    int del = delete(root);
                    System.out.println(del);
                    break;
            case 4 ://display
                    displayList(root);
                    break;
            case 3 ://reverse LL
                    root.head = reverseLL(root.head);
                    break;
        }
       }while(opt<5);

    }
}