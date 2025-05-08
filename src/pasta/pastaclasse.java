package pasta;

import java.util.Scanner;

public class pastaclasse {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String nomePessoa;
    int idadepessoa;
	float horasTrabalhadas, valorHora = 25.0f;
	double salarioTotal;
    boolean demitido = false;
		
  System.out.println("Informe seu nome:");
  nomePessoa = sc.next();	
System.out.println("informe a sua idade");
 idadepessoa = sc.nextInt();
 System.out.println("Informe horas trabalhadas:");
 horasTrabalhadas = sc.nextFloat();
 salarioTotal = horasTrabalhadas * valorHora;
	
	System.out.println("nome.....: "+ nomePessoa);
	System.out.println("Idade....: "+ idadepessoa);
	System.out.println("Hrs/trab...: "+ horasTrabalhadas);
	System.out.println("Salario total: "+ salarioTotal);
	
	}
}
