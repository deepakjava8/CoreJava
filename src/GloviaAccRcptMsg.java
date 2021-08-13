

import java.util.List;

public class GloviaAccRcptMsg {
	
	private String messageId;
		
	private List<Items> items;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "GloviaAccRcptMsg [messageId=" + messageId + ", items=" + items + "]";
	}

}
