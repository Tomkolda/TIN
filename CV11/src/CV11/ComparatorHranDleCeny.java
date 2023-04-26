package CV11;

import java.util.Comparator;

public class ComparatorHranDleCeny implements Comparator<Hrana> {
	@Override
	public int compare(Hrana o1, Hrana o2) {
		Integer cena1 = o1.getCena();
		Integer cena2 = o2.getCena();
		return cena1.compareTo(cena2);
	}
}
