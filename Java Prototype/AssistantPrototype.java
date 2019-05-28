import javax.swing.JOptionPane;

public class AssistantPrototype {
	public static void main(String[] args) {
		String Input;
		String reminderName = null;
		String reminderDate;
		boolean Running = true;
		Input = JOptionPane.showInputDialog("Hi! How can I help you?");
		
		while (Running = true) {
		if (Input.contains("reminder"))
			reminderName = JOptionPane.showInputDialog("Ok! What should I call it?");
		    reminderDate = JOptionPane.showInputDialog("Alright, now what date should I set it for?");
		    JOptionPane.showMessageDialog(null, "Got it! I've set a reminder for " +reminderDate + " called " +reminderName);
		    Input = JOptionPane.showInputDialog("Anything else I can help you with?");
		    
	    if (Input.contains("show reminder"))
		    	JOptionPane.showMessageDialog(null, "Sure, you have a reminder set for " +reminderDate + " called" +reminderName);
		        Input = JOptionPane.showInputDialog("Anything else I can help you with?");
		    
		        
		        if (Input.contains("No"))
		    	return;
		}

	}

}
