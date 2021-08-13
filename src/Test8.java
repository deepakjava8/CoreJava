import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test8 {
public static void main(String[] args) {
	List<Order> orderList=new ArrayList<>();
	Order o1=new Order();
	o1.setItem("Item-1");
	o1.setQty(3);
	
	Order o2=new Order();
	o2.setItem("Item-1");
	o2.setQty(5);
	
	Order o3=new Order();
	o3.setItem("Item-3");
	o3.setQty(4);
	
	orderList.add(o1);
	orderList.add(o2);
	orderList.add(o3);
	
	List<Order> test = test(orderList);
	System.out.println(test);
}

public static List<Order> test(List<Order> list) {
	List<Order> oList=new ArrayList<>();
	Map<String, List<Order>> map=new HashMap<>();
	int counter=1;
	for(Order o: list) {
		
		if(map.containsKey(o.getItem())){
			List<Order> ordList= map.get(o.getItem());
			if(ordList!=null) {
				Order ord=new Order();
				for(Order od:ordList) {
					
					ord.setSino(ordList.size()+1);
					ord.setItem(o.getItem());
					ord.setQty(od.getQty()+o.getQty());
				}
				ordList.add(ord);
			}
			map.put(o.getItem(), ordList);
		} else {
			List<Order> orList=new ArrayList<>();
			Order ord2=new Order();
			ord2.setSino(counter);
			ord2.setItem(o.getItem());
			ord2.setQty(o.getQty());
			orList.add(ord2);
			map.put(o.getItem(), orList);
		}
	}
	for(Map.Entry<String, List<Order>> entry:map.entrySet()) {
		oList = entry.getValue();
	}
	return oList;
}
}

class Order{
	int sino;
	String item;
	int qty;
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
	
	
	public int getSino() {
		return sino;
	}
	public void setSino(int sino) {
		this.sino = sino;
	}
	@Override
	public String toString() {
		return "Order [sino=" + sino + ", item=" + item + ", qty=" + qty + "]";
	}
	
	
}
