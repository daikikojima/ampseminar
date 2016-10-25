class dice{
	public static void main(String args[]){
		double r = 0.5;//サイコロの確率
		for(int i = 1; i <=10; i++){
			Events(i * 10,r);
		}
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
		}
		System.out.println("f(k) =" + count);

	}

}