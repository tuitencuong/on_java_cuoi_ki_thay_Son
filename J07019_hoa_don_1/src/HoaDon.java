
public class HoaDon {
    private String id;
    private SanPham sanPham;
    private int soLuong;

    public HoaDon(String id, SanPham sanPham, int soLuong) {
        this.id = id;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public int loaiSanPham(){
        if(id.charAt(2)=='1') return 1;
        return 2;
    }

    public int giamGia(){
        int gia=sanPham.getGiaLoai1();
        if(loaiSanPham()==2) gia=sanPham.getGiaLoai2();
        if(soLuong>=150) return soLuong*gia*1/2;
        if(soLuong>=100) return soLuong*gia*3/10;
        if(soLuong>=50) return soLuong*gia*15/100;
        return 0;
    }
    public int thanhTien(){
        int gia=sanPham.getGiaLoai1();
        if(loaiSanPham()==2) gia=sanPham.getGiaLoai2();
        return gia*soLuong-giamGia();
    }

    @Override
    public String toString(){
        return id+" "+sanPham.getTen()+" "+giamGia()+" "+thanhTien();
    }
}
