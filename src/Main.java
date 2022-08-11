import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	private static List<Employee> lstShain;

	public static void main(String[] args) {

		Employee shain1 = new Employee("鈴木", 45, "M", "管理部");
		Employee shain2 = new Employee("佐藤", 40, "M", "管理部");
		Employee shain3 = new Employee("山本", 28, "F", "営業部");
		Employee shain4 = new Employee("中村", 25, "M", "開発部");
		Employee shain5 = new Employee("松本", 27, "F", "開発部");
		Employee shain6 = new Employee("渡辺", 30, "M", "営業部");
		Employee shain7 = new Employee("藤原", 35, "F", "開発部");

		// 社員のリスト
		lstShain = new ArrayList<>(Arrays.asList(shain1, shain2, shain3, shain4, shain5, shain6, shain7));

		// StreamAPI
		// 開発部の人の名前だけ表示
		System.out.println("開発部の人は");
		lstShain.stream().filter(x -> x.getDepartment() == "開発部").forEach(x -> System.out.println(x.getName() + "さん"));

		System.out.println("---------------------------------------");

		// 年齢の低い順に並べる
		System.out.println("年齢の低い順");
		lstShain.stream().sorted((x, y) -> Integer.compare(x.getAge(), y.getAge()))
				.forEach(x -> System.out.println("名前:" + x.getName() + " 年齢：" + x.getAge()));

		System.out.println("---------------------------------------");

		// クラスを取り出して文字列を編集する
		lstShain.stream().map(x -> x.getName() + "さんは" + (x.getSex() == "M" ? "男性" : "女性") + "です。")
				.forEach(x -> System.out.println(x));

		System.out.println("---------------------------------------");

		// 「藤」がつく人の人数を調べる
		long cnt = lstShain.stream().filter(x -> x.getName().contains("藤")).count();
		System.out.println("「藤」がつく人は" + cnt + "人です。");

		System.out.println("---------------------------------------");

		// 名前を検索する
		searchName("田中");
		searchName("佐藤");
	}

	private static void searchName(String name) {
		boolean b = lstShain.stream().anyMatch(x -> x.getName() == name);
		System.out.print(name + "さんは");
		if (b) {
			System.out.println("います。");
		} else {
			System.out.println("いません。");
		}
	}

}
