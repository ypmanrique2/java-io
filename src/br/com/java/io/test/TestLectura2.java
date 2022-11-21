package br.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestLectura2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("archivo.csv"), "UTF-8");
		String linea;
		while (scanner.hasNextLine() && (linea = scanner.nextLine()) != null) {
//			System.out.println(linea);
			// Usando Split
			String[] lineas = linea.split(";");
			System.out.println(lineas);
			System.out.println(String.format("%s;%s;%s;%s;%s", lineas));
//			System.out.println(lineas[1]);
			
			System.out.println(String.format("Diego tiene %d anhos", 29));
			
			// Usando Scanner
//			Scanner lineaScanner = new Scanner(linea);
//			lineaScanner.useDelimiter(";");
//			String valor;
//			while (lineaScanner.hasNextLine() && (valor = lineaScanner.nextLine()) != null) {
//				System.out.println(valor);
//			}
		}
	}

}