package cats;

public class Main {
	public static void main(String[] args) {

		// -------------------------
		// CATS
		// -------------------------
		Cat c1 = new Cat();
		Cat c2 = new Cat("Whiskers", 3, "Orange");

		System.out.println("\nDefault Cat:");
		System.out.println(c1);

		System.out.println("\nCustom Cat:");
		System.out.println(c2);

		// Mutate Cat
		c2.setAge(4);
		c2.setColor("Black");

		System.out.println("\nAfter Cat mutations:");
		System.out.println(c2);


		// -------------------------
		// SHORTHAIR
		// -------------------------
		Shorthair s1 = new Shorthair();
		Shorthair s2 = new Shorthair("Calico", 9.2, false);

		System.out.println("\nDefault Shorthair:");
		System.out.println(s1);

		System.out.println("\nCustom Shorthair:");
		System.out.println(s2);

		// Mutate Shorthair
		s2.setWeight(10.5);
		s2.setIndoor(true);

		System.out.println("\nAfter Shorthair mutations:");
		System.out.println(s2);


		// -------------------------
		// LONGHAIR
		// -------------------------
		LongHair l1 = new LongHair();
		LongHair l2 = new LongHair("Very Long", 10.0, false);

		System.out.println("\nDefault LongHair:");
		System.out.println(l1);

		System.out.println("\nCustom LongHair:");
		System.out.println(l2);

		// Mutate LongHair
		l2.setFluffiness(8.7);
		l2.setShedsALot(true);

		System.out.println("\nAfter LongHair mutations:");
		System.out.println(l2);
	}
}
