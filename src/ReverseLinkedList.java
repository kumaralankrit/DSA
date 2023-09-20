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

    public static Node reverseLinkedList(Node head) {
        Node tempNode = null;
        while (head != null) {
            Node temp = head.next;      //Making a temp node and pointing it to next of head
            head.next = tempNode;       //Pointing head's next to dummy node which was initially assigned to null
            tempNode = head;            //Assigning dummy node to current head
            head = temp;                //Moving head to the new temp node
        }
        return tempNode;
    }


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