package student;

public class Course {
	int cid;
	String cName;
	int cadd;
	String ctime;
	String cteacher;
	
	public Course(int cid,int cadd,String cName,String ctime,String cteacher){
		this.cid=cid;
		this.cadd=cadd;
		this.cName=cName;
		this.ctime=ctime;
		this.cteacher=cteacher;
		
	}

	
    public String toString(){
    	return this.cid+" "+this.getCadd()+" "+this.getcName()+" "+this.getCtime()+" "+this.getCteacher();
    }
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCadd() {
		return cadd;
	}

	public void setCadd(int cadd) {
		this.cadd = cadd;
	}
	
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCteacher() {
		return cteacher;
	}

	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}
	
	
	}

