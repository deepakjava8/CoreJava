package com.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test7 {
public static void main(String[] args) {
	GloviaAccRcptMsg glvData = getGlvData();
	System.out.println(glvData);
	List<ItemLine> lineItem = getLineItem(glvData.getItems());
	System.out.println(lineItem);

}
@SuppressWarnings("unlikely-arg-type")
public static List<ItemLine> getLineItem(List<Items> items) {
	List<ItemLine> itemLines = new ArrayList<>();

	Map<String, Set<SubItem>> map = new HashMap<>();
	for (Items item : items) {
		int counter = 1;
		if (map.containsKey(item.getServiceTag())) {
			Set<SubItem> list = map.get(item.getServiceTag());
			SubItem subItem = new SubItem();
			subItem.setSubNum(list.size() + 1);
			subItem.setItem(item.getItem());
			subItem.setQty(item.getQty());
			list.add(subItem);
			map.put(item.getServiceTag(), list);
		} else {
			Set<SubItem> subItemList = new HashSet<>();
			SubItem subItem = new SubItem();
			subItem.setSubNum(counter);
			subItem.setItem(item.getItem());
			subItem.setQty(item.getQty());
			subItemList.add(subItem);
			map.put(item.getServiceTag(), subItemList);
			counter++;
		}
	}
	for (Map.Entry<String, Set<SubItem>> entry : map.entrySet()) {
		//Map<String,Integer> map1=new HashMap<>();
		ItemLine itemLine = new ItemLine();
		itemLine.setServiceTag(entry.getKey());
		/*Set<SubItem> value = entry.getValue();
		for(SubItem subItem : value) {
			if(map1.containsKey(subItem.getItem())) {
				Integer q = map1.get(subItem.getItem());
				subItem.setQty(subItem.getQty()+q);
				
				System.out.println(q);
			}else {
				
				map1.put(subItem.getItem(), subItem.getQty());
			}
		}*/
		itemLine.setSubItem(entry.getValue());
		itemLines.add(itemLine);
	}
	return itemLines;
}
/*public static void getData(GloviaAccRcptMsg glvData) {
	List<Items> items = glvData.getItems();
	List<ItemLine> itemLines = new ArrayList<>();
	Map<String, Integer> map = new HashMap<String, Integer>();
	Map<String, Map<String, List<SubItem>>> svcMap = new HashMap<>();
	for(Items item : items){
		if(svcMap.containsKey(item.getServiceTag())) {
			
		}
	    if(map.containsKey(item.getItem())){
	        int q = map.get(item.getItem()) + item.getQty();
	        map.put(item.getItem(), q);
	    } else {
	        map.put(item.getItem(), item.getQty());
	    }
	}
	System.out.println(map);
}*/

public static GloviaAccRcptMsg getGlvData() {
	GloviaAccRcptMsg glvData=new GloviaAccRcptMsg();
	List<Items> itemList=new ArrayList<>();
	Items item1=new Items();
	item1.setReceiptDate("9/28/2020 12:20:00 PM");
	item1.setPackingSlip("PG0413021");
	item1.setItem("XXMJN");
	item1.setQty(1);
	item1.setVendor("C1698");
	item1.setVenLoc(" C1698");
	item1.setReceiverNumber("11081968");
	item1.setServiceTag("CTU76T");
	
	Items item2=new Items();
	item2.setReceiptDate("9/28/2020 12:20:00 PM");
	item2.setPackingSlip("PG0413021");
	item2.setItem("XXMJN");
	item2.setQty(2);
	item2.setVendor("C1698");
	item2.setVenLoc(" C1698");
	item2.setReceiverNumber("11081968");
	item2.setServiceTag("CTU76T");

	Items item3=new Items();
	item3.setReceiptDate("9/28/2020 12:20:00 PM");
	item3.setPackingSlip("PG0413021");
	item3.setItem("XXMJO");
	item3.setQty(2);
	item3.setVendor("C1698");
	item3.setVenLoc(" C1698");
	item3.setReceiverNumber("11081968");
	item3.setServiceTag("CTU76T");
	
	itemList.add(item1);
	itemList.add(item2);
	itemList.add(item3);
	
	glvData.setMessageId("PG041302190912");
	glvData.setSenderId("INV_ACC_GLOVIA");
	glvData.setReceiverId("INV_ACC_PRISM");
	glvData.setMessageType("3PL_ACC_RCPT");
	glvData.setThreePLSenderName("YCH_CN");
	glvData.setAsnId("710405340");
	glvData.setFromMcid("CDCMC");
	glvData.setToMcid("CDCMC");
	glvData.setItems(itemList);
	
	return glvData;
}
}
class GloviaAccRcptMsg {

	private String messageId;

	private String senderId;

	private String receiverId;

	private String messageType;

	private String threePLSenderName;

	private String asnId;

	private String fromMcid;


	private String toMcid;
	
	private List<Items> items;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getThreePLSenderName() {
		return threePLSenderName;
	}

	public void setThreePLSenderName(String threePLSenderName) {
		this.threePLSenderName = threePLSenderName;
	}

	public String getAsnId() {
		return asnId;
	}

	public void setAsnId(String asnId) {
		this.asnId = asnId;
	}

	public String getFromMcid() {
		return fromMcid;
	}

	public void setFromMcid(String fromMcid) {
		this.fromMcid = fromMcid;
	}

	public String getToMcid() {
		return toMcid;
	}

	public void setToMcid(String toMcid) {
		this.toMcid = toMcid;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "GloviaAccRcptMsg [messageId=" + messageId + ", senderId=" + senderId + ", receiverId=" + receiverId
				+ ", messageType=" + messageType + ", threePLSenderName=" + threePLSenderName + ", asnId=" + asnId
				+ ", fromMcid=" + fromMcid + ", toMcid=" + toMcid + ", items=" + items + "]";
	}
	
}
class Items {
	private String receiptDate;
	private String packingSlip;
	private String item;
	private int qty;
	private String vendor;
	private String VenLoc;
	private String receiverNumber;
	private String serviceTag;
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public String getPackingSlip() {
		return packingSlip;
	}
	public void setPackingSlip(String packingSlip) {
		this.packingSlip = packingSlip;
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
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVenLoc() {
		return VenLoc;
	}
	public void setVenLoc(String venLoc) {
		VenLoc = venLoc;
	}
	public String getReceiverNumber() {
		return receiverNumber;
	}
	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}
	public String getServiceTag() {
		return serviceTag;
	}
	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (serviceTag == null) {
			if (other.serviceTag != null)
				return false;
		} else if (!serviceTag.equals(other.serviceTag))
			return false;
		if(this.getServiceTag().equalsIgnoreCase(other.getServiceTag())) {
			int qt=0;
			if(this.getItem().equals(other.getItem())) {
				qt=this.qty+other.getQty();
				other.setQty(qt);
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((serviceTag == null) ? 0 : serviceTag.hashCode());
		return result;
	}*/
	
	@Override
	public String toString() {
		return "Items [receiptDate=" + receiptDate + ", packingSlip=" + packingSlip + ", item=" + item + ", qty=" + qty
				+ ", vendor=" + vendor + ", VenLoc=" + VenLoc + ", receiverNumber=" + receiverNumber + ", serviceTag="
				+ serviceTag + "]";
	}
	
}

class ItemLine {

	private String itemNum;
	
	private String csoNum;
	
	private String serviceTag;
	
	private String Fga;
	
	private String lobCode;
	
	private Set<SubItem> subItem;

	public String getItemNum() {
		return itemNum;
	}

	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getCsoNum() {
		return csoNum;
	}

	public void setCsoNum(String csoNum) {
		this.csoNum = csoNum;
	}

	public String getServiceTag() {
		return serviceTag;
	}

	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
	}

	public String getFga() {
		return Fga;
	}

	public void setFga(String fga) {
		Fga = fga;
	}

	public String getLobCode() {
		return lobCode;
	}

	public void setLobCode(String lobCode) {
		this.lobCode = lobCode;
	}

	

	public Set<SubItem> getSubItem() {
		return subItem;
	}

	public void setSubItem(Set<SubItem> subItem) {
		this.subItem = subItem;
	}

	@Override
	public String toString() {
		return "ItemLine [itemNum=" + itemNum + ", csoNum=" + csoNum + ", serviceTag=" + serviceTag + ", Fga=" + Fga
				+ ", lobCode=" + lobCode + ", subItem=" + subItem + "]";
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubItem other = (SubItem) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if(this.getItem().equalsIgnoreCase(other.getItem())) {

				int qt=this.qty+other.getQty();
				other.setQty(qt);
			
		}
		return true;
	}
	@Override
	public String toString() {
		return "SubItem [subNum=" + subNum + ", item=" + item + ", qty=" + qty + "]";
	}
	
	
}


