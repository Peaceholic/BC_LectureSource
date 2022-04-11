package homework02;

public class UserVO {

	// Field
	private boolean active;
	private int regNum;
	private String name;
	private String gender;
	private String type;
	private int phone1;
	private int phone2;
	private int phone3;

	/// Constructor
	public UserVO() {
	}

	/// Method
	@Override
	public String toString() {

		String temp = "<h1> = ȸ������ = </h1> "
						+ "[ Active ] : " + active 
						+ "<br><br> [ RegNum ] : " + regNum 
						+ "<br><br> [ Name ] : " + name 
						+ "<br><br> [ Gender ] : "+ gender 
						+ "<br><br> [ Type ] : " + type 
						+ "<br><br> [ Phone ] : " + phone1 +"-"+ phone2 +"-"+ phone3;
		return temp;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getRegNum() {
		return regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPhone1() {
		return phone1;
	}

	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}

	public int getPhone2() {
		return phone2;
	}

	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}

	public int getPhone3() {
		return phone3;
	}

	public void setPhone3(int phone3) {
		this.phone3 = phone3;
	}

}
