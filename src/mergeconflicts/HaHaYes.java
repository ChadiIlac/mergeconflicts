package mergeconflicts;

/**
 * @author: Chad Smith
 *
 */

public class HaHaYes {

    private boolean yes = true;
    
    public void HeyBobby() {
        if(yes) {
	    System.out.println("I tell you whot,");
	    System.out.println("I like this new fangled generation of music.");
        }
    }

    public static void main(String [ ] args) { 
    	HaHaYes test = new HaHaYes();
    	test.HeyBobby();
    }
}
