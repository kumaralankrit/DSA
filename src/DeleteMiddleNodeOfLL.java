public class DeleteMiddleNodeOfLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node resultHead = deleteMiddleNode(head);
        while (resultHead != null) {
            System.out.print(resultHead.data + " ");
            resultHead = resultHead.next;
        }
    }

    private static Node deleteMiddleNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node slow = head;
        Node fast = head;
        Node previous = null;
        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = previous.next.next;
        return head;
    }
}
