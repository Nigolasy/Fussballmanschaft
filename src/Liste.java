import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Liste {
	
	public class PersonComparatorName implements Comparator<Person> {
		public int compare(Person p1, Person p2) {
			String obj1 = p1.getName();
			String obj2 = p2.getName();
			if (obj1 == obj2) {
				return 0;
			}
			if (obj1 == null) {
				return -1;
			}
			if (obj2 == null) {
				return 1;
			}
			return obj1.compareTo(obj2);
		}
	}

	public class PersonComparatorSpitz implements Comparator<Person> {
		@Override
		public int compare(Person p1, Person p2) {
			String obj1 = p1.getSpitzname();
			String obj2 = p2.getSpitzname();
			if (obj1 == obj2) {
				return 0;
			}
			if (obj1 == null) {
				return -1;
			}
			if (obj2 == null) {
				return 1;
			}
			return obj1.compareTo(obj2);
		}
	}

	public class PersonComparatorTele implements Comparator<Person> {
		@Override
		public int compare(Person p1, Person p2) {
			String obj1 = p1.getTelnr();
			String obj2 = p2.getTelnr();
			if (obj1 == obj2) {
				return 0;
			}
			if (obj1 == null) {
				return -1;
			}
			if (obj2 == null) {
				return 1;
			}
			return obj1.compareTo(obj2);
		}
	}

	public class PersonComparatorDate implements Comparator<Person> {

		public int compare(Person p1, Person p2) {
			GregorianCalendar x = p1.getBirthday();
			GregorianCalendar y = p2.getBirthday();
			if (x.before(y))
				return -1;
			if (x.after(y))
				return 1;
			return 0;
		}
	}

	ArrayList<Person>	list	= new ArrayList<Person>();

	public Liste() {
		list.add(new Person("jonas", "jonny", "123", "Lange Str. 25, 32051 Herford", 1995, 9, 14));
		list.add(new Person("allahu", "akbar", "024", "Enger Str. 37, 32052 Herford", 1996, 5, 8));
		list.add(new Person("max", "maxi", "023", "Kurze Str. 5, 32049 Herford", 1996, 3, 21));

	}

	public void sortName() {
		Collections.sort(list, new PersonComparatorName());
	}

	public void sortSpitz() {
		Collections.sort(list, new PersonComparatorSpitz());
	}

	public void sortTele() {
		Collections.sort(list, new PersonComparatorTele());
	}

	public void sortBirthday() {
		Collections.sort(list, new PersonComparatorDate());
	}

	public void printListe() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	

}
