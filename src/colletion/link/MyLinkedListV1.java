package colletion.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;
    
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            this.first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }
    
    public Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    
    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }
    
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }
    
    public Node getNode(int index) {
        Node x = this.first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    
    public int indexOf(Object e) {
        Node x = this.first;
        int value = 0;
        if (e == null) {
            return -1;
        }
        while (x != null) {
            if (e.equals(x.item)) {
                return value;
            }
            x = x.next;
            value++;
        }
        return -1;
    }
    
    public int size() {
        return this.size;
    }
    
    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
