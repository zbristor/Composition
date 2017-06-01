import java.util.Arrays;
import java.util.Collections;

public class Education {
private String schools;
@Override
public String toString(){
	 schools = "FSU FSU FSU FSU WSU WSU WSU WSU WSU MIT RIT VMU";
		
		String[] splS = schools.split(" ");
		//System.out.println(splS+"this is the split");
		String[] newS = new String[10];
		String fSchoo="";
		if(splS.length>10){
			Collections.reverse(Arrays.asList(splS));
			for (int i=0; i<10; i++)
			{
				
				newS[i]=splS[i];
				
			}
			Collections.reverse(Arrays.asList(newS));
		}	
		for(int j=0; j<newS.length; j++ )
		{
			fSchoo=fSchoo+newS[j]+" ";
		}
		return fSchoo;

	}
public String schoolList()
{
	return schools;
}
public String getSchools() {
	return schools;
}
public void setSchools(String newS) {
	this.schools = newS;
	

}

}