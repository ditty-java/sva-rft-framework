// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.testscripts;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Script3</b><br>
 * Generated     : <b>2014/03/25 12:34:21 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  March 25, 2014
 * @author Administrator
 */
public abstract class Script3Helper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * Hello: with default state.
	 *		.title : Hello
	 * 		.class : Html.HtmlDocument
	 * 		.url : file://C:\Users\Administrator\Desktop\scrollTest.html
	 */
	protected DocumentTestObject document_hello() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_hello"));
	}
	/**
	 * Hello: with specific test context and state.
	 *		.title : Hello
	 * 		.class : Html.HtmlDocument
	 * 		.url : file://C:\Users\Administrator\Desktop\scrollTest.html
	 */
	protected DocumentTestObject document_hello(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_hello"), anchor, flags);
	}
	
	

	protected Script3Helper()
	{
		setScriptName("testscripts.Script3");
	}
	
}
