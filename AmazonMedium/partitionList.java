package AmazonMedium;
public class partitionList{
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


    public static Node partition(Node head, int x){
        Node leftDummy = new Node(0);
        Node rightDummy = new Node(0);
        Node left = leftDummy;
        Node right = rightDummy;
        Node temp=head;

        while(temp!=null){
            if((temp.data) < x){
                left.next=temp;
                left=left.next;
            }else{
                right.next=temp;
                right=right.next;
            }
            temp=temp.next;
        }
        right.next=null;
        left.next=rightDummy.next;
        return leftDummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println(partition(head,3).data);
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}