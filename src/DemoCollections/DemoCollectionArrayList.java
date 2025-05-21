package DemoCollections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoCollectionArrayList {
    public static void main(String[] args) {

        //Khai báo dữ liệu ArrayList
        //Được phép lưu giá trị trùng lặp
        List<String> menu = new ArrayList<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");
        menu.add("Customer");

        //Xóa dữ liệu tại vị trí phần tử thứ 3
        menu.remove(3);

        //Cập nhật dữ liệu tại vị trí phần tử thứ 3
        menu.add(3,"Tasks1");


        //Kiểm tra dữ liệu


        //Duyệt dữ liệu kiểu ArrayList
        System.out.println("======================");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
        System.out.println("======================");
        int j=0;
        for (String value : menu){
            System.out.println(menu.get(j));
            j++;
        }
    }
}
