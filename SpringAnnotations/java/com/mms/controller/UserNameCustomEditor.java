package com.mms.controller;

import java.beans.PropertyEditorSupport;

public class UserNameCustomEditor extends PropertyEditorSupport{

	
	public void setAsText(String user)
	{
		if(null != user && user.length() > 3)
		{
			
		
			setValue(user);
		}
		
	}
}
