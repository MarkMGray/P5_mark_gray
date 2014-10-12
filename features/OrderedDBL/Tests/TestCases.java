package Tests;

import static org.junit.Assert.*;
import java.util.Iterator;

import org.junit.Test;

import FList.MyList;
import LApp.Entity;
import LApp.Main;

public class TestCases {

	@Test
	public void nodesInOrderTestDBL() {
		MyList myList = new MyList();
		Main.addArray(myList, Entity.entArray1);
		Main.addArray(myList, Entity.entArray2);
		boolean pass = true;
		Iterator i = myList.iterator();
		Entity prev = (Entity) i.next(); 
		while (i.hasNext()) {
			Entity next = (Entity) i.next();
			if (prev.compare(prev, next) > 0) {
				pass = false;
				break;
			}
			prev = next;
		}
		if (pass) {
			System.out.println("Test: Nodes added in order - Passed");
		} else {
			fail("Test: Nodes added in order - Failed");
		}
	}
}