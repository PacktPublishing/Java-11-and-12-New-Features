class HelloNoCompilation {
	public static void main(String[] args) {
		System.out.println("No compilation! Are you kidding me?");
		EstablishedOrg org = new EstablishedOrg();
		org.invite();
		System.out.println(new Startup().name);
	}
}

class Startup {
	String name = "CoolAndExciting";
}
interface Employs {
	default void invite() {
		System.out.println("Want to work with us?");
	}
}
class EstablishedOrg implements Employs {
	String name = "OldButStable";
}
