import java.util.HashMap;

public class HashMapExam {

    public HashMap<Integer, Student> buildMap(Student[] students) {
        HashMap<Integer, Student> map = new HashMap<Integer,Student>();
        for (Student s : students) map.put(s.getId(), s);
        return map;
    }
}
