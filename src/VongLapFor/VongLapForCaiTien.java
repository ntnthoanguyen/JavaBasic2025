package VongLapFor;

public class VongLapForCaiTien {
    public static void main(String[] args) {
        int arr[] = {40, 50, 15, 66, 67, 80, 100};
        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
            //Vòng lặp for này đều duyệt được mảng trên
            // nhưng bất cập là phải đếm phần tử,
            // nên vong lặp for cải tiến được sinh ra để giải quyết bài toán
            // khi trong mảng có quá nhiều phần tử
        }

        String menu[] = {"Dashboard", "Customer", "Project", "Task" };
        for (String manuName : menu) {
            System.out.println(manuName);
        }
    }
}
