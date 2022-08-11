import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee shain1 = new Employee();
		shain1.setName("鈴木");
		shain1.setAge(45);
		shain1.setSex("M");
		shain1.setDepartment("管理部");
		
		Employee shain2 = new Employee("佐藤", 40, "M", "管理部");
		Employee shain3 = new Employee("山本", 28, "F", "営業部");
		Employee shain4 = new Employee("中村", 25, "M", "開発部");
		Employee shain5 = new Employee("松本", 27, "F", "開発部");
		Employee shain6 = new Employee("渡辺", 30, "M", "営業部");
		Employee shain7 = new Employee("藤原", 35, "F", "開発部");
		
		// 社員のリスト
		List<Employee> lstShain = new ArrayList<>(Arrays.asList(shain1, shain2, shain3, 
				shain4, shain5, shain6, shain7));
		
		// リスト内容をすべて表示
		for (Employee shain : lstShain) {
			String name = shain.getName();
			int age = shain.getAge();
			String sex = shain.getSex();
			String department = shain.getDepartment();
						
			System.out.print("名前：" + name + " 年齢：" + age + 
					" 部署：" + department + " 性別：");
			if (sex.equals("M")) {
				System.out.println("男性");
			} else {
				System.out.println("女性");
			}		
		}
		
		System.out.println("---------------------------------------");
		
		// StreamAPI
		// 開発部の人の名前だけ表示
		lstShain.stream()
		.filter(x -> x.getDepartment() == "開発部")
		.forEach(x -> System.out.println("名前:" + x.getName()));
		
		System.out.println("---------------------------------------");

		// 年齢の低い順に並べる
		lstShain.stream()
		.sorted((x, y) -> Integer.compare(x.getAge(), y.getAge()))
		.forEach(x -> System.out.println("名前:" + x.getName() + " 年齢：" + x.getAge()));
		

	}

}
