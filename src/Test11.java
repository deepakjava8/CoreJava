import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test11 {
public static void main(String[] args) {
	LinkedHashSet<Ord> set= new LinkedHashSet<>();
	Ord o1=new Ord();
	o1.setSino(4);
	o1.setItem("Laptop");
	o1.setQty(5);
	
	Ord o2=new Ord();
	o2.setSino(1);
	o2.setItem("Mouse");
	o2.setQty(6);
	
	Ord o3=new Ord();
	o3.setSino(2);
	o3.setItem("KeyBoard");
	o3.setQty(8);
	
	Ord o4=new Ord();
	o4.setSino(3);
	o4.setItem("UPS");
	o4.setQty(2);
	
	set.add(o1);
	set.add(o2);
	set.add(o3);
	set.add(o4);
	
	for(Ord o : set) {
		System.out.println(o);
	}
	System.out.println("---------------");
	List<Ord> list=new ArrayList<Ord>(set);
	for(Ord o : list) {
		System.out.println(o);
	}
	Collections.sort(list,new SortIDComparator());
	System.out.println("---------------");
	for(Ord o : list) {
		System.out.println(o);
	}
}



}
class SortIDComparator implements Comparator<Ord> {
    public int compare(Ord c1, Ord c2) {
        Integer a1 = c1.sino;
        Integer a2 = c2.sino;
        return a1.compareTo(a2);
    }
}

class Ord{
	int sino;
	String item;
	int qty;
	public int getSino() {
		return sino;
	}
	public void setSino(int sino) {
		this.sino = sino;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Ord [sino=" + sino + ", item=" + item + ", qty=" + qty + "]";
	}
	
}
