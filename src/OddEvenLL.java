public class OddEvenLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node resultLL = oddEvenLL(head);
        while (resultLL != null) {
            System.out.print(resultLL.data + " ");
            resultLL = resultLL.next;
        }
    }

    //group all odd place nodes followed by even place nodes
    private static Node oddEvenLL(Node head) {
        if (head == null)
            return null;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
