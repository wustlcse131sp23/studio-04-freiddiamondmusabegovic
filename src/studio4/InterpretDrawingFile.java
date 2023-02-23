package studio4;

import java.awt.Color;
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
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		
		if (shapeType.equals("rectangle"))
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		
		if (isFilled)
		{
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		}
		else
		{
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}
		}
		
		if (shapeType.equals("triangle"))
					{
						double[] x = new double[3];
						double[] y = new double [3];
							
					StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
					
					for (int i =0; i < 3; i++) 
					{
						double val = in.nextDouble();
						x[i] = val;
						double yval = in.nextDouble();
						y[i] = yval;
						
					}
					
					
					if (isFilled)
					{
						StdDraw.filledPolygon(x,y);
					}
					else
					{
						StdDraw.polygon(x,y);
					}
					}
		
		if (shapeType.equals("ellipse"))
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfWidth = in.nextDouble();
				double halfHeight = in.nextDouble();
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			
			if (isFilled)
			{
			StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else
			{
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
			}
		
		
		
		
		
		
		
		
	}
}
