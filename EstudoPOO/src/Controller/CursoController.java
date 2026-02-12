package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Aluno;
import Model.Professor;

public class CursoController {
    // Classe que vai realizar a interação entre os modelos
    // e a interface view
    private String nomeCurso;
    private Professor professor;// instanciar um obj da classe professor
    private List<Aluno> alunosList;

    // metodos
    // ctor
    // na criacao do curso deve passar o nome do curso e
    // o professor do curso
    public CursoController(String nomeCurso, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;
        this.alunosList = new ArrayList<>();// um vetor de objetos alunos
    }

    // metodos crud
    // adicionar um aluno (create)
    public void adicionarAluno(Aluno aluno) {
        alunosList.add(aluno);
    }

    // Exibir curso (create)
    public void infoCurso() {
        System.out.println("Nome curso: " + nomeCurso);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("===============================");
        // imprimir
        for (Aluno aluno : alunosList) {
            System.out.println(aluno.getNome());
        }
        System.out.println("===============================");
    }

    // Lançar nota (Update)
    public void lancarNotas() {
        // scanner
        Scanner sc = new Scanner(System.in);// ler o terminal
        for (Aluno aluno : alunosList) {
            System.out.println("Informe a nota do aluno: " + aluno.getNome());
            aluno.setNota(sc.nextDouble());
        }
    }
//ver notas dos alunos
 public void statusCurso(){
        System.out.println("Nome Curso: "+nomeCurso);
        System.out.println("Professor: "+professor.getNome());
        System.out.println("============================");
        //imprimir a lista de alunos
        for (Aluno aluno : alunosList) {
            System.out.println(aluno.getNome()+" - nota: "+aluno.getNota());
        }
        System.out.println("============================");
    }

    //delete

}
