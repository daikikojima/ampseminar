class dice{
	public static void main(String args[]){
		double r = 0.5;//サイコロの確率
		Events(100,r);
	}
	public static void Events(int n, double r){
		System.out.println("k = " + n);
		double p = 0;
		int count = 0;
		for(int i = 0; i < n; i++){
			p = Math.random();
			if(p >= r){
				count++;
			}
			if((i+1) % 10 == 0){
				System.out.println("n = " + (i + 1) + " | count : " + count);
				System.out.println("f(k) = " + count/(double)n);		
			}
		}
		
	}

}