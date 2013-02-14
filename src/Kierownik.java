public class Kierownik extends Pracownik {
	protected int dodatek;

	public Kierownik(String nazwisko, int stawka, int staz, int dodatek) {
		super(nazwisko, stawka, staz);
		this.dodatek = dodatek;
	}

	public double nagroda() {
		if (staz >= 10) {
			return 0.5 * stawka;
		} else {
			return 0.25 * stawka;
		}
	}

	public double wyplata() {
		return super.wyplata() + 400;
	}
}