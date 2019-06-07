import java.util.ArrayList;

public class AirPlane {
	
	
	private static int [][] leftSideFirstClass;
	private static int [][] rightSideFirstClass;
	private static int [][] leftSideEconomyClass;
	private static int [][] rightSideEconomyClass;
	
	public AirPlane() {
		
		leftSideFirstClass = new int[5][2];
		rightSideFirstClass = new int[5][2];
		leftSideEconomyClass = new int[15][3];
		rightSideEconomyClass = new int[15][3];
		
	}	
	
	public void setLeftSideFirstClass(int a, int b) {
		leftSideFirstClass[a][b] = 1;
	}
	public void setRightSideFirstClass(int a, int b) {
		rightSideFirstClass[a][b] = 1;
	}
	public void setLeftSideEconomyClass(int a, int b) {
		leftSideEconomyClass[a][b] = 1;
	}
	public void setRightSideEconomyClass(int a, int b) {
		rightSideEconomyClass[a][b] = 1;
	}
	
		
	public int [][] getLeftSideFirstClass() {
		return leftSideFirstClass;
	}
	public int [][] getRightSideFirstClass() {
		return rightSideFirstClass;
	}
	public int [][] getLeftSideEconomyClass(){
		return leftSideEconomyClass;
	}
	public int [][] getRightSideEconomyClass(){
		return rightSideEconomyClass;
	}
	
	public String toString() {
		String r = "";
		
		for(int i = 0; i < 5; ++i) {
			for(int j = 0; j < 2; ++j) {				
				if(0 == leftSideFirstClass[i][j]) {
					r = r + "_ ";
				}
				else if(1 == leftSideFirstClass[i][j]) {
					r = r + "X ";
				}
			}
			r = r + "  |     |  ";
			for(int j = 0; j < 2; ++j) {
				if(0 == rightSideFirstClass[i][j]) {
					r = r + "_ ";
				}
				else if(1 == rightSideFirstClass[i][j]) {
					r = r + "X ";
				}
			}			
			r = r + "\n";
		}
		
		for(int i = 0; i < 15; ++i) {
			for(int j = 0; j < 3; ++j) {				
				if(0 == leftSideEconomyClass[i][j]) {
					r = r + "_ ";
				}
				else if(1 == leftSideEconomyClass[i][j]) {
					r = r + "X ";
				}
			}
			r = r + "|     |";
			for(int j = 0; j < 3; ++j) {
				if(0 == rightSideEconomyClass[i][j]) {
					r = r + "_ ";
				}
				else if(1 == rightSideEconomyClass[i][j]) {
					r = r + "X ";
				}
			}			
			r = r + "\n";
		}
		
		
		return r;
	}
}
