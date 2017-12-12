package com.sac.adapter;

public class Assignment {

	BallPen p;

	public BallPen getP() {
		return p;
	}

	public void setP(BallPen p) {
		this.p = p;
	}

	void writeAssignMent(String s) {
		p.writeWithBallPen(s);
	}
}