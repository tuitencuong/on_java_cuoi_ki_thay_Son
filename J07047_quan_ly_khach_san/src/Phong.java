public class Phong {
    private String id,loai;
    private int donGia;
    private double phiDichVu;

    public Phong(String id, String loai, int donGia, double phiDichVu) {
        this.id = id;
        this.loai = loai;
        this.donGia = donGia;
        this.phiDichVu = phiDichVu;
    }

    public String getId() {
        return id;
    }

    public String getLoai() {
        return loai;
    }

    public int getDonGia() {
        return donGia;
    }

    public double getPhiDichVu() {
        return phiDichVu;
    }
}
