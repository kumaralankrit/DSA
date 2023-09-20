public class PalindromeLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        System.out.println(checkPalindrome(head));
    }

    public static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;

        //find middle of linked list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the right half
        slow.next = ReverseLinkedList.reverseLinkedList(slow.next);

        //move slow to right half
        slow = slow.next;

        //check if left half is equal to right half or not
        while (slow != null) {
            if (head.data != slow.data)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}