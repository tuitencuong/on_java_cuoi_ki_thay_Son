public class TranDau implements Comparable<TranDau>{
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

    @Override
    public int compareTo(TranDau o) {
        if(o.doanhThu()!=doanhThu()) return o.doanhThu()-doanhThu();
        return clb.getTen().compareTo(o.clb.getTen());
    }
}
