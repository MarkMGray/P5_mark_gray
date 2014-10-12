package LApp;

import java.util.Comparator;

public class Entity implements Comparator<Entity> {
	@Override
	public int compare(Entity o1, Entity o2) {
		if (o1.age < o2.age) {
			return -1;
		} else if (o1.age > o2.age) {
			return 1;
		} else {
			return 0;
		}
	}
}