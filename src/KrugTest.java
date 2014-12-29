public class KrugTest {

	public static void main(String[] args) {
		Krug maliKrug = new Krug(1.0);
		Krug velikKrug = new Krug(2.0);
		maliKrug.ispisiKrug();
		velikKrug.ispisiKrug();
		maliKrug.setPoluprecnik(3.0);
		maliKrug.ispisiKrug();
		System.out.println(maliKrug.getObim());
		System.out.println(maliKrug.getPovrsina());
		System.out.println("Ovo je mali krug "+ maliKrug.toString());
	}

}
