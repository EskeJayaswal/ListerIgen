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

    public Node insertFromHead(String s)
    {

        Node node = new Node(s);

        if (isEmpty())
        {
            head = node;
            tail = node;
            return head;
        }

        head.previous = node;
        node.next = head;
        head = node;
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
}
