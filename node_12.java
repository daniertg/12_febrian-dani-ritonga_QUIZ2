public class node_12 {
    Pembeli pembeli;
    Pesanan pesanan;
    node_12 prev, next;

    node_12(node_12 prev, Pembeli Pembeli, Pesanan pesanan, node_12 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }
}
