public class CaThi {
    private String id,ngayThi,gioThi,phongThi;

    public CaThi(String id, String ngayThi, String gioThi, String phongThi) {
        this.id = id;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getId() {
        return id;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public String getPhongThi() {
        return phongThi;
    }
}
