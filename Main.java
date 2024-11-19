class Main {
	public static void main(String[] args) {
		int i, n=28, sum=0;
		for(i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.print(n+" is a perfect number");
		else
			System.out.print(n+" is not a perfect number");
	}
}
	