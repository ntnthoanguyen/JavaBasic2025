package StaticJava;

public class Counter2 {

       static int count = 0; // sẽ không lấy bộ nhớ MỚI khi khởi tạo lại class hoặc gọi lại biến này

        Counter2() {
            count++;
            System.out.println(count);
        }

        public static void main(String args[]) {

            StaticJava.Counter2 c1 = new StaticJava.Counter2(); //Khởi tạo lần 1
            StaticJava.Counter2 c2 = new StaticJava.Counter2(); //Khởi tạo lần 2
            StaticJava.Counter2 c3 = new StaticJava.Counter2(); //Khởi tạo lần 3

        }

    }
