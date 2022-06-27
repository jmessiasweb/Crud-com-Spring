package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("joao");
        Aluno aluno2 = new Aluno("maria");
        Aluno aluno3 = new Aluno("pedro");

        Curso curso1 = new Curso("java completo");
        Curso curso2 = new Curso("web 2023");
        Curso curso3 = new Curso("react nativo");

        curso1.adcionarAluno(aluno1);
        curso1.adcionarAluno(aluno2);

        curso2.adcionarAluno(aluno1);
        curso2.adcionarAluno(aluno3);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso" + curso3.nome);
            System.out.println("... eo meu nome e " + aluno.nome);

        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("java completo");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
