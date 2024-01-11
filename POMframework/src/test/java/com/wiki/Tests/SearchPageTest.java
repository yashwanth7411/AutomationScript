package com.wiki.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wikiPages.Homepage;
import com.qa.wikiPages.SearchPage;

public class SearchPageTest extends Base{
	
	Homepage hp;
	SearchPage sp;
	
	@BeforeClass
	public void setup() throws Throwable
	{
		initialize();
		hp=new Homepage();
		hp.searchinput("selenium Automation");
		sp=new SearchPage();
		
	}
	
	
}
