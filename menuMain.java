public class menuMain {
    static String pilih,pilih2;
    static boolean succes = true;

    
        public static void menu()
        {
            while (succes) {
                System.out.println("================================================");
                System.out.println("Menu");
                System.out.println("1. Tambah antrian");
                System.out.println("2. Cetak antrian");
                System.out.println("3. Hapus Antrian");
                System.out.println("4. Laporan pengurutan by dani");
                System.out.println("5. Hitung total pendapatan");
                System.out.println("6. Keluar");
                System.out.print("pilih:(1-6)");
                pilih2 = sc.nextLine();
              
              
             public static void main(String[] args) throws Exception {
        DoubleLinkedLists mm2 = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int nomorAntrian = 0;
        int pilih;
        String[] nama = {"aren", "aran", "irin", "oron","eren"};
        String[] nohp  = {"081111111", "08222222", "08333333", "084444","08555555"};
        int[] kodePesan = {1,2,3,4};
        String[] namaPesan = {"bakso", "mie ", "Nasi goreng", "burger"};
        int[] harga = {15000, 25000, 10000, 15000};
        
       public static void main(String[] args) {
               
                if (pilih2.equals("1")) {
                     Pembeli pem = new Pembeli(nama[nomorAntrian], notlpn[nomorAntrian], kodePesan[nomorAntrian]);
                    Pesan pes = new Pesan(kodePesan[nomorAntrian], harga[nomorAntrian], namaPesan[nomorAntrian]);
                    mm2.addLast(pem, pes);
                    System.out.println("Nomor Antrian : " + nomorAntrian+1);
                    System.out.println("Nama Customer : " + nama[nomorAntrian]);
                    System.out.println("Nomor Hp : " + nohp[nomorAntrian]);
                    nomorAntrian++;
                } else if (pilih2.equals("2")) {
                    mm2.print();
                } else if (pilih2.equals("3")) {
                    mm2.removeFirst();
                 } else if (pilih2.equals("5")) {
                    mm2.hitungPendapatan();
                } else if (pilih2.equals("6")) {
                    succes = false;
                }
            }
