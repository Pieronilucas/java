package pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain;

public class Seminary {
    private String title;
    private Student[] students;
    private Local local;

    public Seminary(String title) {
        this.title = title;
    }

    public Seminary(Student[] students, String title) {
        this.students = students;
        this.title = title;
    }

    public Seminary(String title, Local local, Student[] students) {
        this.title = title;
        this.local = local;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public String getTitle() {
        return title;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
