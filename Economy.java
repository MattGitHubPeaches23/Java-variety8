
public class Economy extends AirPlane implements checkAvailability {
	
	
		
	public Economy() {	
	}

	
	public boolean checkAvailablity(int numOfPassengers, int seatingPreference) {
		
		int [][] lsec = new int[15][3];
		int [][] rsec = new int[15][3];
		
		for(int i = 0; i < 15; ++i) {
			for(int j = 0; j < 3; ++j) {
				lsec[i][j] = getLeftSideEconomyClass()[i][j];
				rsec[i][j] = getRightSideEconomyClass()[i][j];
			}
		}
		
		if(1 == numOfPassengers) {
			
			if(1 == seatingPreference) {
				for(int i = 0; i < 15; ++i) {
					if(0 == getLeftSideEconomyClass()[i][2]) {
						setLeftSideEconomyClass(i,2);
						return true;
					}
					if(0 == getRightSideEconomyClass()[i][0]) {
						setRightSideEconomyClass(i,0);
						return true;
					}
				}
			}
			else if(2 == seatingPreference) {
				for(int i = 0; i < 15; ++i) {
					if(0 == getLeftSideEconomyClass()[i][0]) {
						setLeftSideEconomyClass(i,0);
						return true;
					}
					if(0 == getRightSideEconomyClass()[i][2]) {
						setRightSideEconomyClass(i,2);
						return true;
					}
				}				
			}
			else if(3 == seatingPreference) {
				for(int i = 0; i < 15; ++i) {
					if(0 == getLeftSideEconomyClass()[i][1]) {
						setLeftSideEconomyClass(i,1);
						return true;
					}
					if(0 == getRightSideEconomyClass()[i][1]) {
						setRightSideEconomyClass(i,1);
						return true;
					}
				}
			}
			
		}
		else if(2 == numOfPassengers) {
			for(int i = 0; i < 15; ++i) {
				if(0 == lsec[i][0] && 0 == lsec[i][1]){
					setLeftSideEconomyClass(i,0);
					setLeftSideEconomyClass(i,1);
					return true;
				}
				else if(0 == lsec[i][1] && 0 == lsec[i][2]) {
					setLeftSideEconomyClass(i,1);
					setLeftSideEconomyClass(i,2);
					return true;
				}
				else if(0 == rsec[i][0] && 0 == rsec[i][1]){
					setRightSideEconomyClass(i,0);
					setRightSideEconomyClass(i,1);
					return true;
				}
				else if(0 == rsec[i][1] && 0 == rsec[i][2]) {
					setRightSideEconomyClass(i,1);
					setRightSideEconomyClass(i,2);
					return true;
				}
			}
			
		}
		else if(3 == numOfPassengers) {
			for(int i = 0; i < 15; ++i) {
				if (0 == lsec[i][0] && 0 == lsec[i][1] && 0 == lsec[i][2]){
					setLeftSideEconomyClass(i,0);
					setLeftSideEconomyClass(i,1);
					setLeftSideEconomyClass(i,2);
					return true;
				}
				else if (0 == rsec[i][0] && 0 == rsec[i][1] && 0 == rsec[i][2]){
					setRightSideEconomyClass(i,0);
					setRightSideEconomyClass(i,1);
					setRightSideEconomyClass(i,2);
					return true;
				}
			}
			
		}
		
		return false;
	}
	
	public String toString() {
		String r = "";
		
		for(int i = 0; i < 15; ++i) {
			for(int j = 0; j < 3; ++j) {				
				if(0 == getLeftSideEconomyClass()[i][j]) {
					r = r + "_ ";
				}
				else if(1 == getLeftSideEconomyClass()[i][j]) {
					r = r + "X ";
				}
			}
			r = r + "|     |";
			for(int j = 0; j < 3; ++j) {
				if(0 == getRightSideEconomyClass()[i][j]) {
					r = r + "_ ";
				}
				else if(1 == getRightSideEconomyClass()[i][j]) {
					r = r + "X ";
				}
			}			
			r = r + "\n";
		}
		return r;
	}
}
