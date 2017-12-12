package com.sac.adapter;

public class PenAdapter implements BallPen {
	PilotPen pp = new PilotPen();

	@Override
	public void writeWithBallPen(String s) {
		pp.writeWithPilotPen(s);

	}

}
