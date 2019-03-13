package mergeconflicts;

/**
 * @author: Chad Smith
 *
 */

public class HaHaYes {

    private boolean yes = true;
    
    public void getYes() {
        if(yes) {
	    System.out.println("Ha Ha Yes");
        }
    }

    public static void main(String [ ] args) { 
    	HaHaYes test = new HaHaYes();
    	test.getYes();
    }
}
