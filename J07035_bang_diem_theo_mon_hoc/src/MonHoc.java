public class MonHoc {
    private String id,ten;
    private int soTin;

    public MonHoc(String id, String ten, int soTin) {
        this.id = id;
        this.ten = ten;
        this.soTin = soTin;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getSoTin() {
        return soTin;
    }
}
