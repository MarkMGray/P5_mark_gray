package FList; 
import java.io.PrintStream; 
import LApp.Entity; 
import java.util.Iterator; 

public   class  MyList  implements Iterable {
    
	public void delete(MyNode n) {
		n.deleted = true;
	}


}
