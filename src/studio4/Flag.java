package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	double y = 0.03;
	while (y < 0.93) {
	StdDraw.line(0.05, y, 0.95, y);
	y = y + 0.1;
	}
	StdDraw.line(0.05,0.03,0.05,0.93);
	StdDraw.line(0.95,0.03,0.95,0.93);
	StdDraw.setPenColor(0,250,0);
		double trianglex[] = {0.4, 0.5, 0.6};
		double triangley[] = {0.4, 0.6, 0.4};
	 StdDraw.filledPolygon(trianglex, triangley);
	StdDraw.setPenColor(250,0,0);
	StdDraw.filledEllipse(0.5, 0.467, 0.05, 0.05);
	}
}