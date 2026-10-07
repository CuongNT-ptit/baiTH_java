public class Main {
    public static void main(String[] args) {
        Classroom lop = new Classroom("D25CQCC05");

        lop.addStudent(new Student("B25CQCC047", "Cường", 8, 7.5, 9));
        lop.addStudent(new Student("B25CQCC058", "Bằng", 9, 6, 7));
        lop.addStudent(new Student("B25CQCC123", "Duy", 7, 5, 8));
        lop.addStudent(new Student("B25CQCC169", "Minh", 8, 5, 5));
        lop.addStudent(new Student("B25CQCC025", "Bình", 6, 3, 4));

        try {
            lop.addStudent(new Student("B25CQCC047", "Toàn", 7, 7, 7));
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }

        lop.inBangDiem();
    }
}
