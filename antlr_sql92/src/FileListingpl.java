import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class FileListingpl {
	static List get(String fn) throws FileNotFoundException{
		List fl=FileListing.get(new File(fn));
		ArrayList rl=new ArrayList();
		Pattern p1=Pattern.compile("\\.pl$",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		for(Iterator i=fl.iterator();i.hasNext();){
			Object o=i.next();
			Matcher m1=p1.matcher(o.toString());
			if(m1.find()){
				rl.add(o);
			}
		}
		return rl;
		
	}
}
