package pieroni.lucas.javacore.Associacao.test;

import pieroni.lucas.javacore.Associacao.domain.Professor;
import pieroni.lucas.javacore.Associacao.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Kakashi");
        Professor prof2 = new Professor("Iruka");
        Professor[] professors = {prof1, prof2};
        School sch = new School("Konoha", professors);

        sch.print();
    }
}
