package colletion.link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        
        System.out.println(first);
        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        Node.printAll(first);
        
        Node lastNode = Node.getLastNode(first);
        System.out.println(lastNode);
        
        //특정 index의 노드 조회하기
        int index = 2;
        Node node1 = Node.getNode(first, index);
        System.out.println("node1 = " + node1);
        
        //데이터 추가하기
        Node.add(first, "D");
        System.out.println("addNode = " + first);
        Node.add(first, "E");
        System.out.println("addNode = " + first);
        Node.add(first, "F");
        System.out.println("addNode = " + first);
    }
    
    
}
