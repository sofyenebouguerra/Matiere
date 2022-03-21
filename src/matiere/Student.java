package matiere;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {
	private String ident;
	private Curriculum forma;
	private Map<String, ArrayList<Double>> resultats;
	
	
	public Student(String ident,Curriculum forma) {
		super();
		this.ident = ident;
		this.forma = forma;
		resultats=new TreeMap<String, ArrayList<Double>>();
		Set<String> set=forma.getModSet();
		for(String s:set)
		{
			resultats.put(s, new ArrayList<Double>());
		}
			
	}
   public boolean addNote(String s,Double d) {
	   String S=s.toUpperCase();
	   if(resultats.containsKey(S)) {
		   List<Double> list=resultats.get(S);
		   list.add(d);   
	   }
		   
	   return true;
   }
   public double average(String s) {
	   double m=(double)(0);
	   String S=s.toUpperCase();
	   if(resultats.containsKey(S)) {
		   List<Double> list=resultats.get(S);
		   int size=list.size();
		   if(size>0) {
			   for(int i=0;i<size;i++)
				   m+=list.get(i);
			   m=m/size;
		   }
		   
	   }
	   
	   return m;
   }
	public Double average() {
		double m=0;
		int sCoef=0;
		double mm=0;
		for(String s:resultats.keySet()) {
			 mm=average(s);
			 int i=forma.getCoef(s);
			 mm=mm*i;
			 sCoef+=i;
			 
		}
		if(sCoef!=0)
			m=m/sCoef;
		return m;
		
	}
	
	public int commpareTo(Student st) {
		double m1=average();
		double m2=st.average();
		if(m1>m2)
			return 1;
		else if(m1<m2)
			return -1;
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Student [ident=" + ident + ", forma=" + forma + ", resultats=" + resultats + "]";
	}


	
	
	 
	
	

}
