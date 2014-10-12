package FList;  

import LApp.Entity;  

public     class   MyNode {
	

    Entity elem;

	
    MyNode right;

	
	
	public MyNode  (Entity elem) {
        this.elem = elem;
        right = null;
    
		left = null;
	
		deleted = false;
	}

	

     private String  toString__wrappee__Base  () {
        return elem.toString();
    }

	
	
	public String toString() {
		return toString__wrappee__Base() + " " + deleted;
	}

	
	
	MyNode left;

	
	boolean deleted;


}
