import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
public static void main(String[] args) {
	//List<Emp1> list=new ArrayList<>();
	Set<Emp1> list=new HashSet<>();
	
	Emp1 e1=new Emp1();
	e1.setName("deepak");
	e1.setEmail("deepak@dell.com");
	
	Emp1 e2=new Emp1();
	e2.setName("deepak");
	e2.setEmail("deepak@dell.com");
	
	list.add(e1);
	list.add(e2);
	System.out.println(list);
	System.out.println("equals : "+e1.equals(e2) +"/t"+" e1 hashcode : "+e1.hashCode() +"/t"+" e2 hashcode : "+e2.hashCode());
}
}

class Emp1{
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Emp1 other = (Emp1) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", email=" + email + "]";
	}
	
}