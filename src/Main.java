
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int escolha;
		do {
			menu();
			escolha=Scanner(sc);
			
			if(escolha==1) {
				System.out.println("Digite o caminho:");
				String rota=sc.nextLine();
				
				System.out.println("Retornar:"+ ProcessData.processFile(rota)+"\n");
				}
			else if(escolha==2) {
				System.out.println("Processados:\n");
			for(int x1=0; x1<Database.processedFiles.size(); x1++) {
				System.out.println(Database.processedFiles.get(x1)+"\n");
			}
			}
		}while( a==0);
		
	}
	
	public static void menu() {
		System.out.println("1-Validar/Adicionar Caminho");
		System.out.println("2-Arquivos processados");
		System.out.println("9-Sair");
	}
	public static int Scanner(Scanner sc) {
		int a=sc.nextInt();
		sc.nextLine();
		return a;
	}
}