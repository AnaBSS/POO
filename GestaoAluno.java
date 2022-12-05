package GestaoAlun;

import java.time.LocalDate;
import java.util.Scanner;

public class GestaoAluno {
	private int indice = 0;
	private Aluno[] aluno = new Aluno [50];
	Scanner scan = new Scanner(System.in);
	
	public void Criar(){
        Aluno a = new Aluno();

        System.out.println("--- Registro de Aluno ---");
        a.setId(0);

        System.out.println("Digite o NOME do aluno: ");
        a.setNome(scan.nextLine());

        System.out.println("Digite a DATA DE NASCIMENTO do aluno: (Digite na ordem: YYYY<ENTER> MM<ENTER> DD<ENTER>)");
        a.setNascimento(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));

        System.out.println("Digite o RA do aluno: ");
        a.setRa(scan.nextLine());

        this.aluno[this.indice] = a;
        this.indice += 1;

        System.out.println("-- Aluno registrado com sucesso! --");
        System.out.println("Pressione <ENTER> para continuar.");
        scan.nextLine();
    }
	
	public void Exibir() {
        System.out.println("Digite o RA do aluno:");
        String ra = scan.nextLine();

        int i = 0;
        while(i < aluno.length){
            Aluno al = aluno[i];
            if(al != null && al.getRa().contains(ra)){
                al.exibir();
            }
            i+= 1;
        }

        System.out.println("Pressione <ENTER> para continuar.");
        scan.nextLine();
    }
	
	public void Remover(){
        System.out.println("Digite o RA completo do aluno que deseja excluir: ");
        String ra = scan.nextLine();

        for(int i = 0; i < this.aluno.length; i++){
            Aluno al = this.aluno[i];
            if(al != null && al.getRa().equals(ra)){
                this.aluno[i] = null;
                System.out.println("-- Aluno removido com sucesso! --");
            }
        }
        System.out.println("Pressione <ENTER> para continuar.");
        scan.nextLine();
    }
	
	public void Alterar() {
        System.out.println("Digite o RA completo do aluno que deseja alterar: ");
        String ra = scan.nextLine();

        for(Aluno a : this.aluno) {
            if(a != null && a.getRa().equals(ra)){
                a.exibir();
 
                for(int i = 0; i < 3; i++) System.out.println();

                System.out.println("Selecione o item que deseja alterar: ");
                System.out.println("(T)udo \t\t (N)ome \t (R)a \t\t (D)ata de nascimento");
                String txtUC = scan.nextLine().toUpperCase();
                char op = txtUC.charAt(0);

                if(op == 'T'){
                    System.out.println("Digite o novo RA do aluno: ");
                    a.setRa(scan.nextLine());
            
                    System.out.println("Digite o novo NOME do aluno: ");
                    a.setNome(scan.nextLine());
            
                    System.out.println("Digite a nova DATA DE NASCIMENTO do aluno: (Digite na ordem: YYYY<ENTER> MM<ENTER> DD<ENTER>)");
                    a.setNascimento(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
            
                } else if(op == 'N'){
                    System.out.println("Digite o novo NOME do aluno: ");
                    a.setNome(scan.nextLine());
                } else if(op == 'R'){
                    System.out.println("Digite o novo RA do aluno: ");
                    a.setRa(scan.nextLine());
                } else if(op == 'D'){
                	System.out.println("Digite a nova DATA DE NASCIMENTO do aluno: (Digite na ordem: YYYY<ENTER> MM<ENTER> DD<ENTER>)");
                    a.setNascimento(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
                }

                System.out.println("-- Atualização de Aluno feita com sucesso! --");
                break;
            }
        }
        System.out.println("Pressione <ENTER> para continuar.");
        scan.nextLine();
    }

	
	public void Menu (){
        while(true) {
            for(int i = 0; i < 30; i++) System.out.println();

            System.out.println("------ Gestão de Alunos ------");
            System.out.println("Selecione uma opção: ");
            System.out.println("(C)riar \t\t (E)xibir\t\t (R)emover");
            System.out.println("(A)tualizar \t\t (S)air");
            String txtUC = scan.nextLine().toUpperCase();
            char letra = txtUC.charAt(0);

            if(letra == 'C'){
                Criar();
            }else if (letra == 'E'){
                Exibir();
            }else if(letra == 'R'){
                Remover();
            }else if(letra == 'A'){
                Alterar();
            }else if(letra == 'S'){
                System.out.println("Fechando Gestão de Alunos.......... \n Até a próxima!");
                System.exit(0);
            }
        }
	}
}
