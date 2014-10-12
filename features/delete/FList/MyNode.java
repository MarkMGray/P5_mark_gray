package FList; 

import LApp.Entity; 

public   class  MyNode {
	boolean deleted;
	
	public MyNode(Entity elem) {
		deleted = false;
	}
	
	public String toString() {
		return original() + " " + deleted;
	}
}
