package dataStructure;

/**
 * 链表操作
 */
public class LinkedList {


    public static void main(String[] args) {
        Node n4 = new Node(4,null);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node node = reverse(n1);
        traversal(node);
    }

    public static Node reverse(Node node){
        Node pre = null;
        Node next = null;
        while(node!=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


    public static void traversal(Node node){
        while (node!=null){
            System.out.println(node.getVal());
            node = node.getNext();
        }
    }

}



class Node{
    public int val;
    public Node next;


    public Node(int val ,Node next){
        this.val = val;
        this.next = next;
    }

    public void setVal(int val){
        this.val = val;
    }
    public int getVal(){
        return this.val;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}

