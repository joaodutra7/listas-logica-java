package Atividades;

public class Exercicio_07 {

	public static void main(String[] args) {

		int v = 0;

		for (int i = 0; i < 50; i++) {
			v++;
			v += i;
		}

		System.out.println("Soma: " + v);
	}

}