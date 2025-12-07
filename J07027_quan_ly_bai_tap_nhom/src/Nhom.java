public class Nhom implements Comparable<Nhom>{
    private SinhVien sinhVien;
    private BaiTap baiTap;

    public Nhom(SinhVien sinhVien, BaiTap baiTap) {
        this.sinhVien = sinhVien;
        this.baiTap = baiTap;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public BaiTap getBaiTap() {
        return baiTap;
    }

    @Override
    public String toString(){
        return sinhVien.getId()+" "+sinhVien.getTen()+" "+sinhVien.getSdt()+" "+
                baiTap.getId()+" "+baiTap.getTen();
    }

    @Override
    public int compareTo(Nhom o) {
        return sinhVien.getId().compareTo(o.sinhVien.getId());
    }
}
