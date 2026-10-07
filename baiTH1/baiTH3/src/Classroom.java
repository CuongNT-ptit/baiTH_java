import java.util.ArrayList;

public class Classroom {
    private String tenLop;
    private ArrayList<Student> ds = new ArrayList<Student>();

    public Classroom(String tenLop) {
        this.tenLop = tenLop;
    }

    public void addStudent(Student s) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMssv().equals(s.getMssv())) {
                throw new IllegalArgumentException("Trung mssv " + s.getMssv());
            }
        }
        ds.add(s);
    }

    public String xepLoai(Student s) {
        double d = s.diemTrungBinh();
        if (d >= 8) {
            return "Gioi";
        } else if (d >= 6.5) {
            return "Kha";
        } else if (d >= 5) {
            return "Trung binh";
        }
        return "Yeu";
    }

    public void inBangDiem() {
        System.out.println("Lop " + tenLop);
        for (Student s : ds) {
            System.out.println(s.getMssv() + " " + s.getName() + " " + s.diemTrungBinh() + " " + xepLoai(s));
        }
        System.out.println("Si so: " + ds.size());
    }
}