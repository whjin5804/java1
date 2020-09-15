import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class GavaGoHome {

	public static void main(String[] args) {
		
		String id = "java APT 501";

		// Elevator Call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security Off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light On
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id + " / floor Lamp");
		floorLamp.on();
		
	}

}
