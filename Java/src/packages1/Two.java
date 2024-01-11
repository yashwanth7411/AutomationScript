package packages1;
import packages.One;

class child extends One{
		void func()
		{
			protectedfunc();
		}
	}
public class Two {
	public static void main(String[] args) {
		
		One o=new One();
	//	o.privatefunc();
	//	o.defaultfunc();
		o.publicfunc();
	//	o.protectedfunc();
		child c=new child();
		c.func();
	}
}

// class
// public can be accessible outside the package
// default class not accessible outside the package


// Protected class One is inherited by child class
// methods of One class become static and cannot accessed by object directly