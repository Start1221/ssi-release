import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * @file_name	GetJar.java
 * @project		ssi-release
 * @author  	jshand
 * @createDate	Jun 26, 2013  10:10:42 AM
 * @version 	1.0
 * http://www.jshand.com
 * 
 */

public class GetJar {
	public static void main(String[] args) {
		File all = new File("E:\\googlecode\\svn\\tags\\ssi\\webapps\\WEB-INF\\lib");
		File me = new File("E:\\workspace\\ssi-release\\webapps\\WEB-INF\\lib");
		
		
		String allStrs[] = all.list();
		String meStrs[] = me.list();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < allStrs.length; i++) {
			boolean exists = false;
			for (int j = 0; j < meStrs.length; j++) {
				if(allStrs[i].equals(meStrs[j])){
					exists = true;
					break;
				}
			}
			if(!exists){
				list.add(allStrs[i]);
			}
		}
		
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
