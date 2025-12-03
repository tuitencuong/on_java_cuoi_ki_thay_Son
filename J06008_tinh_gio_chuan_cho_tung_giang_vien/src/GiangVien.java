import java.util.HashMap;
import java.util.LinkedHashMap;

public class GiangVien {
    private String maGiangVien,ten;
    private LinkedHashMap<String,Double> map;
    public GiangVien(String maGiangVien, String ten) {
        this.maGiangVien = maGiangVien;
        this.ten = ten;
        this.map=new LinkedHashMap<>();
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getTen() {
        return ten;
    }

    public void setGio(String id, double gio) {
        map.merge(id, gio, Double::sum);
    }
    public void in() {
        double[] sum = {0.0};
        System.out.println("Giang vien: " + ten);

        map.forEach((key, value) -> {
            sum[0] += value;
            System.out.println(key + " " + value);
        });

        System.out.println("Tong: " + String.format("%.2f",sum[0]));
    }
}