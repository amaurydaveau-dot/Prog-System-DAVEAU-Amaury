public class TestCompteur {
	
	public static void main(String[] args) {
		int i;
		for(i=0;i<50;i++){
			TestCompteur iteration = new TestCompteur();
			iteration.test();
		}
	}
	
	public void test() {
		CompteurDangereux.resetCompteur();
		Thread[] iteration = new Thread[9];
		int j;
		for(j=0;j<9;j++) {
			iteration[j] = new Thread(new CompteurDangereux.Incrementeur("thread n°"+j,1111111));
			iteration[j].start();
		}
		for(j=0;j<9;j++) {
			try {
				iteration[j].join();
			} catch(Exception e) {
				
			}
		}	
		System.out.println(CompteurDangereux.getCompteur());
	}
	
}