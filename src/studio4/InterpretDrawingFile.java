package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String name = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		StdDraw.setPenColor(red,green,blue);
		if (name.equals("rectangle")) {
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfwidth = in.nextDouble();
		double halfheight = in.nextDouble();
		if (filled == true) {
		StdDraw.filledRectangle(x, y, halfwidth, halfheight);
		}
		else { StdDraw.rectangle(x, y, halfwidth, halfheight);
		}
		}
		else if (name.equals("triangle")) {
		double trianglex[] = new double[3];
		double triangley[] = new double[3];
		trianglex[0] = in.nextDouble();
		triangley[0] = in.nextDouble();
		trianglex[1] = in.nextDouble();
		triangley[1] = in.nextDouble();
		trianglex[2] = in.nextDouble();
		triangley[2] = in.nextDouble();
	if (filled == false) {
		StdDraw.polygon(trianglex, triangley );
		}
		else { StdDraw.filledPolygon(trianglex, triangley );
		}
		}
	}
}
