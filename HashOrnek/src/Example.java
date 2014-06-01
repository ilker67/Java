import java.util.LinkedList;

import com.bilge.x.Seans;


public class Example {

	public static void main(String[] args) {


		LinkedList<Grup> gruplar=new LinkedList<Grup>();
		Seans seans =new Seans();
		Grup grup=new Grup();
		grup.setA(1);
		grup.setName("Java");
		
		seans.setId(1);
		seans.setSeansname("HaftaSonu");
		grup.setSeans(seans);
		gruplar.addFirst(grup);
		
		Grup grup2=new Grup();
		grup2.setA(2);
		grup2.setName("C#");
		grup2.setSeans(seans);
		gruplar.addFirst(grup2);
		Grup grup3=new Grup();
		grup3.setA(3);
		grup3.setName("Java");
		grup3.setSeans(seans);
		gruplar.addLast((grup3));
		
		
		for (Grup grp : gruplar) {
			
			System.out.println(grp.getA());
			System.out.println(grp.getName());
			System.out.println(grp.getSeans().getSeansname());
			
			
		}
		
		for (int i = 0; i < gruplar.size(); i++) {
			
			System.out.println("ID: " +gruplar.get(i).getA()+" Name: "+gruplar.get(i).getName()+" Seans: "+gruplar.get(i).getSeans().getSeansname());
		}
		
		
		

	}

}
