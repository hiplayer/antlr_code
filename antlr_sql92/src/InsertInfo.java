import java.util.ArrayList;

public class InsertInfo {
	private String InsertTableName=null;
	private String FromClause=null;
	public ArrayList FirstList=null;
	public ArrayList SecondList=null;
	public InsertInfo(){
		FirstList=new ArrayList();
		SecondList=new ArrayList();
	}
	public void setInsertTableName(String s){
		this.InsertTableName=s;
	}
	public String getInsertTableName(){
		return this.InsertTableName;
	}
	public void setFromClause(String s){
		this.FromClause=s;
	}
	public String getFromClause(){
		return this.FromClause;
	}
	public void addFirstElem(String first){
		FirstList.add(first);
	}
	public void addSecondElem(String second){
		SecondList.add(second);
	}
	public ArrayList getFirstList(){
		return FirstList;
	}
	public ArrayList getSecondList(){
		return SecondList;
	}
}
