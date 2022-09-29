import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mangHaiChieu = new int[0][0];
        int hang=0;
        int cot=0;

        do {
            System.out.println("*************Menu**************");
            System.out.println("1 nhập vào các giá trị của mảng");
            System.out.println("2 in các phần tử của mảng theo ma trận");
            System.out.println("3 in các phần tử nằm trên chéo chính , chéo phụ và tính tổng");
            System.out.println("4 sắp xếp mảng tăng dần theo cột");
            System.out.println("5 thoát");
            System.out.println(" sự lựa chọn của bạn là:");
            int nhanVao = Integer.parseInt(scanner.nextLine());
            switch (nhanVao) {
                case 1:
                    System.out.println("nhập vào số hàng của mảng");
                    hang = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập vào số cột của mảng");
                    cot = Integer.parseInt(scanner.nextLine());
                    mangHaiChieu = new int[hang][cot];
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            System.out.printf("nhập vào phần tử mảng [%d] [%d] ", i, j);
                            mangHaiChieu[i][j] = Integer.parseInt(scanner.nextLine());

                        }

                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("phần tử mảng in theo ma trận là : ");
                    for (int i = 0; i < hang; i++) {
                        for (int j = 0; j < cot; j++) {
                            System.out.print(mangHaiChieu[i][j] + "\t");

                        }
                        System.out.println("\n");

                    }
                    break;
                case 3:
                    //In các giá trị nằm trên chéo chính ,chéo phụ và tính tổng

                    if (hang == cot) {
                        int sum1 = 0;
                        System.out.println("phần tử nằm trên chéo chính là ");
                        for (int i = 0; i < hang; i++) {
                            for (int j = 0; j < cot; j++) {
                                if (i == j) {
                                    System.out.printf("%d\t", mangHaiChieu[i][j]);
                                    sum1 += mangHaiChieu[i][j];
                                }

                            }
                            System.out.printf("tổng là %d\n", sum1);// kq chưa đúng
                        }
                    }else{
                            System.out.println("không phải là ma trận vuông không có đường chéo chính");
                        }

                        break;
                        case 4:
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println(" vui lòng nhập vào các số 0-5");

                    System.out.println("\n");
            }
        }while (true);
    }
}
