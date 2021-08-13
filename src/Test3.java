import java.util.ArrayList;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	/*List<String> list=new ArrayList<>();
	list.add("test1");
	list.add("test2");
	if(list.contains("test1")) {
		System.out.println("success");
	}*/
	
	List<Item> list=new ArrayList<>();
	
	list.add(new Item("item1"));
	list.add(new Item("item2"));
	if(list.contains("item1")) {
		System.out.println("success");
	}
	else {
		System.out.println("Failed");
	}
}

}
class Item{
	private String id;
	public Item(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + "]";
	}
	
}