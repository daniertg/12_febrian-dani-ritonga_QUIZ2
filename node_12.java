public class node_12 {
    Pembeli pembeli;
    Pesan pesan;
    node_12 prev, next;

    node_12(node_12 prev, Pembeli Pembeli, Pesan pesan, node_12 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesan=pesan;
        this.next=next;
    }
}
