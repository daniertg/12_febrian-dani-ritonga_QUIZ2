class linked{
    Linked head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        Linked baru=new Linked();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- data kosong -");
        else{
            System.out.println("data tidak ada : "+head.id);
            head=head.next;
        }
    }
   
    }
}
