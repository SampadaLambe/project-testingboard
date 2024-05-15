package com.project.page;

import com.project.base.ProjectBase;

public class Y_TitleURL extends ProjectBase {
	
	public String URLCheck()
	{
		String url = driver.getCurrentUrl();
		System.out.println("Automation URL "+url);
		return url;
	}
	public String titleCheck()
	{
		String title = driver.getTitle();
		System.out.println("Automation title "+title);
		return title;
	}
		
}
	