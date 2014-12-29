public class Krug {
	public static double MOJ_PI = Math.PI;
	private double poluprecnik;

	public double getPovrsina() {
		return poluprecnik * poluprecnik * MOJ_PI;
	}

	public double getObim() {
		return 2 * poluprecnik * MOJ_PI;
	}

	public void setPoluprecnik(double noviPoluprecnik) {
		if (noviPoluprecnik > 0) {
			poluprecnik = noviPoluprecnik;
		} else {
			throw new RuntimeException("Poluprecnik mora biti pozitivan!");
		}
	}

	public Krug(double poluprecnikKruga) {
		poluprecnik = poluprecnikKruga;
	}

	public void ispisiKrug() {
		System.out.println("#######");
		System.out.println(poluprecnik);
		System.out.println(getObim());
		System.out.println(getPovrsina());
		System.out.println("#######");
	}
	public String toString(){
		return String.format("r:%4f; obim:%4f, povrsina:%4f",poluprecnik,getObim(),getPovrsina());
	}
}
