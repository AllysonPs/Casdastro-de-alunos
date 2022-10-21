
package cadastroaluno;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        int opc, qtdNotas;
        float nota = 0;
        String nome;
        String cpf;
        Sala novaSala = new Sala();
        Aluno novoAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("\n------------------");
            System.out.println("        Menu        ");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir um aluno");
            System.out.println("2 - Listar um aluno");
            System.out.println("3 - Situações");
            System.out.println("4 - Sair");
            
            opc = teclado.nextInt();
            teclado.nextLine();
            
            switch(opc){
                case 1:
                    System.out.println("\nNome: ");
                    nome = teclado.nextLine();
                    System.out.println("\nCPF: ");
                    cpf = teclado.nextLine();
                    
                    novoAluno = new Aluno(nome, cpf);
                    
                    System.out.println("\nQuantidade de notas: ");
                    qtdNotas = teclado.nextInt();
                    
                    for(int i = 0; i < qtdNotas; i++){
                        System.out.println("\nNotas" + (i + 1));
                        nota = teclado.nextFloat();
                        
                    novaSala.inserirAluno(novoAluno);
                        
                    }
                    break;
                case 2:
                    novaSala.listarAlunos();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    default:
                System.out.println("\nOpção inválida!");
        }
            
        }while(opc != 0);
        
    }
}
