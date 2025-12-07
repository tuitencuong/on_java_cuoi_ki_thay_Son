public class BangDiem implements Comparable<BangDiem>{
    private MonHoc monHoc;
    private SinhVien sinhVien;
    private double diem;

    public BangDiem( SinhVien sinhVien,MonHoc monHoc,Double diem) {
        this.diem=diem;
        this.monHoc = monHoc;
        this.sinhVien = sinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public Double getDiem() {
        return diem;
    }

    @Override
    public String toString(){
        return sinhVien.getId()+" "+sinhVien.getTen()+" "+sinhVien.getLop()+" "+
                (diem % 1 == 0 ? String.valueOf((int) diem) : String.valueOf(diem));
    }

    @Override
    public int compareTo(BangDiem o) {
        int cmp= o.getDiem().compareTo(diem);
        if(cmp!=0) return cmp;
        return sinhVien.getId().compareTo(o.sinhVien.getId());
    }
}
