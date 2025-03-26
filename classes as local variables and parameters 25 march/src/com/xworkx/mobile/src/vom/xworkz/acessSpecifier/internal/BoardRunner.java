package vom.xworkz.acessSpecifier.internal;

public class BoardRunner {
    public static void main(String[] args) {
        BoardTeacher boardTeacher = new BoardTeacher();
        BoardStudent boardStudent = new BoardStudent();

        boardTeacher.teach();
        boardStudent.listen();
    }
}
