public class intersectionOf2LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            tail=head=newNode;
            return;
        }
        
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;
    }

    public Node intersection(Node LL, Node LL2){
        if(LL == null || LL2 == null){
            return null;
        }

        Node p1 = LL;
        Node p2 = LL2;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;

            if(p1==null){
                p1=LL2;
            }
            if(p2==null){
                p2=LL;
            }
        }
        return p1;
    }
    public void main(String[] args) {
        intersectionOf2LL LL = new intersectionOf2LL();
        LL.addNode(4);
        LL.addNode(1);
        intersectionOf2LL LL2 = new intersectionOf2LL();
        LL2.addNode(5);
        LL2.addNode(6);
        LL2.addNode(1);
        Node common1 = new Node(8);
        Node common2 = new Node(4);
        Node common3 = new Node(5);

        common1.next=common2;
        common2.next=common3;

        LL.tail.next=common1;
        LL2.tail.next=common1;

        System.out.println(intersection(LL.head,LL2.head).data);
    }
}
