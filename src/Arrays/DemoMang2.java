package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {

        //Khai báo và gán giá trị luôn cho mảng

        int number2[]={4,8,9,0,14,0,77,47};
        //Không cần chỉ định kích cỡ mảng, thêm bao nhiêu thì hiểu là bấy nhiêu

        //number2[2]=99;
        //Nếu khai báo tại đây thì được hiểu là vị trí thứ 3 trong mảng được thay thế bằng giá trị mới khai báo

        System.out.println("Length : "+number2.length);
        for (int i=0; i<number2.length; i++) {
            System.out.println(number2[i]);
        }

        System.out.println("=================");
        String dataCustomerName[]={"Quân", "Nam", "Long","Thủy", "Hồng"};
        System.out.println(dataCustomerName[0]);//Test lần 1
        System.out.println(dataCustomerName[1]);//Test lần 2
        System.out.println(dataCustomerName[4]);//Test lần 3

        System.out.println("=================");
        for (int i=0; i<dataCustomerName.length; i++) {
            if (dataCustomerName[i].equals("Hoa")){
                System.out.println("Có bạn Hoa");
            } else {
                System.out.println("Không có bạn Hoa");
            }
        }//Vòng lặp for tìm kiếm giá trị trong mảng

        System.out.println("=================");
        boolean check = true;
        for (int i=0; i<dataCustomerName.length; i++){
            if (dataCustomerName[i].equals("Bảo")){
                check=true;
                break;
            } else {
                check=false;
            }
        }
        if (check==true){
            System.out.println("Tìm thấy");
        } else {
            System.out.println("Không tìm thấy");
        } //chạy vòng lặp for kết hợp if else để tìm giá trị và thoát chương trình khi tìm thấy hoặc không
        // và chỉ hiển thị 1 kết quả


        System.out.println("=================");
        int dataCustomerAge[]={25, 28, 30, 32, 18};
        System.out.println(dataCustomerAge[0]);//Test lần 1
        System.out.println(dataCustomerAge[1]);//Test lần 2
        System.out.println(dataCustomerAge[4]);//Test lần 3

        System.out.println(dataCustomerName[1]);
        System.out.println(dataCustomerAge[1]);
    }
}
