class PrimeNumber {
	public static void main(String[] args) {
		int i, Count = 0;
		for(i = 1; i <= 50; i++) {
			Count = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					Count++;
				}
			}
			//System.out.print(Count+" ");
			if(Count==2) {
				System.out.print(i+" ");
			}
		}
	}
}