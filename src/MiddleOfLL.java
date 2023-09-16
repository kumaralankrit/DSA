public class MiddleOfLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node middleNode = middleElementOfLL(head);
        System.out.println(middleNode.data+" ");
    }

    //Tortoise Hare Approach
    private static Node middleElementOfLL(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null&&slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}