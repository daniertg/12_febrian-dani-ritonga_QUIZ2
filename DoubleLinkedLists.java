public class DoubleLinkedLists {
    Node_12 head;
    int size;

    DoubleLinkedLists(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Pembeli pem, Pesan pes){
        if (isEmpty()) {
            head = new node_12(null, pem, pes, null);
        } else {
            Node_12 newNode = new Node_12(null, pem, pes, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli pem, Pesan pes){
        if (isEmpty()) {
            addFirst(pem, pes);
        } else {
            Node_12 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node_12 newNode = new Node_12(current, pem, pes, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Menu diterpesan");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
      public void print(){
        if (!isEmpty()) {
            Node_12 tmp = head;
            while(tmp != null){
                
                tmp = tmp.next;
            }
            System.out.println("terisi");
        } else {
            System.out.println("Antrian tidak ada !");
        }
    }
    }
}
