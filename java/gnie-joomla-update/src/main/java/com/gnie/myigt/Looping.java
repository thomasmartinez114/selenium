package com.gnie.myigt;

public class Looping {

	public static void main(String[] args) {

	// TODO Auto-generated method stub

		String[] sites = { "https://gnieqa.myigt.com/sites/us/cc/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/dca/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/fst/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/rrf/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/sd/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/to/administrator/index.php",
				"https://sch.gnieqa.myigt.com/schedule/administrator/index.php"
		};

		for (int instance = 0; instance < sites.length; instance++) {
			
			String gnieSite = sites[instance];

			// Set Joomla Update Button
			String joomlaUpdate = "document.location=" + gnieSite + "?option=com_joomlaupdate";
			String xpath = "//button[@onClick="+joomlaUpdate ;

//			System.out.println(joomlaUpdate);
			System.out.println(xpath);

		}
}
}
