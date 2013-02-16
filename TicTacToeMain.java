/**
 * Displays the image
 * 
 *
 */

public class TicTacToeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TicTacToe mytable=new TicTacToe();
		// TODO Auto-generated method stub
		mytable.putElement(1,1, 2);
		GUI mine= new GUI();
		System.out.print(mytable.get(1,2));
	}

}
