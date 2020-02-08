import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class CliqueAutomatico {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		
		//incubadora  
		//r.mouseMove(1550,500);
		
		//arv proc  
		//r.mouseMove(1640,515);
		
		//monte criacao 
		//r.mouseMove(1690,580);
		
		//santuario proc 
		r.mouseMove(1690,480);
						
		
		
		
		    r.mousePress( InputEvent.BUTTON1_MASK );
		    r.mouseRelease( InputEvent.BUTTON1_MASK );
		    Thread.sleep(50);
		    r.mousePress( InputEvent.BUTTON1_MASK );
		    r.mouseRelease( InputEvent.BUTTON1_MASK );
	}

}
