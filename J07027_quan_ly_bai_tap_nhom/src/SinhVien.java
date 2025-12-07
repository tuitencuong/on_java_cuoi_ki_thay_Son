public class SinhVien {
    private String id,ten,sdt;

    public SinhVien(String id, String ten, String sdt) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }
}
