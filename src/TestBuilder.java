
public class TestBuilder {
public static void main(String[] args) {

EmpBuilder b=new EmpBuilder();
String string = b.id(1).name("deepak").email("deepak@test.com").build().toString();
System.out.println(string);
}
}
class Emp{
	private int id;
	private String name;
	private String email;
	public Emp() {}
	public Emp(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
class EmpBuilder{
	private int id;
	private String name;
	private String email;
	
	public EmpBuilder() {}
	
	public EmpBuilder id(final int id) {
		this.id=id;
		return this;
	}
	
	public EmpBuilder name(final String name) {
		this.name=name;
		return this;
	}
	
	public EmpBuilder email(final String email) {
		this.email=email;
		return this;
	}
	
	public Emp build() {
		return new Emp(this.id, this.name, this.email);
	}

	@Override
	public String toString() {
		return "EmpBuilder [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	 
}
