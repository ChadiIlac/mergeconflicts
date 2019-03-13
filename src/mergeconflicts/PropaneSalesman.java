package mergeconflicts;

/**
 * @author: Chad Smith
 *
 */

public class PropaneSalesman {

    private boolean yes = true;
    
    public void heyBobby() {
        if(yes) {
	    System.out.println("I tell you whot,");
	    System.out.println("I like this new fangled generation of music.");
        }
    }
    
    public void whatDoIDo() {
    	System.out.println("I sell propane and propane accessories.");
    }
    
    public void warning() {
    	System.out.println("DO YOU HAVE A LICENSE FOR THAT PROPANE?");
    }

    public static void main(String [ ] args) { 
    	PropaneSalesman test = new PropaneSalesman();
    	test.heyBobby();
    	test.whatDoIDo();
    	test.warning();
    }
}
