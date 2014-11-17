public class Question4 {
	public static void main(String [] args){

		int[] a = {1,2,3,4,5};

		System.out.println(sum(a));

		

	}

	public static int sum(int[] a){
		int tot = 0;
		for(int i=0;i<a.length;i++){
			tot = a[i] + tot;
		}
		return tot;
	}

	public static int[] cumsum(int[] a){
		int[] cumtot = new int[a.length];
		int runningtotal = 0;
		for(int i = 0;i<a.length;i++){
			runningtotal = runningtotal + a[i];
			cumtot[i] = runningtotal;
		}
		return cumtot;
	}
	
	
	public static int[] positives(int[] a){
		int[] posi = new int[0];
		for(int i=0;i<a.length;i++){
			if (a[i] > 0) {
			posi.add(a[i]);
			}
		}
		
	}
}
