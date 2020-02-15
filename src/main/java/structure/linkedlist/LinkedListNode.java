package structure.linkedlist;

public class LinkedListNode {

    int data;
    LinkedListNode next = null;

    public LinkedListNode(int data) {
        this.data = data;
    }

    void append(int data) {
        LinkedListNode end = new LinkedListNode(data);
        LinkedListNode nextNode = this;
        while (nextNode.next != null) {
            nextNode = nextNode.next;
        }
        nextNode.next = end;
    }

    void delete(int data) {
        LinkedListNode node = this;
        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
    }

    void retrieve() {
        LinkedListNode node = this;
        while (node.next != null) {
            node = node.next;
        }
    }

}
