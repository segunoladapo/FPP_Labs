package fpp.midtermpractice.otherpkg;


import fpp.midtermpractice.protected_code.Subclass;

//inside secondpackage
public class ExternalClass {
	public String readVal() {
		Subclass cl = new Subclass();
		//return cl.getVal(); //produces a compiler error -- how to fix?
		return cl.getVal();
	}
}


