
public class Karte {

	public static void main(String[] args) {
		int [] spil =noviSpil();
		
		
	}
	public static void promijesaj(int[] spil, int brojPromjena){
		for(int i=0;i<brojPromjena;i++){
			zamijeniDvijeKarte(spil);
		}
	}
	public static int []noviSpil(){
		int[] karte= new int [52];
		for(int i =0;i<karte.length;i++){
			karte[i]=i+1;
		}
		return karte;
	}
	public static int randomKarta(){
		return (int)(Math.random() *52);
				
	}
	public static void zamijeniDvijeKarte(int[]spil){
		int prva=randomKarta();
		int druga=randomKarta();
		zamjeni(spil,prva,druga);
	}
	public static void zamjeni(int [] niz, int prvoMjesto, int drugoMjesto){
		int tmp=niz[prvoMjesto];
		niz[prvoMjesto]=niz[drugoMjesto];
		niz[drugoMjesto]=tmp;
		
	}

}
