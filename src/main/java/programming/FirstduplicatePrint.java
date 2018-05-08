package programming;
import java.util.Arrays; 

public class FirstduplicatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
				String my_array ="rada";
				char[] allcar=my_array.toCharArray();
		        int k=1;
		        for (int i = 0; i < allcar.length-1; i++)
		        {
		            for (int j = i+1; j < allcar.length; j++)
		            {
		                if ((allcar[i] == allcar[j]) && (i != j))
		                {
		                    
		                    System.out.println(k+". Duplicate Element : "+allcar[j]);
		                
		                    k++;
		                }
		            }
		        }
 
	}

}
