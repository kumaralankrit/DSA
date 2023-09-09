public class InsertNodeInLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node resultHead = insertNodeAtHead(head, 7);
        while (resultHead != null) {
            System.out.print(resultHead.data + " ");
            resultHead = resultHead.next;
        }

    }

    private static Node insertNodeAtHead(Node head, int data) {
        if (head == null) {
            return null;
        }
        Node newNode = new Node(7);
        newNode.next = head;
        head = newNode;
        return head;
    }

}
