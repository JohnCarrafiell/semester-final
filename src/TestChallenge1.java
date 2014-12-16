import org.asl.karelx.Uberbot;
import org.asl.karelx.Squarebot;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class TestChallenge1 {
	
	public static void main(String[] args) {
		Display.openWorld("maps/default.map");
		Display.setSize(10, 10);
      
      Squarebot pete = new Squarebot(9, 3);
      
         pete.layCorners(5);
      
      Sentry sam = new Sentry(4, 3, Display.NORTH, 0);
      
         sam.patrol();


		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
	}

}
