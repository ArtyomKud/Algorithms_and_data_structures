public class HomeWork3 {
    private Node head;

    private class Node {
        private Node next;
        private int value;
    }

    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public boolean contains(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }


    public void removeLast() {
        if (head != null) {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }

    public void reverse(){
        Node node = head;
        Node headOld = head;

        while (node != null){
           head = node;
           node = node.next;
        }

        Node temp = head;


        while (headOld != temp) {
            node = headOld;
            while (node != temp) {
                if (node.next == temp) {
                    temp.next = node;
                    temp = node;
                    break;
                }
                node = node.next;
            }

        }
        headOld.next = null;
    }




    public StringBuilder printNode(){
        StringBuilder str = new StringBuilder("");
        Node node = head;
        while (node != null){
            str.append(node.value);
            node = node.next;
        }
        return str;

    }

}
