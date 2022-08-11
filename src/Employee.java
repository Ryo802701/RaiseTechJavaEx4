// 社員情報を保持するクラス
public class Employee {

	// フィールド
	private String name;		//名前
	private int age;			//年齢
	private String sex;			//性別
	private String department;	//部署
	
	// コンストラクタ
	public Employee() {
	}
	
	public Employee(String name, int age, String sex, String department) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.department = department;
	}
	
	// セッター
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// ゲッター
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public String getDepartment() {
		return this.department;
	}
}
