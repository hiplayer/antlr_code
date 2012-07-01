import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.File; 
import java.util.Date; 
import jxl.*; 
import jxl.write.*; 
import jxl.write.biff.RowsExceededException;


import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class TestMain {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws IOException, RecognitionException, RowsExceededException, WriteException {
	/*
	System.setErr(new PrintStream(new FileOutputStream(new File( "output2.txt "))));
	WritableWorkbook workbook = Workbook.createWorkbook(new File("output.xls"));	
	InsertBlockParser IB=new InsertBlockParser(new FileInputStream(new File(args[0])));
	WritableSheet sheet = workbook.createSheet("Sheet", 0);
	int i=0;
	while(IB.parse()){
		DmlSql2Insert sqlinsert=new DmlSql2Insert();
		//System.err.println(IB.getInsertBlock());
		sqlinsert.parser(IB.getInsertBlock());	
		ArrayList lf=sqlinsert.FirstList;
		ArrayList ls=sqlinsert.SecondList;
		String sitab=sqlinsert.InsertTableName;
		String sftab=sqlinsert.FromClause;
		
		Iterator i1=lf.iterator();
		Iterator i2=ls.iterator();
		//System.out.println(sitab+'\t'+sftab);
		
		Label labelft = new Label(1, i, sftab);
		Label labelit = new Label(2, i, sitab);
		sheet.addCell(labelft);
		sheet.addCell(labelit);
		for(;i1.hasNext()&&i2.hasNext();){
			Object o1=i1.next();
			Object o2=i2.next();
			Label label1 = new Label(3, i, o1.toString()); 
			Label label2 = new Label(4, i, o2.toString()); 
			sheet.addCell(label1);
			sheet.addCell(label2);
			i++;
			//System.out.println(o1.toString()+'\t'+o2.toString());
			
		}
	}
	workbook.write();
	workbook.close();
	*/
	
	List pllist=FileListingpl.get(args[0]);
	
	WritableWorkbook workbook = Workbook.createWorkbook(new File("output.xls"));
	
	WritableSheet sheet=null;
	int i=65535;
	int num=0;
	//System.setOut(new PrintStream(new FileOutputStream(new File( "output.txt "))));
	System.setErr(new PrintStream(new FileOutputStream(new File( "output.log "))));       
	
	for(Iterator it=pllist.iterator();it.hasNext();){
		if(i>60000){
			sheet = workbook.createSheet("Sheet"+String.valueOf(num), num); 
			i=1;
			num++;
			
		}
		String fn=it.next().toString();
		InsertBlockParser IB=new InsertBlockParser(new FileInputStream(new File(fn)));
		//Label labelfn=new Label(0,i,new File(fn).getName());
		//sheet.addCell(labelfn);
		System.err.println(fn);
		while(IB.parse()){
			//System.out.println(IB.getInsertBlock());
			DmlSql2Insert sqlinsert=new DmlSql2Insert();
			sqlinsert.parser(IB.getInsertBlock());
			ArrayList lf=sqlinsert.FirstList;
			ArrayList ls=sqlinsert.SecondList;
			String sitab=sqlinsert.InsertTableName;
			String sftab=sqlinsert.FromClause;
			
			
			Iterator i1=lf.iterator();
			Iterator i2=ls.iterator();
			//System.out.println(sitab+'\t'+sftab);
			
			//Label labelft = new Label(1, i, sftab);
			//Label labelit = new Label(2, i, sitab);
			//sheet.addCell(labelft);
			//sheet.addCell(labelit);
			for(;i1.hasNext()&&i2.hasNext();){
				Label labelfn=new Label(0,i,new File(fn).getName());
				sheet.addCell(labelfn);
				Label labelft = new Label(1, i, sftab);
				sheet.addCell(labelft);
				Label labelit = new Label(2, i, sitab);
				sheet.addCell(labelit);
				Object o1=i1.next();
				Object o2=i2.next();
				Label label1 = new Label(3, i, o1.toString()); 
				Label label2 = new Label(4, i, o2.toString()); 
				sheet.addCell(label1);
				sheet.addCell(label2);
				i++;
				//System.out.println(o1.toString()+'\t'+o2.toString());
				
			}
		}
	}
	workbook.write();
	workbook.close();
	
	}
}
