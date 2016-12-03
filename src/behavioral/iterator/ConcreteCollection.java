package behavioral.iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ConcreteCollection implements CollectionIF{
	private List list = new ArrayList();
	  public ConcreteCollection(Object[] objectList) {
	    for (int i=0; i < objectList.length; i++) {
	      list.add(objectList[i]);
	    }
	  }
	  public IteratorIF iterator() {
	    return new ConcreteIterator(this);
	  }
	  public Collection elements() {
	    return Collections.unmodifiableList(list);
	  }
}
