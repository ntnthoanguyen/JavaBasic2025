package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {

    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Set
        //Không lưu được dữ liệu trùng lặp
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project"); //dữ liệu trùng sẽ lấy dữ liệu cuối cùng


        System.out.println(menu.contains("Task")); //Kiểm tra có chứa "Task" hay không
        menu.remove("Sales"); //Xóa giá trị
        System.out.println(menu.size());//Kiểm tra kích thước
        System.out.println("==================");

        System.out.println("Các phần tử của Set");
        System.out.println("\t" + menu + "\n");

        //Duyệt giá trị trong Set

        //Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Show set through for-each(vòng lặp for cải tiến)
        System.out.println("==================");
        for (String ojb : menu) {
            System.out.print(ojb + ", "); //bỏ ln sau print thì in ra hàng ngang +", " thêm dấu , sau giá trị
        }

    }
}
