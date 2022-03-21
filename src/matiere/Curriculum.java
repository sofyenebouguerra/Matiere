package matiere;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Curriculum {
	private String id;
	private Map<String,Integer> Mod_Coef;
	public Curriculum(String id) {
		super();
		this.id = id;
		Mod_Coef=new TreeMap<String, Integer>();
	}
	public Map<String, Integer> getMod_Coef() {
		return Mod_Coef;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void ajouterModCoef(String s,int i) {
		Mod_Coef.put(s.toUpperCase(), i);
		
	}
	public int getCoef(String s) {
		return Mod_Coef.get(s.toUpperCase());
		
	}
	public Set<String> getModSet(){
	return	Mod_Coef.keySet();
		
	}
	@Override
	public String toString() {
		return "Curriculum[id=" +id + ",ModCoef=" +Mod_Coef+ "]";
	}
	
	
	
	
	

}
