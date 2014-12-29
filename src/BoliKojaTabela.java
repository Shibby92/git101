
public class BoliKojaTabela {

	public static void main(String[] args) {
		int brojRedova=3;
		int brojKolona=5;
		char [][] igra= novaIgra(brojRedova,brojKolona);
		ispisiStanjeIgre(igra);
		char znak= 'X';
		String pozicija="A0";
		odigrajPotez(igra,znak, pozicija);
		odigrajPotez(igra,'Y',"B0");

	}

	private static void odigrajPotez(char[][] igra, char znak, String pozicija) {
		int kolona= pozicija.charAt(0)-'A';
		
		
		int red= Integer.parseInt(pozicija.substring(1));
		igra[red][kolona]=znak;
		ispisiStanjeIgre(igra);
		
	}

	private static void ispisiStanjeIgre(char[][] igra) {
		
	}

	private static char[][] novaIgra(int brojRedova, int brojKolona) {
		return new char [brojRedova][brojKolona];
	}

}
