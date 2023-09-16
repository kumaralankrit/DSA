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
        Node tempNode = null;
        while (head != null) {
            Node temp = head.next;
            head.next = tempNode;
            tempNode = head;
            head = temp;
        }
        return tempNode;
    }

    /*
    Step 1 = Making a temp node and pointing it to next of head
    Step 2 = Pointing head's next to dummy node which was initially assigned to null
    Step 3 = Assigning dummy node to current head
    Step 4 = Moving head to the new temp node
    */

    /*private static Node reverseLinkedList(Node head) {
        Node curr = head, prev = null, Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }*/
}