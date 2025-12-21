public class TranDau {
    private String id;
    private int soLuong;
    private CLB clb;

    public TranDau(String id, int soLuong, CLB clb) {
        this.id = id;
        this.soLuong = soLuong;
        this.clb = clb;
    }
    public int doanhThu(){
        return soLuong*clb.getGiaVe();
    }
    @Override
    public String toString(){
        return id+" "+clb.getTen()+" "+doanhThu();
    }
}
