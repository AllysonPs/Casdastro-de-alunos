
package cadastroaluno;

import java.util.ArrayList;

public class Sala {
  ArrayList <Aluno> listaAlunos;  
    
   public Sala(){
       this.listaAlunos = new ArrayList<>();
   }
   
   void inserirAluno(Aluno novoAluno){
       listaAlunos.add(novoAluno);
   }
   
   void listarAlunos(){
       System.out.println("\nLista de alunos");
       
       for(Aluno alunoNaLista: listaAlunos){
           alunoNaLista.listar();
       }
   }
}
