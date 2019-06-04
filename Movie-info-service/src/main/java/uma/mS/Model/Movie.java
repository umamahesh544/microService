package uma.mS.Model;

public class Movie {

	
	private String mname;
	private String desc;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String mname,String desc) {
		this.mname=mname;
		this.desc=desc;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
