public class SearchInLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println(seachElement(head, 3));
    }

    private static boolean seachElement(Node head, int search) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == search) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
