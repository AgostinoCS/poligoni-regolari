import java.util.Scanner;

public class PoligoniRegolari {
	public static void main(String args[]) {
		int input = 0;
		double lato = 0;
		do {
			System.out.println("\nScegliere un poligono regolare");
			System.out.println("1) Triangolo");
			System.out.println("2) Quadrato");
			System.out.println("3) Pentagono");
			System.out.println("4) Esagono");
			System.out.println("5) Ettagono");
			System.out.println("6) Ottagono");
			System.out.println("7) Ennagono");
			System.out.println("8) Decagono");
			System.out.println("9) Dodecagono");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			switch(input) {
			case 1:
				System.out.println("Inserire lato del triangolo (in metri)");
				Scanner scanner2 = new Scanner(System.in);
				lato = scanner2.nextDouble();
				Triangolo triangolo = new Triangolo(lato);
				System.out.println("Il perimetro del triangolo e' " + triangolo.perimetro() + " metri");
				System.out.println("L'area del triangolo e' " + triangolo.area() + " metri quadri");
				break;
			case 2:
				System.out.println("Inserire lato del quadrato (in metri)");
				Scanner scanner3 = new Scanner(System.in);
				lato = scanner3.nextDouble();
				Quadrato quadrato = new Quadrato(lato);
				System.out.println("Il perimetro del quandrato e' " + quadrato.perimetro() + " metri");
				System.out.println("L'area del quadrato e' " + quadrato.area() + " metri quadri");
				break;
			case 3:
				System.out.println("Inserire lato del pentagono (in metri)");
				Scanner scanner4 = new Scanner(System.in);
				lato = scanner4.nextDouble();
				Pentagono pentagono = new Pentagono(lato);
				System.out.println("Il perimetro del pentagono e' " + pentagono.perimetro() + " metri");
				System.out.println("L'area del penagono e' " + pentagono.area() + " metri quadri");
				break;
			case 4:
				System.out.println("Inserire lato dell'esagono (in metri)");
				Scanner scanner5 = new Scanner(System.in);
				lato = scanner5.nextDouble();
				Esagono esagono = new Esagono(lato);
				System.out.println("Il perimetro dell'esagono e' " + esagono.perimetro() + " metri");
				System.out.println("L'area dell'esagono e' " + esagono.area() + " metri quadri");
				break;
			case 5:
				System.out.println("Inserire lato dell'ettagono (in metri)");
				Scanner scanner6 = new Scanner(System.in);
				lato = scanner6.nextDouble();
				Ettagono ettagono = new Ettagono(lato);
				System.out.println("Il perimetro dell'ettagono e' " + ettagono.perimetro() + " metri");
				System.out.println("L'area dell'ettagono e' " + ettagono.area() + " metri quadri");
				break;
			case 6:
				System.out.println("Inserire lato dell'ottagono (in metri)");
				Scanner scanner7 = new Scanner(System.in);
				lato = scanner7.nextDouble();
				Ottagono ottagono = new Ottagono(lato);
				System.out.println("Il perimetro dell'ottagono e' " + ottagono.perimetro() + " metri");
				System.out.println("L'area dell'ottagono e' " + ottagono.area() + " metri quadri");
				break;
			case 7:
				System.out.println("Inserire lato dell'ennagono (in metri)");
				Scanner scanner8 = new Scanner(System.in);
				lato = scanner8.nextDouble();
				Ennagono ennagono = new Ennagono(lato);
				System.out.println("Il perimetro dell'ennagono e' " + ennagono.perimetro() + " metri");
				System.out.println("L'area dell'ennagono e'" + ennagono.area() + " metri quadri");
				break;
			case 8:
				System.out.println("Inserire lato del decagono");
				Scanner scanner9 = new Scanner(System.in);
				lato = scanner9.nextDouble();
				Decagono decagono = new Decagono(lato);
				System.out.println("Il perimetro del decagono e' " + decagono.perimetro() + " metri");
				System.out.println("L'area del decagono e' " + decagono.area() + " metri quadrati");
				break;
			case 9:
				System.out.println("Inserire lato del dodecagono");
				Scanner scanner10 = new Scanner(System.in);
				lato = scanner10.nextDouble();
				Dodecagono dodecagono = new Dodecagono(lato);
				System.out.println("Il perimetro del dodecagono e' " + dodecagono.perimetro() + " metri");
				System.out.println("L'area del dodecagono e' " + dodecagono.area() + " metri quadri");
				break;
			}
		}while(input != 99);
	}
}
