class PatternPyramid {
	public static void main(String[] args) {
		for(int i = 5; i >= 0; i--) {
			for(int j = i; j<5; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (i*2-1); k++) {
				if(k == 1||k ==(i*2-1))
					System.out.print(i);
				else
					System.out.print(i-1);
				}
			System.out.println();
		}
	}
}