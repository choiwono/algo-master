package 기타;

public class Student {
    private int id;
    private String name;
    private int math;
    private int eng;
    private int kor;

    public Student(int id, String name, int math, int eng, int kor) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.eng = eng;
        this.kor = kor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
}
