package stack;

import java.util.NoSuchElementException;

/**
 *
 * @author yoyo
 */
public class LinkedStack {

    protected Node top;
    protected int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    //to check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    //to get the size of the stack
    public int getSize() {
        return size;
    }

    public void push(int data) {
        Node nptr = new Node(data, null);
//        if (top == null) 
//        {
//            top = nptr;           
//        } else 
//        {
//            Node oldTop = top;
//            top = nptr;
//            nptr.setLink(top);
//        }
        if(top == null)
        {
            top = nptr; 
        }else
        {
        
        Node oldtop  = top;
        top = nptr;
        top.setLink(oldtop);
        }
        
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        Node ptr = top;
        top = ptr.getLink();
        size--;
        return ptr.getData();
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return top.getData();
    }
    
    public void display()
    {
        System.out.print("\nStack = ");
        if(size == 0)
        {
            System.out.println("Empty\n");
            return;
        }
        Node ptr = top;
        while(ptr != null)
        {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
                
       System.out.println();
    }

}
