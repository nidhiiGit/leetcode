public class palindromeLinkedList {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;  

    public void addNext(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    } 

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverseHalfLL(Node mid){
        Node curr = mid;
        Node prev=null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;            
        }
        return prev;
    }

    public static boolean checkPalindrome(Node head){
        Node mid = findMid(head);
        
        Node right = reverseHalfLL(mid.next);

        Node left = head;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindromeLinkedList ll = new palindromeLinkedList();
        ll.addNext(1);
        ll.addNext(2);
        ll.addNext(2);
        ll.addNext(1);
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        if(checkPalindrome(head)){
            System.out.println("LL is palindrome");
        }else{
            System.out.println("LL isn't palindrome");
        }
    }
}
