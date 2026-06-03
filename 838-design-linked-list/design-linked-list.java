class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head = null;
    int size = 0;
    
    public int get(int index) {
        int i = 0;
        Node temp = head;

        if(index < 0 || index >= size){
            return -1;
        }

        while(temp != null && i != index){
            temp = temp.next;
            i++;
        }

        if(temp == null) return -1;

        return temp.data;
    }
    
    public void addAtHead(int val) {
        if(head == null){
            head = new Node(val);
            size++;
            return;
        }

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if(head == null) {
            head = new Node(val);
            size++;
            return;
        }

        Node newNode = new Node(val);
        Node temp=head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node temp = head;
        Node newNode = new Node(val);

        if(index < 0) index = 0;
        if(index > size) return;

        if(index == 0){
            addAtHead(val);
            return;
        }

        int i = 0;

        while(temp != null && i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        Node temp = head;
        int i = 0;

        if(head == null) return;

        if(index == 0){
            head = head.next;
            size--;
            return;
        } 

        while(temp != null && i < index-1){
            temp = temp.next;
            i++;
        }

        if(temp == null || temp.next == null) return;

        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */