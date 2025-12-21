public class ThiSinh implements Comparable<ThiSinh>{
    private String id,ten,ns;
    private double diemLyThuyet,diemThucHanh;

    public ThiSinh(String id, String ten, String ns, double diemLyThuyet, double diemThucHanh) {
        this.id = id;
        this.ten = ten;
        this.ns = ns;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public String getId() {
        return id;
    }

    public double diemThuong(){
        if(diemLyThuyet>=8 && diemThucHanh>=8) return 1;
        if(diemLyThuyet>=7.5 && diemThucHanh>=7.5) return 0.5;
        return 0;
    }
    public Long tongDiem(){
        Long tmp= Math.round((diemLyThuyet+diemThucHanh)/2+diemThuong());
        if(tmp>=10) return 10L;
        return  tmp;
    }
    public String ketQua(){
        if(tongDiem()>=9) return "Xuat sac";
        if(tongDiem()>=8) return "Gioi";
        if(tongDiem()>=7) return "Kha";
        if(tongDiem()>=5) return "Trung binh";
        return "Truot";
    }
    public int tuoi(){
        String tmp[]=ns.split("/");
        return 2021 - Integer.parseInt(tmp[2]);
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+tuoi()+" "+tongDiem()+" "+ketQua();
    }

    @Override
    public int compareTo(ThiSinh o) {
        int cmp=o.tongDiem().compareTo(tongDiem());
        if(cmp!=0) return  cmp;
        return id.compareTo(o.getId());
    }
}
