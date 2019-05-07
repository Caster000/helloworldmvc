package org.helloworldmvc.view;

import org.helloworldmvc.Contract.IView;

public class View implements IView {
	
	public String displayMessage(String message) {
		return message;
		
	}
}
