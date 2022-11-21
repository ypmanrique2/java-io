package br.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscrituraFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("texto-file-writer.txt");
		fileWriter.write("Primera linea via file writer");
		fileWriter.write(System.lineSeparator());
		fileWriter.write("Segunda linea via file writer");
		fileWriter.close();
		
	}
}
