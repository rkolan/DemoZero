
public class MultiArray {
public static void main(String args[]){
	int [] [] grid={
			{3,5,1234},
			{1, 2},
			{1, 2,3,4,5,6,7,8,9,0},
	};
	for(int row=0; row<grid.length;row++)
	{
		for(int column=0; column<grid[row].length;column++)
		{
			System.out.println(grid[row][column]);
		}
	}	
}
}
