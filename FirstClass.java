
public class FirstClass extends AirPlane implements checkAvailability {
	
		
		
	public FirstClass() {		
		
	}
	

	public boolean checkAvailablity(int numOfPassengers, int seatingPreference) {
		
		int [][] lsfc = new int[5][2];
		int [][] rsfc = new int[5][2];
		
		for(int i = 0; i < 5; ++i) {
			for(int j = 0; j < 2; ++j) {
				lsfc[i][j] = getLeftSideFirstClass()[i][j];
				rsfc[i][j] = getRightSideFirstClass()[i][j];
			}
		}
		
		if(1 == numOfPassengers) {
			if(2 == seatingPreference) {
				for(int i = 0; i < 5; ++i) {
					if(0 == lsfc[i][0]) {
						setLeftSideFirstClass(i,0);
						return true;
					}
				}
				for(int i = 0; i < 5; ++i) {
					if(0 == rsfc[i][1]) {
						setRightSideFirstClass(i,1);
						return true;
					}
				}
			}
			else if(1 == seatingPreference) {
				for(int i = 0; i < 5; ++i) {
					if(0 == lsfc[i][1]) {
						setLeftSideFirstClass(i,1);
						return true;
					}
				}
				for(int i = 0; i < 5; ++i) {
					if(0 == rsfc[i][0]) {
						setRightSideFirstClass(i,0);
						return true;
					}
				}
			}
		}
		else if(2 == numOfPassengers) {
			for(int i = 0; i < 5; ++i) {
				if(0 == lsfc[i][0] && 0 == lsfc[i][1]) {
					setLeftSideFirstClass(i,0);
					setLeftSideFirstClass(i,1);
					return true;
				}
			}
			for(int i = 0; i < 5; ++i) {
				if(0 == rsfc[i][0] && 0 == rsfc[i][1]) {
					setRightSideFirstClass(i,0);
					setRightSideFirstClass(i,1);
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
				
		String r = "";
		
		for(int i = 0; i < 5; ++i) {
			for(int j = 0; j < 2; ++j) {				
				if(0 == getLeftSideFirstClass()[i][j]) {
					r = r + "_ ";
				}
				else if(1 == getLeftSideFirstClass()[i][j]) {
					r = r + "X ";
				}
			}
			r = r + "  |     |  ";
			for(int j = 0; j < 2; ++j) {
				if(0 == getRightSideFirstClass()[i][j]) {
					r = r + "_ ";
				}
				else if(1 == getRightSideFirstClass()[i][j]) {
					r = r + "X ";
				}
			}			
			r = r + "\n";
		}
		
		
		return r;
	}
	
}
