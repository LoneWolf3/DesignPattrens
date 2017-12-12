package com.sac.adapter;

/**
 * I already have pilot pen with me so I do not want to use Ball pen and I can
 * not pass pilot pen to assignment as it does not implement Pen interface,
 * Solution is use adapter pattern here
 * 
 * Create a adapter class using composition pass a pilot pen in it and use this
 * adpater here in Main
 * 
 * @author ssachdev
 *
 */
public class Main {
	public static void main(String[] args) {

		/* BallPenImpl p = new BallPenImpl(); */
		PenAdapter p = new PenAdapter();
		Assignment s = new Assignment();
		s.setP(p);
		s.writeAssignMent("writing");
	}
}