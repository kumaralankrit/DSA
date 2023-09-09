public class DeleteNodeInLL {
    static Node head = null;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        deleteANodeFromLL(head,3);
        while(head!=null) {
            System.out.print(head.data+ " ");
            head = head.next;
        }
    }

    private static void deleteANodeFromLL(Node head, int data) {
        if(head==null) {
            return;
        }

        Node nodeToBeDeleted = head;
        Node prevNode = null;
        while(nodeToBeDeleted.data!=data) {
            prevNode = nodeToBeDeleted;
            nodeToBeDeleted = nodeToBeDeleted.next;
        }

        if(prevNode!=null) {
            prevNode.next = prevNode.next.next;
            nodeToBeDeleted.next = null;
        }
    }
}
