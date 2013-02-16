/**The frame where all the graphics will be shown is created
 * 	Element is placed to the point specified by the mouseClick
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame{

	private static final long serialVersionUID = 1L;
	private DrawingPanel dwPanel;
	private int xCoordinate;
	private int yCoordinate;



	public GUI()
	{
		super("TicTacToe");
		dwPanel = new DrawingPanel();

		dwPanel.addMouseListener(new MouseListener()
		{

			public void mouseClicked(MouseEvent event)
			{	 PointerInfo a = MouseInfo.getPointerInfo();
			Point point = new Point(a.getLocation());
			SwingUtilities.convertPointFromScreen(point, event.getComponent());
			xCoordinate=(int) point.getX();
			yCoordinate=(int) point.getY();
			int col=(int) Math.floor(xCoordinate/dwPanel.takeSize());
			int row=(int) Math.floor(yCoordinate/dwPanel.takeSize());
			dwPanel.update(row,col);


			}


			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		add(dwPanel); 

		setSize(dwPanel.size*3+20,dwPanel.size*3+30); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);


	}


}

