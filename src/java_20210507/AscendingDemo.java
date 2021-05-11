package java_20210507;

public class AscendingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ascending asc = new Ascending();
		
		int[] test = {4,20,30,24,52,49,22};
		int[] afterTest = asc.ascending(test);
		
		for (int i=0; i<afterTest.length; i++) {
			System.out.print(afterTest[i]+"\t");
		}
		
	}

}
