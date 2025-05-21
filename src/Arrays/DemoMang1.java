package Arrays;

public class DemoMang1 {
    public static void main(String[] args) {
        //Khai báo mảng rỗng, chưa mang giá trị
        int number1[] = new int[6]; //6 là số lượng giá trị của mảng
        //Gán giá trị cho mảng
        number1[0] = 40;
        number1[1] = 45;
        number1[2] = 50;
        number1[3] = 60;
        number1[4] = 15;

        System.out.println("Độ dài mảng: "+number1.length); //length để lấy ra độ dài của mảng
        System.out.println(number1[4]); //Truy xuất giá trị phẩn tử vị trí cụ thể của mảng

        System.out.println("=================");
        //Duyệt mảng để lấy giá trị ra
        //Vòng lặp for cơ bản (basic) thì sử dụng để in giá trị có điều kiện điểm đầu và điểm cuối
        for (int i=0; i<number1.length; i++) {
            System.out.println(number1[i]);
        }

        System.out.println("=================");
        for (int i=2; i<5; i++) {
            System.out.println(number1[i]);
        }

        //Vòng lặp for cải tiến thì không quan tâm giá trị đầu cuối
        //Mà sẽ duyệt từ đầu tới cuối
        System.out.println("=================");
        for (int number : number1) {
            System.out.println(number);
        }

    }
}
