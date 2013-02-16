
/**
 * 
 * @author Feyza Haskaraman
 * X player starts the game
 * 
 */
public class TicTacToe {
	public int [][]table=new int[3][3];
	
	//Initialize a matrix with 0's which denote neither O or X occupies
	public TicTacToe()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				table[i][j]=0;
			}

		}
	}
	//x is placed as integer &&//o is placed as integer -1 in the matrix
	public void putElement(int element,int col,int row)
	{
		if(isAvail(col,row)==true)
		{
			table[col][row]=element;

		}
	}

	//returns the object at the matrix location
	public int get(int col,int row)
	{
		return table[col][row];
	}

//checks if the index is free and x/o can be placed
	public boolean isAvail(int col,int row)
	{
		if(table[col][row]==0)
			return true;
		else 
			return false;
	}
// gets the table
	public int [][] getTable()
	{
		return table;

	}


//checks if one of the elements filled the diagonals/horizantals/verticals
	public boolean isFilled(int element,int col,int row)
	{

		if(table[(col+1)%3][row]==element &&table[(col+2)%3][row]==element)
			return true;
		else if(table[col][(row+1)%3]==element &&table[col][(row+2)%3]==element)
			return true;
		else if((table[(col+1)%3][(row+1)%3]==element) && (table[(col+2)%3][(row+2)%3]==element) && (table[1][1] == element))
			return true;
		else if((table[(col+1)%3][(row+2)%3]==element) && (table[(col+2)%3][(row+1)%3]==element) && (table[1][1] == element))
			return true;		
		else 
			return false;
	}

}






