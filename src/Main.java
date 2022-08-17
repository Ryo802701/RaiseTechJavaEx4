import java.util.Arrays;
import java.util.List;

public class Main {

	private static List<Employee> lstEmployee;

	public static void main(String[] args) {

		Employee employee1 = new Employee("鈴木", 45, "M", "管理部");
		Employee employee2 = new Employee("佐藤", 40, "M", "管理部");
		Employee employee3 = new Employee("山本", 28, "F", "営業部");
		Employee employee4 = new Employee("中村", 25, "M", "開発部");
		Employee employee5 = new Employee("松本", 27, "F", "開発部");
		Employee employee6 = new Employee("渡辺", 30, "M", "営業部");
		Employee employee7 = new Employee("藤原", 35, "F", "開発部");

		// 社員のリスト
		lstEmployee = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7);

		// StreamAPI
		// 開発部の人の名前だけ表示
		System.out.println("開発部の人は");
		lstEmployee.stream().filter(x -> x.getDepartment().equals("開発部"))
							 .forEach(x -> System.out.println(x.getName() + "さん"));

		System.out.println("---------------------------------------");

		// 年齢の低い順に並べる
		System.out.println("年齢の低い順");
		lstEmployee.stream().sorted((x, y) -> Integer.compare(x.getAge(), y.getAge()))
							 .forEach(x -> System.out.println("名前:" + x.getName() + " 年齢：" + x.getAge()));

		System.out.println("---------------------------------------");

		// クラスを取り出して文字列を編集する
		lstEmployee.stream().map(x -> x.getName() + "さんは" + (x.getSex().equals("M") ? "男性" : "女性") + "です。")
							 .forEach(x -> System.out.println(x));

		System.out.println("---------------------------------------");

		// 「藤」がつく人の人数を調べる
		long cnt = lstEmployee.stream().filter(x -> x.getName().contains("藤"))
										.count();
		System.out.println("「藤」がつく人は" + cnt + "人です。");

		System.out.println("---------------------------------------");

		// 名前を検索する
		searchName("田中");
		searchName("佐藤");
	}

	private static void searchName(String name) {
		boolean b = lstEmployee.stream().anyMatch(x -> x.getName().equals(name));
		System.out.print(name + "さんは");
		if (b) {
			System.out.println("います。");
		} else {
			System.out.println("いません。");
		}
	}

}
