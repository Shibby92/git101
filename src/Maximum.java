public class Maximum {
	public static int getMax(int []brojevi) {
		int max= brojevi[0];
		for(int idx=1;idx<brojevi.length;idx++){
			int trenutni=brojevi[idx];
			if (trenutni>max)
				max=trenutni; 
		}
		return max;
	}
	public static void zamjena(int [] niz, int prvoMjesto, int drugoMjesto){
		int tmp=niz[prvoMjesto];
		niz[prvoMjesto]=niz[drugoMjesto];
		niz[drugoMjesto]=tmp;
	}

	public static void main(String[] args) {		
		int []arr3={1,3,5};
		for(int ispis: arr3){
			System.out.print(ispis+" ");
			
		}
	System.out.println(getMax(arr3));
	zamjena(arr3,0,2);

	}

}
