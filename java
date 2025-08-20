package main;
import java.util.Scanner;
public class Professores {

	String nome, disciplina;
	int idade;
	
	
	
	public Professores() {}
	
	void ensinar() {
		
		System.out.println("O professor(a) "+ nome + " está ensinando " + disciplina + "!");
	}
	
	static Professores[] cadastraProf(Professores[] professor, Scanner scanner, int n) {
		System.out.println("\n\n");
		for(int i = 0; i < n; i++) {
			professor[i] = new Professores();
			System.out.printf("Professor %d: \n", i+1);
			System.out.println("Entre com nome:");
			professor[i].nome = scanner.nextLine();
			
			System.out.println("Entre com a idade:");
			professor[i].idade = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Entre com a disciplina:");
			professor[i].disciplina = scanner.nextLine();
			
		}
		
		return professor;
	}
	
	static void imprimeProf(Professores[] professor) {
		int i;
		
		for(i = 0; i < 3; i++) {
			System.out.println("Professor: " + professor[i].nome + "\nIdade: " + professor[i].idade + "\nDisciplina: " + professor[i].disciplina + "\n" );
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos professores: ");
		int numProfs = scanner.nextInt();
		scanner.nextLine();
		Professores[]  professor = new Professores[numProfs];
		
		professor = cadastraProf(professor, scanner, numProfs);
		
		imprimeProf(professor);
		
		
		scanner.close();
	}

}
