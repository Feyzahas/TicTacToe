
/*create a panel and draw the components in it/ 
 * size of the table/ elements can be changed in future uses*/
	
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class DrawingPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TicTacToe t;
	private int count;
	public int size=100;

	public DrawingPanel()
	{
		t=new TicTacToe();
		count=0;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(3*size,0*size,3*size,0*size+3*size);
		g2.drawLine(0*size,3*size,0*size+size*3,3*size);




		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{

				g2.setColor(Color.BLACK);

				g2.drawLine(i*size, j*size,i*size, j*size+size);
				g2.drawLine(i*size,j*size,i*size+size,j*size);


				if( t.get(i,j)==1)
				{     

					g2.setColor(Color.BLACK);
					g2.setStroke(new BasicStroke(10));

					g2.drawLine(j*size,i*size, j*size+size, i*size+size);
					g2.drawLine(j*size,i*size+size, j*size+size, i*size);
				}

				else if(t.get(i,j)==-1)
				{
					g2.setColor(Color.GREEN);
					Ellipse2D.Double circle = new Ellipse2D.Double(j*size, i*size, size, size);
					g2.fill(circle);
					g2.setColor(Color.black);
					Ellipse2D.Double circle2 = new Ellipse2D.Double(j*size+size/4, i*size+size/4,size/2, size/2);
					g2.fill(circle2);

				}

			}
		}
		Image newIm=Toolkit.getDefaultToolkit().getImage("Ximage.png");
		g2.drawImage(newIm ,0,0, this);

	}


	public int takeSize()
	{
		return size;

	}
	public void update(int x, int y)
	{
		boolean filled=false;
		String message=null;
		if(t.isAvail(x, y)){

			if(count%2==0)
			{
				t.putElement(1, x,y);
				if(t.isFilled(1, x, y))
				{
					filled=true;
					message="Game ended. Player X won";
				}}
			else 
			{
				t.putElement(-1, x, y);
				if(t.isFilled(-1, x, y))
				{
					filled=true;
					message="Game ended. Player O won";


				}

			}
		}
		count++;

		repaint();

		if(filled)
			JOptionPane.showMessageDialog(null, message, "GAMEOVER", JOptionPane.PLAIN_MESSAGE);

	}


}
