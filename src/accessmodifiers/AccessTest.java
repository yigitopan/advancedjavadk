package accessmodifiers;

public class AccessTest {

	public static void main(String[] args) {
		
		Test testObject = new Test();
		
		System.out.println("Erreichbare Variablen: " +
		testObject.string + " " + testObject.offentlich + " " + testObject.geschuetzt);

		//System.out.println("Gizli :" + testObject.getGizli());
	}

}
