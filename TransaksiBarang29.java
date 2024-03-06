class TransaksiBarang29 {
    Barang[] barangs;
    Barang[] pembelians;
    int jumlahBarang;
    int jumlahPembelian;

    public TransaksiBarang29(int ukuran) {
        barangs = new Barang[ukuran];
        pembelians = new Barang[ukuran];
        jumlahBarang = 0;
        jumlahPembelian = 0;
    }

    public void tambahBarang(Barang barang) {
        if (jumlahBarang < barangs.length) {
            barangs[jumlahBarang++] = barang;
        } 
    }

    public void tampilkanBarang() {
        System.out.println();
        System.out.println("======================");
        System.out.println("Daftar Barang");
        System.out.println("======================");
        System.out.printf("%-5s %-15s %-10s %-5s\n", "Kode", "Nama", "Harga", "Stok");
        for (int i = 0; i < jumlahBarang; i++) {
            Barang barang = barangs[i];
            System.out.printf("%-5s %-15s %-10.1f %-5d\n", barang.kode, barang.nama, barang.harga, barang.stok);
        }
    }

    public void tampilkanPembelian() {
        System.out.println("======================");
        System.out.println("Daftar Pembelian");
        System.out.println("======================");
        System.out.printf("%-5s %-15s %-10s %-5s\n", "Kode", "Nama", "Harga", "Stok");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang barang = pembelians[i];
            System.out.printf("%-5s %-15s %-10.1f %-5d\n", barang.kode, barang.nama, barang.harga, barang.stok);
        }
    }
    

    public void beli(String kode) {
        System.out.println();
        for (int i = 0; i < jumlahBarang; i++) {
            if (barangs[i].kode.equals(kode)) {
                if (jumlahPembelian < pembelians.length) {
                    pembelians[jumlahPembelian++] = barangs[i];
                    System.out.println("Pembelian berhasil: " + barangs[i].nama);
                } else {
                    System.out.println("Daftar pembelian penuh");
                }
                return;
            }
        }
        System.out.println("Barang " + kode + " tidak ditemukan.");
    }
}
