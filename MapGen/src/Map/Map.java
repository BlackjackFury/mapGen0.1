package Map;

import java.util.Random;

public class Map {
	
	public Tile[][] map = new Tile[1000][1000];
	
	public void mapGen()
	{
		Random rand = new Random();
		for (int i=0; i < 1000; i++)
			for (int j=0; j <1000; j++)
			{
				map[i][j] = new Tile(100);
			}
	}
	
	private double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
    }
	
	public void mountainGen(int x, int y)
	{
		Random rand = new Random();
	
		int dx = 50, dy = 50;
		int pike = rand.nextInt(255);
		try
		{
		for (int i=x-dx; i < x+dx; i++)
		{
			for (int j=y-dy; j <y+dy; j++)
			{	
				map[i][j] = new Tile(pike);
			}
			
			pike--;
		}
		}
		catch (Exception ex)
		{
			
		}
	}
	
	
	

}
