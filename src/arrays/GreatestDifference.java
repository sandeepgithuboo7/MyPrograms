package arrays;

public class GreatestDifference {

public static void main(String[] args) {
	    
	    int [] a = new int [] {10, 20, 40, 30};
	    
	    int d=0, gd=0;
        int a1 = 0, a2 = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                d = Math.abs(a[i] - a[j]);
                
                if(d > gd)
                {
                    gd = d;
                    a1 = i;
                    a2 = j;
                }
            }
        }
        System.out.println("Greatest Difference:" +gd);
        System.out.println("Two elements with largest difference:"+a[a1]+" and "+a[a2]);
	}
}
