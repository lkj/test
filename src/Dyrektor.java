public class Dyrektor extends Kierownik{
//komentarz
	protected int delegacje;
	
	public Dyrektor(String nazwisko, int stawka, int staz, int dodatek, int delegecje) {
		super(nazwisko, stawka, staz, dodatek);
		this.delegacje = delegecje;
	}
	
	public double trzynastka(){
		if (premia())
			return stawka*0.75d;
		else
			return stawka*0.5d;
	}
	
	public double wyplata() {
		return super.wyplata() + delegacje;
		}
	
}
