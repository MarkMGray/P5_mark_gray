package LApp;  

import java.util.Iterator;  
import FList.*;  
import LApp.Entity;  

public     class   Main {
	

    static MyList mylist  ;

	

     private static void  main__wrappee__Base  (String[] args) {
        // Step 1: initialize list
        mylist = new MyList();

        addArray(mylist, Entity.entArray1);

        // Step 2: print list out
        System.out.println("original list");
        mylist.print(System.out);

        // Step 3: add more entities
        addArray(mylist, Entity.entArray2);

        // Step 4: print list out
        System.out.println("augmented list");
        mylist.print(System.out);

    }

	

    public static void main(String[] args) {
        main__wrappee__Base(args);
        
        //Step 5: remove added nodes
        Entity[] ent = Entity.entArray2;
        for (Iterator i = mylist.iterator(); i.hasNext();) {
        	Entity x = (Entity) i.next();
        	for (int j = 0; j < ent.length; j++) {
        		if (ent[j] == x) {
        			i.remove();
        			break;
        		}
        	}
        }
        
        //Step 6: print remaining nodes
        System.out.println("revised list");
        mylist.print(System.out);
    }

	

    public static void addArray  (MyList l, Entity[] arr) {
        for (int j = 0; j < arr.length; j++) {
            l.insert(arr[j]);
        }
    }


}
