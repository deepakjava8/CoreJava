public class Items {
	
	private String receiptDate;
	
	private String packingSlip;
	
	private String item;
	
	private int qty;
	
	private String receiverNumber;
	
	private String serviceTag;

	
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
		Items other = (Items) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		int qt=0;
		if(this.getItem().equals(other.getItem())) {
			qt=this.qty+other.getQty();
			other.setQty(qt);
			System.out.println("test");
		}
		return true;
	}

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

	@Override
	public String toString() {
		return "Items [receiptDate=" + receiptDate + ", packingSlip=" + packingSlip + ", item=" + item + ", qty=" + qty
				+ ", receiverNumber=" + receiverNumber + ", serviceTag=" + serviceTag + "]";
	}

	
	
	

}
