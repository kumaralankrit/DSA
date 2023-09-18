import java.util.HashSet;

public class LengthOfLoopInLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;

        System.out.println(lengthOfLoop(head));

    }

    private static int lengthOfLoop(Node head) {
        Node p = head;
        HashSet<Node> hashSet = new HashSet<Node>();
        int temp = 0;
        while (p != null) {
            if (hashSet.contains(p)) {
                break;
            } else {
                hashSet.add(p);
                p = p.next;
                temp++;
            }
        }
        Node q = head;
        int gemp = 0;
        while (q != p) {
            gemp++;
            q = q.next;
        }
        return temp - gemp;
    }
}