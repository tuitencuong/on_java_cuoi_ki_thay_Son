import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static final int MAX = 10000;
    private static final boolean[] isPrime = new boolean[MAX + 1];

    // Khối static: chỉ sàng 1 lần
    static {
        sieve();
    }

    private static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {                            // tránh duyệt lại các i đã là hợp số
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int[] cnt1 = new int[MAX + 1];
        int[] cnt2 = new int[MAX + 1];

        // Đọc DATA1.in
        try (ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"))) {
            ArrayList<Integer> ds1 = (ArrayList<Integer>) ois1.readObject();
            for (int x : ds1) {
                if (0 <= x && x <= MAX && isPrime[x]) {
                    cnt1[x]++;
                }
            }
        }

        // Đọc DATA2.in
        try (ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"))) {
            ArrayList<Integer> ds2 = (ArrayList<Integer>) ois2.readObject();
            for (int x : ds2) {
                if (0 <= x && x <= MAX && isPrime[x]) {
                    cnt2[x]++;
                }
            }
        }

        // Gom output lại in 1 lần
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= MAX; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                sb.append(i).append(' ')
                        .append(cnt1[i]).append(' ')
                        .append(cnt2[i]).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}
