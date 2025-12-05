public class MonHoc implements Comparable<MonHoc>{
    private String id,ten;
    private int soTin;
    private String lyThuyet,thucHanh;

    public MonHoc(String id, String ten, int soTin, String lyThuyet, String thucHanh) {
        this.id = id;
        this.ten = ten;
        this.soTin = soTin;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public String getId() {
        return id;
    }

    public String getThucHanh() {
        return thucHanh;
    }

    @Override
    public String toString(){
        return id+" "+ten+" "+soTin+" "+lyThuyet+" "+thucHanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return id.compareTo(o.getId());
    }
}
