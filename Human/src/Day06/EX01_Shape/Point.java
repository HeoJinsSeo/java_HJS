package Day06.EX01_Shape;

public class Point {
	
	     int x,y ;
	     //기본생성자
	     
	     public Point() {
	    	 
	    	 this(0,0);
	    	 
	     }
	     public Point(int x, int y) {
	    	 this.x = x;
	    	 this.y = y;
	    	 
	    	 
	    	 
	     }
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
	

}
