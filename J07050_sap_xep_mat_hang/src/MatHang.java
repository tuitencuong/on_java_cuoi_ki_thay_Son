public class MatHang {
    private String id,ten,loai;
    private Double giaMua,giaBan;

    public MatHang(String id, String ten, String loai, Double giamua, Double giaBan) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.giaMua = giamua;
        this.giaBan = giaBan;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public Double getGiaMua() {
        return giaMua;
    }

    public String getLoai() {
        return loai;
    }

    public String getTen() {
        return ten;
    }

    public String getId() {
        return id;
    }
    public Double loiNhuan(){
        return giaBan-giaMua;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+loai+" "+String.format("%.2f",loiNhuan());
    }

}
