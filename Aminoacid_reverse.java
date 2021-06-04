import java.util.Arrays;
public class Aminoacidrev
{
	public static void main(String[] args) 
	{
	    String[] amino = {"Alanine","Lysine","Tyrosine","Asparagine","Aspartate","Cysteine","Glutamate"};
	    System.out.println("Array before sorting: ");
	    System.out.println(Arrays.toString(amino));
	    Arrays.sort(amino);
	    System.out.println("Array after sorting: ");
	    System.out.println(Arrays.toString(amino));
	}
}