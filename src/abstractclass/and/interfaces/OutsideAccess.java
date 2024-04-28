package abstractclass.and.interfaces;

import accessmodifiers.Test;

public class OutsideAccess extends Test {

	public static void main(String[] args) {

		Test testObject = new Test();
		OutsideAccess outsideAccessObject = new OutsideAccess();

		System.out.println("Erreichbare Variablen von einem anderen Paket: " +
				testObject.offentlich + " " + outsideAccessObject.geschuetzt);

	}

}
