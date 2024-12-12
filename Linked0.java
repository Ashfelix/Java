class Linked_list{
private Node head;
private Node tail;
private int len;

    void printlist() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public Linked_list(int value){
    Node newnode = new Node(value);
    head = newnode;
    tail = newnode;
    len = 1;
}

}
class Linked0{
    public static void main(String[] args){
        Linked_list yas = new Linked_list(6);
        yas.printlist();
    }
    private Node head;
    public void printlist() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            temp = temp.next;
        }
        
    }

    private static class Node {

        private boolean value;
        private Node next;

        public Node() {
        }
    }
}
