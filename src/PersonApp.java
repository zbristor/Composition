import java.util.Arrays;
import java.util.Collections;

public class PersonApp {
public static void main(String[] args) {
	Person p = new Person();
	Job job = new Job();
	Education e = new Education();
	String s = e.getSchools();
	//System.out.println(s);
	/*
	String[] splS = s.split("\t");
	String[] newS = new String[100];
	String fSchoo="";
	if(splS.length>10){
		Collections.reverse(Arrays.asList(splS));
		for (int i=0; i<11; i++)
		{
			newS[i]=splS[i];
			Collections.reverse(Arrays.asList(newS));
		}
	}	
	for(int j=0; j<newS.length; j++ )
	{
		fSchoo=fSchoo+newS[j];
	}
	e.setSchools(fSchoo);
	//System.out.println(e.getSchools());
	 * */
	 
	System.out.println(p.toString());
	
}
}
