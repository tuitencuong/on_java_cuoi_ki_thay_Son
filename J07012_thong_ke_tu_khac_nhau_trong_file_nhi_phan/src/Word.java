public class Word implements Comparable<Word>{
    private String word;
    private int soLuong;

    public Word(String word, int soLuong) {
        this.word = word;
        this.soLuong = soLuong;
    }

    public String getWord() {
        return word;
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public String toString() {
        return word+" "+soLuong;
    }

    @Override
    public int compareTo(Word o) {
        if(soLuong!=o.soLuong) return o.soLuong-soLuong;
        return word.compareTo(o.word);
    }
}
