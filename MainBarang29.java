import java.util.Scanner;

public class MainBarang29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransaksiBarang29 transaksi = new TransaksiBarang29(5);

        transaksi.tambahBarang(new Barang("K01", "Sabun", 1000, 5));
        transaksi.tambahBarang(new Barang("K02", "Pasta Gigi", 2000, 10));
        transaksi.tambahBarang(new Barang("K03", "Biore", 3000, 23));
        transaksi.tambahBarang(new Barang("K04", "Shampoo", 4000, 55));
        transaksi.tambahBarang(new Barang("K05", "Sikat Gigi", 5000, 65));

        System.out.println("===========================");
        System.out.println("TOKO MAJU MUNDUR CANTIK 29");
        System.out.println("===========================");

        int pilihan;
        do {
            System.out.println();
            System.out.println("1. TampilkanBarang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Pilih [1-4]: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan kode barang: ");
                    String kode = scanner.next();
                    transaksi.beli(kode);
                    break;
                case 3:
                    transaksi.tampilkanPembelian();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}