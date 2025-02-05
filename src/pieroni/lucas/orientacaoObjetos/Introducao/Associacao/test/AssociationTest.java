package pieroni.lucas.orientacaoObjetos.Introducao.Associacao.test;

import pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain.Local;
import pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain.Professor;
import pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain.Seminary;
import pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain.Student;

public class AssociationTest {
    public static void main(String[] args) {
        Local local = new Local("Anywhere everywhere");
        Student student01 = new Student("Lucas", 23);
        Student student02 = new Student("Luffy", 17);
        Professor professor01 = new Professor("Charles", "Science");
        Professor professor02 = new Professor("Jack", "Security");
        Student[] studentsSeminary = {student01, student02};

        Seminary seminary01 = new Seminary("Evolution of species", local, studentsSeminary);

        Seminary[] avaliableSeminary = {seminary01};

        professor01.setSeminaries(avaliableSeminary);
        professor02.setSeminaries(avaliableSeminary);

        professor01.print();
    }
}
