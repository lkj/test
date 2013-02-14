public class Pracownik {
	protected String nazwisko;
	protected int stawka, staz;

	protected Pracownik(String nazwisko, int stawka, int staz) {
		this.nazwisko = nazwisko;
		this.stawka = stawka;
		this.staz = staz;
	}

	public boolean premia() {
		if (staz >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public double wyplata() {
		if (premia()) {
			return stawka + 0.25 * stawka;
		} else {
			return stawka;
		}
	}
}
