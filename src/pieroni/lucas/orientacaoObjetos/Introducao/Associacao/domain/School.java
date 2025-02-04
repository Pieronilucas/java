package pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain;

public class School {
    private String schoolName;
    private Professor[] professors;

    public School(String name) {
        this.schoolName = name;
    }
    public School(String schoolName, Professor[] professors) {
        this.schoolName = schoolName;
        this.professors = professors;
    }

    public void print() {
        System.out.println(this.schoolName);
        if (professors == null) {
            return;
        }
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}



