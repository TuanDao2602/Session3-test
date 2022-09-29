import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0];
        do {
        System.out.println("*******************Menu********************");
        System.out.println("1 Nhập vào giá trị các phần tử mảng");
        System.out.println("2 Hiển thị các giá trị phần tử mảng");
        System.out.println("3 In giá trị các phần tử là số nguyên tố trong mảng");
        System.out.println("4 In giá trị max , min các phần tử trong mảng");
        System.out.println("5 Sắp xếp mảng giảm dần");
        System.out.println("6 thoát");
        System.out.println("sự lựa chọn của bạn là : ");
        int nhanVao = Integer.parseInt(scanner.nextLine());
        switch (nhanVao){
            case 1:
                System.out.println("nhập vào độ dài của mảng");
                int n = Integer.parseInt(scanner.nextLine());
                array = new int[n];

                for (int i = 0; i <array.length; i++) {
                    System.out.printf("nhập vào các giá trị của mảng %d ",(i+1) );
                    array[i] =Integer.parseInt(scanner.nextLine());
                }
                break;
            case 2:
                System.out.printf("các giá trị của mảng là\n");
                for (int i = 0; i <array.length; i++) {
                    System.out.printf("%d\t",array[i]);
                }
                System.out.println("\n");
                break;
            case 3:
                System.out.println("các số  nguyên tố là : ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i] >=2){
                        boolean check = false;
                        for (int j = 2; j < array[i]; j++) {
                            if (array[i]%j==0){
                                check=true;
                            }

                        }if (check!=true){
                            System.out.printf("%d\t",array[i]);
                        }
                    }

                }
                System.out.println("\n");
                break;
            case 4:
                System.out.println("giá trị lớn nhất và nhỏ nhất là : ");
                int max=array[0];
                for (int i=0;i<array.length;i++){
                    if (max<array[i]){
                        max=array[i];
                    }
                }
                int min=array[0];
                for (int j=0;j<array.length;j++ ){
                    if (min>array[j]){
                        min=array[j];
                    }
                }
                System.out.printf("giá trị lớn nhất là : %d\n giá trị nhỏ nhất là: %d",max,min);
                System.out.printf("\n");
                break;
            case 5:
                System.out.println("mảng sau khi sắp xếp là: ");
                for (int i=0;i< array.length;i++){
                    for (int j = i+1; j < array.length ; j++) {
                        if (array[i] < array[j]){
                            int temp = array[i];
                            array[i] =array[j];
                            array[j]=temp;
                        }

                    }
                    System.out.printf("%d\t",array[i]);
                }
                break;
            case 6 :
                System.exit(0);
                break;
            default:
                System.out.println("mời nhập lại số từ 0-6");
                System.out.println("\n");

        }



        }while (true);
    }
}
