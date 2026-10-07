public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("B25DCCC047", "Ngô Tuấn Cường", 10, 8, 9);
        Student sv2 = new Student("B25DCCC146", "Phan Việt Bằng", 9, 6.5, 7);
        Student sv3 = new Student("B25DCCC028", "Phạm Quang Duy", 8, 5, 4.5);

        System.out.println(sv1.getMssv() + " - " + sv1.getName() + " - " + sv1.diemTrungBinh());
        System.out.println(sv2.getMssv() + " - " + sv2.getName() + " - " + sv2.diemTrungBinh());
        System.out.println(sv3.getMssv() + " - " + sv3.getName() + " - " + sv3.diemTrungBinh());

        sv1.setDiemGK(-1);
        sv1.setDiemGK(11);
        System.out.println("Diem GK sv1: " + sv1.getDiemGK());

        sv1.setDiemCK(5);
        System.out.println("DTB sv1: " + sv1.diemTrungBinh());
        System.out.println("DTB sv2: " + sv2.diemTrungBinh());
    }
}