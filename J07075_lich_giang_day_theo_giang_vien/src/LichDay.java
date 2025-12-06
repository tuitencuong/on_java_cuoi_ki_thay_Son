public class LichDay implements Comparable<LichDay>{
    private MonHoc mh;
    private String id;
    private int thu,kip;
    private String tenGiangVien,phong;

    public LichDay(MonHoc mh, String id, int thu, int kip, String tenGiangVien, String phong) {
        this.mh = mh;
        this.id = id;
        this.thu = thu;
        this.kip = kip;
        this.tenGiangVien = tenGiangVien;
        this.phong = phong;
    }

    public int getThu() {
        return thu;
    }

    public int getKip() {
        return kip;
    }

    public String getTenGV() {
        return tenGiangVien;
    }

    @Override
    public String toString(){
        return id+" "+mh.getTen()+" "+thu+" "+kip+" "+phong;
    }

    @Override
    public int compareTo(LichDay o) {
        if(thu!=o.thu) return thu-o.thu;
        if(kip!=o.kip) return kip-o.kip;
        return tenGiangVien.compareTo(o.tenGiangVien);
    }
}