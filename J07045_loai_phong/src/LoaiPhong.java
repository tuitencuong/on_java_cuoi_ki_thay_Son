public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id,loai;
    private int gia;
    private double phi;

    public LoaiPhong(String tmp) {
        String tmp1[]=tmp.split("\\s+");
        this.id = tmp1[0];
        this.loai = tmp1[1];
        this.gia = Integer.parseInt(tmp1[2]);
        this.phi = Double.parseDouble(tmp1[3]);
    }

    public String getId() {
        return id;
    }

    public String getLoai() {
        return loai;
    }

    public int getGia() {
        return gia;
    }

    public double getPhi() {
        return phi;
    }

    @Override
    public String toString() {
        return id+" "+loai+" "+gia+" "+phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.loai.compareTo(o.loai);
    }
}
