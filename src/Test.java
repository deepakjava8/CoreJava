import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		GloviaAccRcptMsg glovia=new GloviaAccRcptMsg();
		glovia.setMessageId("MSG-1");
		List<Items> itemsList=new ArrayList<>();
//		Set<Items> itemsList=new HashSet<>();
		Items item1=new Items();
		item1.setReceiptDate("11/28/2020 12:20:00 PM");
		item1.setPackingSlip("202069");
		item1.setItem("NX69J");
		item1.setQty(2);
		item1.setReceiverNumber("11081968");
		item1.setServiceTag("GT123");
		
		Items item2=new Items();
		item2.setReceiptDate("10/28/2020 12:20:00 PM");
		item2.setPackingSlip("20206");
		item2.setItem("KX69J");
		item2.setQty(7);
		item2.setReceiverNumber("11081968");
		item2.setServiceTag("GT123");
		
		Items item3=new Items();
		item3.setReceiptDate("9/28/2020 12:20:00 PM");
		item3.setPackingSlip("20206");
		item3.setItem("NX69J");
		item3.setQty(1);
		item3.setReceiverNumber("11081968");
		item3.setServiceTag("GT123");
		
		Items item4=new Items();
		item4.setReceiptDate("9/28/2020 12:20:00 PM");
		item4.setPackingSlip("20206");
		item4.setItem("NX69J");
		item4.setQty(1);
		item4.setReceiverNumber("11081968");
		item4.setServiceTag("GT123");
		
		itemsList.add(item1);
		itemsList.add(item2);
		itemsList.add(item3);
		itemsList.add(item4);
		
		glovia.setItems(itemsList);
		System.out.println(glovia);
		System.out.println(itemsList.size());
		
		Set<Items> itemsSet=new HashSet<>(itemsList);
		
		System.out.println(glovia);
		System.out.println(itemsList.size());
	}
}
