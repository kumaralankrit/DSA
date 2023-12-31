public class RemoveNthNodeFromEndInLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node resultHead = deleteNthNodeFromEnd(head, 4);
        while (resultHead != null) {
            System.out.print(resultHead.data + " ");
            resultHead = resultHead.next;
        }
    }

    private static Node deleteNthNodeFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
