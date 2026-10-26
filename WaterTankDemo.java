package antonnyy;

import java.util.*;

public class WaterTankDemo {
	private String name;
	private int[] bucket;
	private int top;

	public WaterTankDemo() {
		this.name = "Standard Tank";
		this.bucket = new int[5];
		this.top = -1;
		System.out.println(name + " created no-argument constructor");
	}

	public WaterTankDemo(String name, int capacity) {
		this.name = name;
		this.bucket = new int[capacity];
		this.top = -1;
		System.out.println(name + " : Holds " + capacity + " buckets");
	}

	public void pour(int liters) {
		if (top == bucket.length - 1) {
			System.out.println("Overflow!! " + name + " is full. " + liters + " spilled on the floor");
			return;
		}
		top++;
		bucket[top] = liters;
		System.out.println("Poured " + liters + "L into " + name);
	}

	public int drain() {
		if (isEmpty()) {
			System.out.println("UNDERFLOWW!! " + name + " is empty");
			return 0;
		}
		int liters = bucket[top];
		top--;
		System.out.println("Drained " + liters + "L from " + name);
		return liters;
	}

	public int checkTop() {
		if (isEmpty()) {
			System.out.println(name + " is Empty");
			return 0;
		}
		return bucket[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int bucketCount() {
		return top + 1;
	}

	public int totalLiters() {
		int total = 0;
		for (int i = 0; i <= top; i++) {
			total += bucket[i];
		}
		return total;
	}

	// ==================== DESIGN ONLY (no logic changes) ====================

	// Draws the tank as ASCII art, one row per bucket slot
	public void drawTank() {
		System.out.println("      ~ " + name + " ~");
		System.out.println("     |           |");
		for (int i = bucket.length - 1; i >= 0; i--) {
			if (i <= top) {
				System.out.println(
						"     |~~ " + String.format("%3d", bucket[i]) + "L ~~| <- " + (i == top ? "TOP" : "   "));
			} else {
				System.out.println("     |           |");
			}
		}
		System.out.println("     +===========+");
		System.out.println("      \\_________/");
	}

	public static void banner(String title) {
		String line = "=".repeat(title.length() + 8);
		System.out.println();
		System.out.println("+" + line + "+");
		System.out.println("|    " + title + "    |");
		System.out.println("+" + line + "+");
	}

	public static void divider() {
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
	}

	// ========================================================================

	public static void main(String[] args) {
		System.out.println("**********************************************");
		System.out.println("*                                            *");
		System.out.println("*      ~~~~   WATER  TANK  DEMO   ~~~~       *");
		System.out.println("*          ( Stack of Water Buckets )        *");
		System.out.println("*                                            *");
		System.out.println("**********************************************");

		banner("TANK 1 : STANDARD");
		WaterTankDemo tank1 = new WaterTankDemo();
		divider();
		tank1.pour(10);
		tank1.pour(20);
		tank1.pour(15);
		divider();
		tank1.drawTank();
		divider();
		System.out.println("Top Bucket: " + tank1.checkTop() + "L");
		tank1.drain();
		System.out.println("Buckets Left: " + tank1.bucketCount() + " | Total Water: " + tank1.totalLiters());
		divider();
		tank1.drawTank();

		banner("TANK 2 : MINI");
		WaterTankDemo tank2 = new WaterTankDemo("Mini Tank", 3);
		divider();
		tank2.pour(5);
		tank2.pour(10);
		tank2.pour(15);
		tank2.drawTank();
		tank2.pour(20);
		divider();
		tank2.drain();
		tank2.drain();
		tank2.drain();
		tank2.drawTank();
		tank2.drain();
		divider();
		System.out.println("Is The Tank Empty? " + tank2.isEmpty());

		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~ END OF DEMO ~~~~~~~~~~~~~~~~~");

	}

}