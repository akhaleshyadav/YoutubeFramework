package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
   public static void Takelog(String classname, String msg)
   {
	   DOMConfigurator.configure("C:\\Users\\Akhalesh\\git\\YT_Repository\\YTFramwork\\src\\org\\testing\\Utilities\\layout.xml");
	   Logger l=Logger.getLogger(classname);
	   l.info(msg);
   }
}
