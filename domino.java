package domino;

public class domino {

	
	public class DominoTile {

		private int leftSide;
		private int rightSide;
		
		public DominoTile() {
			
			this.leftSide = 0;
			this.rightSide = 0;

		}
		
		public DominoTile(int leftSide, int rightSide) {//constructor
			
			if(leftSide>=0 && leftSide<=6) {
				
				this.leftSide = leftSide;
			}
			
			if (rightSide>=0 && rightSide<=6) {
			
				this.rightSide = rightSide;
			}
			
		}
		
		
		public int leftSideGet() { //leftSide getter
			
			return this.leftSide;
		}
		public int rightSideGet() { //rightSide getter
		
			return this.rightSide;
		}
		
		
		public void sideSwapper() {          //swapper
			int tempSwapper = this.leftSide;
			this.leftSide = this.rightSide;
			this.rightSide = tempSwapper;
			
		}
		
		
		public boolean equals(DominoTile tile) { //equal checker
			
			if (tile.leftSide == this.leftSide && tile.rightSide==this.rightSide) {		
			
				return true;	
			}
			if (tile.leftSide==this.rightSide && tile.rightSide==this.leftSide) {
				
				return true;
			}
			
			
			return false;
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
