package homework01;

public class UserVO {

	//Field
	private boolean active;
	private int regNum;
	private String name;
	private String gender;
	private String type;
	
	
	///Constructor	
	public UserVO() {
	}

	///Method	
	@Override
	public String toString() {
		
		String temp ="UserVO = Active :" + active + ", RegNum : " + regNum + ",  Name : " + name + ",  Gender : " + gender + ", Type : " + type ;	
		return temp;
	}

	public boolean isActive() {
		return active;
	}

	public int getRegNum() {
		return regNum;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getType() {
		return type;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
