import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test9 {
public static void main(String[] args) {
	List<SubItem> list=new ArrayList<>();
	SubItem si1=new SubItem();
	si1.setSubNum(1);
	si1.setItem("XYZ");
	si1.setQty(3);
	
	SubItem si2=new SubItem();
	si2.setSubNum(2);
	si2.setItem("XYZ");
	si2.setQty(3);
	
	SubItem si3=new SubItem();
	si3.setSubNum(3);
	si3.setItem("ABC");
	si3.setQty(3);
	
	SubItem si4=new SubItem();
	si4.setSubNum(1);
	si4.setItem("ABC");
	si4.setQty(4);
	
	SubItem si5=new SubItem();
	si5.setSubNum(1);
	si5.setItem("ABCD");
	si5.setQty(4);
	
	list.add(si1);
	list.add(si2);
	list.add(si3);
	list.add(si4);
	list.add(si5);
	List<SubItem> data = data(list);
	for(SubItem i : data) {
		
		System.out.println(data);
	}
	
}

public static List<SubItem> data(List<SubItem> list) {
	List<SubItem> subItemList=new ArrayList<>();
	Map<String,SubItem> map=new HashMap<>();
	for(SubItem item : list) {
		if(map.containsKey(item.getItem())) {
			SubItem subItem = map.get(item.getItem());
			subItem.setQty(subItem.getQty()+item.getQty());
			map.put(item.getItem(), subItem);
		}else {
			map.put(item.getItem(), item);
		}
	}
	for (Map.Entry<String, SubItem> entry : map.entrySet()) {
		//Map<String,Integer> map1=new HashMap<>();
		SubItem value = entry.getValue();
		subItemList.add(value);
	}
	return subItemList;
}

}
class SubItem {

	private int subNum;
	private String item;
	private int qty;
	public int getSubNum() {
		return subNum;
	}
	public void setSubNum(int subNum) {
		this.subNum = subNum;
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
		return "SubItem [subNum=" + subNum + ", item=" + item + ", qty=" + qty + "]";
	}
	
}