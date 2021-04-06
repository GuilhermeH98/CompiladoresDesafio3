import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Nome do arquivo que vai ser gerado com as respostas.
				File arquivo = new File("respostas.txt");
				FileWriter fw = new FileWriter(arquivo);
				PrintWriter pw = new PrintWriter(fw);
				Scanner scan;
				
				try 
				{
					// Colocar o nome do arquivo aqui para testar.
					scan = new Scanner(new File("nomedoarquivo.txt"));        
					while (scan.hasNext()) 
					{
						String frase = scan.nextLine();
						String[] linhas = { frase } ;
						
						for (String paraValidar : linhas)
						{
							
						}
					}
					
				} 
				catch (Exception e)
				{
					System.out.println("Não encontrou o arquivo");
				}
				finally {
				pw.close();
				System.out.println("Arquivo texto criado");
				}
			}

	}

}
