public class Aminoacid
{
	public static void main(String[] args) 
	{
	    int[] amwt = {89,174,132,133,121,147};
	    String[] aa = {"Alanine","Arginine","Asparagine","Aspartate","Cysteine","Glutamate"};
	    for(int i=0;i < aa.length;i++)
	    {
	        System.out.println("Molecular weight of " + aa[i] + " is " + amwt[i] );
	    }
	}
}