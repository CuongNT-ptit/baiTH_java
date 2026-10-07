public class Main {
    public static void main(String[] args) {
        Student sv = new Student("Lan", 8, 7.5, 9);
        sv.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");
        Student sv2 = new Student("Cường", 9, 6, 7);
        Student sv3 = new Student("Duy", 7, 5, 8);

        System.out.println(sv.getMssv());
        System.out.println(sv2.getMssv());
        System.out.println(sv3.getMssv());
        System.out.println(Student.getTotalStudents());
        System.out.println(sv.getEmail() + " " + sv.getSdt());
    }
}