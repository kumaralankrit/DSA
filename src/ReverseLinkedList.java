public class ReverseLinkedList {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node reverseHead = reverseLinkedList(head);
        while (reverseHead != null) {
            System.out.println(reverseHead.data + " ");
            reverseHead = reverseHead.next;
        }
    }

    private static Node reverseLinkedList(Node head) {
        Node curr = head, prev = null, Next = null;
        System.out.println("check: " + curr.data);
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
}