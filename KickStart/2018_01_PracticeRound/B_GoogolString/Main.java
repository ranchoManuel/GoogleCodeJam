import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int casos = Integer.parseInt(br.readLine());
			construirSecuencia();
			for (int i = 0; i < casos; i++)
			{
				//Separar informacion pertinente
				long desiredNumber = Long.parseLong(br.readLine());
				String rta = solucionarCaso(desiredNumber);

				//---------------------------------------------

				String solucion = "Case #"+(i+1)+": "+rta;
				System.out.println(solucion);
			}
		}
	}

	private static void construirSecuencia() {
		StringBuilder sb0 = new StringBuilder("0");
		StringBuilder sb1 = new StringBuilder();
		double desiredSecuence = Math.pow(10, 100);
		for (double i=0; i<desiredSecuence; i++) {
			char[] secondPart = sb0.toString().toCharArray();
			for (int j=0; j<secondPart.length/2; j++) {
				char temp = secondPart[j]; 
				secondPart[j] = secondPart[secondPart.length-1-j];
				secondPart[secondPart.length-1-j] = temp;
			}
			for (int j=0; j<secondPart.length; j++) {
				if (secondPart[j] == '0') secondPart[j] = '1';
				else if (secondPart[j] == '1') secondPart[j] = '0';
			}

			sb1 = sb0.append("0").append(secondPart);
			sb0 = sb1;
		}

		System.out.println(sb1);

	}

	private static String solucionarCaso(long d)
	{
		String rta="" + d;
		return rta;
	}
}
