package stateDesignPattern;

//Java program to demonstrate working of 
//State Design Pattern 

interface MobileAlertState 
{ 
	public void alert(AlertStateContext ctx); 
} 

class Vibration implements MobileAlertState 
{ 
	@Override
	public void alert(AlertStateContext ctx) 
	{ 
//		mobile.setAudio(0);
//		mobile.setVibrationMotor(true);
		System.out.println("vibration..."); 
	} 

} 

class Silent implements MobileAlertState 
{ 
	@Override
	public void alert(AlertStateContext ctx) 
	{ 
//		mobile.setAudio(0);
//		mobile.setVibrationMotor(false);
		System.out.println("silent..."); 
	} 

} 

class Loud implements MobileAlertState 
{ 
	@Override
	public void alert(AlertStateContext ctx) 
	{ 
//		mobile.setAudio(100);
//		mobile.setVibrationMotor(true);
		System.out.println("loud..."); 
	} 

} 

class AlertStateContext 
{ 
	private MobileAlertState currentState; 

	public AlertStateContext() 
	{ 
		currentState = new Loud(); 
	} 

	public void setState(MobileAlertState state) 
	{ 
		currentState = state; 
	} 

	public void alert() 
	{ 
		currentState.alert(this); 
	} 
} 


class StatePattern 
{ 
	public static void main(String[] args) 
	{ 
		AlertStateContext stateContext = new AlertStateContext(); 
		stateContext.alert(); 
//		if(getLocation.name == 'seecs')
			stateContext.setState(new Silent()); 
		stateContext.alert(); 
//		if(getLocation.name == 'masjid')
			stateContext.setState(new Vibration()); 		
		stateContext.alert(); 
//		if(getLocation.name == 'market')
			stateContext.setState(new Loud());
		stateContext.alert();		 
	} 
} 