package testingisdone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circletestingdone {

	@Test
	void test() {
		System.out.println(" main method starts");
        Circle sc=new Circle();
       System.out.println( sc.color="red");
        System.out.println(sc.radius=1.0);
        System.out.println(sc.getArea());
        System.out.println(sc.getRadius());
        System.out.println(sc.getCircumference());
	}

}
