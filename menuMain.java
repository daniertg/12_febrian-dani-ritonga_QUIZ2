import java.util.Scanner;
public class menu{
  static String pilih,pilih2;
    static boolean succes = true;
  public static void main(String[] args) {
   

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
                if (pilih2.equals("1")) {
                    tambahAntrian();
                } else if (pilih2.equals("2")) {
                    ();
                } else if (pilih2.equals("3")) {
                    ();
                } else if (pilih2.equals("x")) {
                    succes = false;
                }
            }
}
}
