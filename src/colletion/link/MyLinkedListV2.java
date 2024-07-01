package colletion.link;

public class MyLinkedListV2 {
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
    
    //추가 코드
    //코드로 보고 이해하기 굉장히 어렵다. 그림을 그리면서 이해하자
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = this.first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }
    
    //추가 코드
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node removeValue;
        if (index == 0) {
            removeValue = first;
            first = first.next;
        } else {
            Node prev = getNode(index - 1);
            removeValue = prev.next;
            prev.next = removeValue.next;
        }
        size--;
        return removeValue.item;
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
