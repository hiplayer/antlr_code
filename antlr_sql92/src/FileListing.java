import java.util.*;
import java.io.*;
/**
* Recursive file listing under a specified directory.
*  
* @author javapractices.com
* @author Alex Wong
* @author anonymous user
*/
public class FileListing {
	  
	  /**
	  * Recursively walk a directory tree and return a List of all
	  * Files found; the List is sorted using File.compareTo().
	  *
	  * @param aStartingDir is a valid directory, which can be read.
	  */
	  static public List get(
	    File aStartingDir
	  ) throws FileNotFoundException {
	    validateDirectory(aStartingDir);
	    List result = getFileListingNoSort(aStartingDir);
	    Collections.sort(result);
	    return result;
	  }

	  // PRIVATE //
	  static private List getFileListingNoSort(
	    File aStartingDir
	  ) throws FileNotFoundException {
	    List result = new ArrayList();
	    File[] filesAndDirs = aStartingDir.listFiles();
	    List filesDirs = Arrays.asList(filesAndDirs);
	    Iterator it=filesDirs.iterator();
	    for(;it.hasNext();) {
	    	Object o=it.next();
	      result.add(o); //always add, even if directory
	      if ( (boolean)((File) o).isDirectory()) {
	        //must be a directory
	        //recursive call!
	        List deeperList = getFileListingNoSort((File) o);
	        result.add(o);
	        result.addAll(deeperList);
	      }
	    }
	    return result;
	  }

	  /**
	  * Directory is valid if it exists, does not represent a file, and can be read.
	  */
	  static private void validateDirectory (
	    File aDirectory
	  ) throws FileNotFoundException {
	    if (aDirectory == null) {
	      throw new IllegalArgumentException("Directory should not be null.");
	    }
	    if (!aDirectory.exists()) {
	      throw new FileNotFoundException("Directory does not exist: " + aDirectory);
	    }
	    if (!aDirectory.isDirectory()) {
	      throw new IllegalArgumentException("Is not a directory: " + aDirectory);
	    }
	    if (!aDirectory.canRead()) {
	      throw new IllegalArgumentException("Directory cannot be read: " + aDirectory);
	    }
	  }

}
