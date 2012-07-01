import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
public class DmlSql2Insert {
	public ArrayList FirstList=null;
	public ArrayList SecondList=null;
	public String InsertTableName=null;
	public String FromClause=null;
	void parser(String CatchedScript) throws IOException, RecognitionException{

		//System.out.println("END");

		InputStream in=new ByteArrayInputStream(CatchedScript.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(in);
		DmlSQL2Lexer lexer = new DmlSQL2Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DmlSQL2Parser parser = new DmlSQL2Parser(tokens);
		parser.sql_script();
		FirstList=parser.sqlinsertinfo.getFirstList();
		SecondList=parser.sqlinsertinfo.getSecondList();
		InsertTableName=parser.sqlinsertinfo.getInsertTableName();
		FromClause=parser.sqlinsertinfo.getFromClause();
	}
}
