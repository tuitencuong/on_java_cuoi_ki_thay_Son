public class HoaDon {
    private String id;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(String id, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.id = id;
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    @Override
    public String toString(){
        return id+" "+khachHang.getTen()+" "+khachHang.getDiaChi()+" "+
                matHang.getTen()+" "+matHang.getDonViMua()+" "+matHang.getGiaMua()+" "+matHang.getGiaBan()+" "+
                soLuong+" "+(soLuong* matHang.getGiaBan());
    }
}
