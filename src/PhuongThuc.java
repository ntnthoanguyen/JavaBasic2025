public class PhuongThuc {

    double sum;
    double res;

    //Hàm KHÔNG trả về
    public void cong2So() {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }


    public void loginCRM() {
        System.out.println("Navigate to URL");
        System.out.println("Enter email and password");
        System.out.println("Click Login button");
        System.out.println("Verify login succerss");
    }

    //Hàm có tham số
    public void cong2So(int number1, int number2) {
        System.out.println(number1 + number2);

    }

    //Hàm có trả về kết quả
    public double nhan2So() {
        int a = 5;
        int b = 10;
        res = a * b;
        return res;
    }

    public long nhan3So(int a, int b, int c) {
        return a * b * c;

    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2So();
        phuongThuc.nhan2So();

        phuongThuc.cong2So(300, 50); //xử lý tính toán giá trị động
        phuongThuc.cong2So(100, 20);
        System.out.println(phuongThuc.nhan3So(2, 3, 4) % 5);

        //System.out.printf(phuongThuc.cong2So()+5); Hàm không trả về nên không tinh toán được tiếp
        System.out.println(phuongThuc.nhan2So() + 10); //Hàm có trả về tiếp tục tính toán được

        phuongThuc.loginCRM();

    }
}
