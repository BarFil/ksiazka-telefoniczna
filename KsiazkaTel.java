package Telefon;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

class KsiazkaTel {
	
	public static void main (String []args) {
    
    Firma f1=new Firma("Shell","+(48)","123456789","Politechniki 43");
    Firma f2=new Firma("Apple","+(50)","512512512","Zrodlana 5");
    Firma f3=new Firma("Orlen","+(47)","123123123","Domowa 21");
    Osoba o1=new Osoba("Filip","Baranowski","+(49)","997998999","Widokowa 3");
    Osoba o2=new Osoba("Jan","Kowalski","+(46)","147824695","Kozla 2");
    TreeMap<NrTelefoniczny, Wpis> tree_map= new TreeMap<NrTelefoniczny, Wpis>();
    tree_map.put(o1.telefon,o1);
    tree_map.put(o2.telefon,o2);
    tree_map.put(f1.telefon,f1);
    tree_map.put(f2.telefon,f2);
    tree_map.put(f3.telefon,f3);
    Set set=tree_map.entrySet();
    Iterator i=set.iterator();
    while(i.hasNext())
    {
    	Map.Entry me = (Map.Entry)i.next();
    	Wpis temp = (Wpis)me.getValue();
    	temp.opis();
    }
    
    
  }
}