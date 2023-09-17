public class StartingPointOfLoopInLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next= head.next.next.next;

        System.out.println(startingPoint(head).data);

    }

    private static Node startingPoint(Node head) {
        if (head == null || head.next == null)
            return null;
        Node slow = head;
        Node fast = head;
        Node entry = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {                 //there is a cycle
                while (slow != entry) {         //found staring point of cycle
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}