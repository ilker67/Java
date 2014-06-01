import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class HashOrnek {

	
	public static void main(String[] args) {
		List liste=new ArrayList();
		HashMap map=new HashMap();
		map.put("bir", "1");
		map.put("iki", "2");
		map.put("ьз", "3");
		Iterator i=map.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry value=(Entry) i.next();
			liste.add(value.getValue());
			System.out.println("Key:"+value.getKey());
			System.out.println("Value:"+value.getValue());
		}
		Collections.sort(liste);
		for (int j = 0; j < liste.size(); j++) {
			
			System.out.println(liste.get(j));
		}
	}
}
