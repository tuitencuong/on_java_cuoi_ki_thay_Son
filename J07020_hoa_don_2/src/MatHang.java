public class MatHang {
    private String id,ten,donViMua;
    private int giaMua,giaBan;

    public MatHang(String id, String ten, String donViMua, int giaMua, int giaBan) {
        this.id = id;
        this.ten = ten;
        this.donViMua = donViMua;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getDonViMua() {
        return donViMua;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
}
