package templateDesignPattern;

abstract class Game {
	final String Developer = "BumbleBee Game Studios Inc ";
	String version = "0.0.1" ;
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   //template method
	   public final void play(){

	      //Initialise the game
	      initialize();

	      //load or create player profile if doesnt exist.
	   
	      //start game
	      startPlay();

	      //end game
	      endPlay();
	      //save player profile and upload game score to central server.
	      System.out.println(Developer + version);
	   }
	}

class Cricket extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}

class Snooker extends Game {

	@Override
	void initialize() {
		System.out.println("Loading Player Profiles");
	}

	@Override
	void startPlay() {
		System.out.println("Random functions loaded and starting game");		
	}

	@Override
	void endPlay() {
		System.out.println("Game status and scores saved.");		
	}
}

class Football extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}



public class TemplatePatternDemo {
	   public static void main(String[] args) {
		      Game g1 = new Football();
		      g1.play();
		   }
}
