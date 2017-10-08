import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class database_Main {

	public static void main(String args[]) throws FileNotFoundException{
		Scanner in = null;
		File input = new File("info.txt");
		People[] newPerson = new People[291];
		in = new Scanner(input);
		int count = 0;
		while(in.hasNext()){
			newPerson[count++] = new People(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());

		}

		ArrayList<String> checkedNames = new ArrayList<String>();
		int[] count_Edu  = new int[6];
		int count_Edu_Count = 0;
		for (int counter = 0; counter < 291; counter++)
		{
		    String n = Integer.toString(newPerson[counter].getEducation());
		    if(!checkedNames.contains(n))
		    {
		        int count1 = 0;
		        for (int i = 0; i < 291; i++){
		            if (Integer.toString(newPerson[i].getEducation()).equals(n))
		                count1++;
		 
		        }
		        count_Edu[count_Edu_Count++] = count1;
		        checkedNames.add(n);
		        System.out.println(n + " - " + count1);
		    }
		}
		for(int i = 0;i<6;i++){
			System.out.println(count_Edu[i]);
		}
		
		
		
		
		for(int i = 0;i<checkedNames.size();i++){
			System.out.println(checkedNames.get(i));
		}
		/**
		for(int i =0;i< newPerson.length;i++){
			double eEdu = 0;
			eEdu = 
			
			
			
		}
		
**/
		//	System.out.println(newPerson[i].getGender());




	//	}






		in.close();




	}
}
