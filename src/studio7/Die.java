package studio7;

public class Die {
	
	private int highest;
	private int[] numbers;
	
	public Die(int n) {
		this.highest =  n;
		int[] nummy= new int [n];
		for (int x=0; x<=n; x++) {
			nummy[x]=x+1;
		}
		this.numbers = nummy;
	}
	
	
	public static int roll(Die cube)
	{
		int landsOn = cube.numbers[(int) (Math.random()*cube.highest)];
		return landsOn;
	}
}
