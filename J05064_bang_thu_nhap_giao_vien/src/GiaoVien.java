public class GiaoVien {
    private String id,ten;
    int luongCoBan;

    public GiaoVien(String id, String ten, int luongCoBan) {
        this.id = id;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
    public int phuCap(){
        String tmp=id.substring(0,2);
        if(tmp.equals("HT")) return 2000000;
        if(tmp.equals("HP")) return 900000;
        if(tmp.equals("GV")) return 500000;
        return 0;
    }
    public int heSoLuong(){
        String tmp=id.substring(2,4);
        return Integer.parseInt(tmp);
    }
    public int thuNhap(){
        return luongCoBan*heSoLuong()+phuCap();
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+heSoLuong()+" "+phuCap()+" "+thuNhap();
    }
}
