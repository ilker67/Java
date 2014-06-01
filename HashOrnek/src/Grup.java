import com.bilge.x.Seans;


public class Grup {

	private int a;
	private String name;
	private Seans seans;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Seans getSeans() {
		return seans;
	}
	public void setSeans(Seans seans) {
		this.seans = seans;
		seans.setSeansname(name);
		seans.setId(a);
	}

	
	
	
}
