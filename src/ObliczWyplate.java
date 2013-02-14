public class ObliczWyplate {
	public static void main(String args[]) {
		Pracownik osoba1 = new Pracownik("Kowalski", 1200, 12);
		Kierownik osoba2 = new Kierownik("Malinowski", 1600, 3, 500);
		Dyrektor osoba3 = new Dyrektor("Kwiatkowski", 2000, 7, 700, 300);
		System.out.println("Nazwisko: " + "\t" + osoba1.nazwisko);
		System.out.println("Stawka: " + "\t" + osoba1.stawka);
		System.out.println("Staz: " + "\t\t" + osoba1.staz);
		System.out.println("Wyplata: " + "\t" + osoba1.wyplata());
		System.out.println();
		System.out.println("Nazwisko: " + "\t" + osoba2.nazwisko);
		System.out.println("Stawka: " + "\t" + osoba2.stawka);
		System.out.println("Staz: " + "\t\t" + osoba2.staz);
		System.out.println("Dodatek: " + "\t" + osoba2.dodatek);
		System.out.println("Wyplata: " + "\t" + (osoba2.wyplata() + osoba2.nagroda() + osoba2.dodatek));
		System.out.println();
		System.out.println("Nazwisko: " + "\t" + osoba3.nazwisko);
		System.out.println("Stawka: " + "\t" + osoba3.stawka);
		System.out.println("Staz: " + "\t\t" + osoba3.staz);
		System.out.println("Dodatek: " + "\t" + osoba3.dodatek);
		System.out.println("Wyplata: " + "\t" + (osoba3.wyplata() + osoba3.nagroda() + osoba3.dodatek + osoba3.trzynastka()));
	}
}