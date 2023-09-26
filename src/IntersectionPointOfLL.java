public class IntersectionPointOfLL {
    static Node head1 = null;
    static Node head2 = null;

    public static void main(String[] args) {
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head2 = new Node(6);
        head2.next = new Node(7);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(9);
        head2.next.next.next.next = head1.next.next;

        System.out.println(intersectionNode(head1, head2).data);
    }

    private static Node intersectionNode(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        Node a = head1;
        Node b = head2;

        while (a != b) {
            a = a == null ? head2 : a.next;
            b = b == null ? head1 : b.next;
        }
        return a;
    }

}
