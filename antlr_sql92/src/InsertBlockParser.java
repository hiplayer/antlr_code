import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertBlockParser {
	private String StringInsertBlock=null;
	private StringBuffer CatchedScript=null;
	private Pattern p=null;
	private Matcher m=null;
	InsertBlockParser(InputStream in) throws IOException{
		InputStreamReader reader =new InputStreamReader(in,"GB18030");
		CatchedScript=new StringBuffer();
		int b;
		while ((b = reader.read()) != -1){
			CatchedScript.append((char)b);
			//System.out.print((char)b);
		}
		Pattern p1=Pattern.compile("\\{\\s*'",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		Matcher m1 = p1.matcher(CatchedScript);
		CatchedScript=new StringBuffer(m1.replaceAll("{\""));
		
		Pattern p2=Pattern.compile("\'\\s*\\}",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		Matcher m2 = p2.matcher(CatchedScript);
		CatchedScript=new StringBuffer(m2.replaceAll("\"}"));
		
		Pattern p3=Pattern.compile("/\\*[^\\/*]*\\*/",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		Matcher m3 = p3.matcher(CatchedScript);
		CatchedScript=new StringBuffer(m3.replaceAll(""));
		
		p=Pattern.compile("(?<!-)INSERT\\s+INTO[^;]*?;",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE|Pattern.DOTALL);
		
		m = p.matcher(CatchedScript);
	}
	boolean parse() throws IOException{

		boolean br=m.find();
		if(br){
			StringInsertBlock=m.group();
		}else{
			StringInsertBlock=new String();
		}
		return br;
	}
	String getInsertBlock(){
		return StringInsertBlock;
	}
}
