public class Liste {
    Node head = null;
    Node tail = null;

    public boolean isEmpty()
    {
        if (head == null)
        {
            return true;
        }
        return false;
    }

    public Node insertFromHead(Node n)
    {

        if (isEmpty())
        {
            head = n;
            tail = n;
            return head;
        }

        head.previous = n;
        n.next = head;
        head = n;
        return head;
    }

    public String printFromHead()
    {
        Node n = head;
        String res = "";

        if(isEmpty())
        {
            System.out.println("List is empty");
        }

        while(n != null)
        {
            res += n.data;
            n = n.next;
        }
        return res;
    }

    public String printFromTail()
    {
        Node n = tail;
        String res = "";

        if(isEmpty())
        {
            System.out.println("List is empty");
        }

        while(n != null)
        {
            res += n.data;
            n = n.previous;
        }
        return res;
    }

    public Node removeFromHead()
    {
        if(isEmpty())
        {
            return null;
        }
        if(head == tail)
        {
            head = null;
            return head;
        }

        Node n = head;
        head.next.previous = null;
        head = head.next;

        return n;
    }
}
