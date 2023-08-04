package aula_0408.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thais", "9787324248");
        Aluno aluno2 = new Aluno("Carlos", "76875734657");
        Aluno aluno3 = new Aluno("Diego", "09890234234");
        List<Aluno> alunos  = new ArrayList<Aluno>(List.of(aluno1, aluno2, aluno3));

        Professor professor = new Professor("Almir", "12345678-9");

        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAlunos().get(2).getNome());
        System.out.println(curso.getAlunos().get(2));
    }
}