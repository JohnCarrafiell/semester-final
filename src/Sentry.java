import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

   public Sentry(int x, int y, int Direction, int Beepers) {
      
   super(x, y, Direction, Beepers);
   }

	public void patrol() {
   move();
	while (frontIsClear()&&!nextToABeeper()){
      move();
      
      while (frontIsClear()&&nextToABeeper()){
      turnRight();
      move();
      }
	}
}
}
