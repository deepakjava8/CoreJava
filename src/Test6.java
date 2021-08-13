
public class Test6 {
public static void main(String[] args) {
	EventData eventData=new EventData();
	eventData.setId("101");
	setData(eventData);
	setEventData(eventData);
	eventData.setPayload("test payload");
	
	System.out.println(eventData);
}

public static void setData(EventData eventData) {
	try {
		int i=10/0;
		eventData.setStatus("SUCCESS");
	}catch(Exception e) {
		eventData.setStatus("FAILED");
	}
}
public static void setEventData(EventData eventData) {
	eventData.setName("YKS Event");
}
}
class EventData{
	String id;
	String name;
	String payload;
	String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EventData [id=" + id + ", name=" + name + ", payload=" + payload + ", status=" + status + "]";
	}
	
}
