package Map_Interface;

public class Student_Class {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public Student_Class(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student_Class [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
