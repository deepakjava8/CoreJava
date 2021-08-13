package java8.dilips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>(Arrays.asList(1, 1, 2,9,9, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	System.out.println(list);
	List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
	System.out.println(newList);
	
	List<Emp> eList=new ArrayList<>(Arrays.asList(new Emp(101, "amit"),new Emp(102, "Deepak"),new Emp(101, "amit")));
	System.out.println(eList);
	List<Emp> collect = eList.stream().distinct().collect(Collectors.toList());
	System.out.println(collect);
}
}
class Emp{
	
	private int id;
	private String name;
	public Emp() {
		
	}
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Emp other = (Emp) obj;
		if (id != other.id)
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
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}
 