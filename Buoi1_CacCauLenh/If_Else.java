package com.example.Java_Core.Buoi1_CacCauLenh;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        int month = 8;
//
//        switch (month){
//            case 1:
//                System.out.println("Thang 1");
//                break;
//            case 5:
//                System.out.println("Thang 5");
//                break;
//            case 6:
//                System.out.println("Thang 6");
//                break;
//            case 12:
//                System.out.println("Thang 12");
//                break;
//            default:
//                System.out.println("deo co thang nao phu hop");
//        }



//        In bảng cửu chương từ 2 đến 9, mỗi bảng từ 1 đến 10, sử dụng vòng lặp lồng nhau
        for (int i=2; i < 10; i++){
            System.out.println("Bảng " +i);
            for (int j=1; j<=10; j++){
                System.out.println(i  + "*" + j + "=" + (i * j) );
            }
            System.out.println();
        }


//        Tính tổng các số chia hết cho 3 từ 1 đến 100
        int sum = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 3 là: "+ sum);



        //Đếm các số chẵn từ 1 đến 50 bằng 3 vòng lặp

        int dem = 0;

        for (int i = 1; i<=50; i++){
            if (i % 2 == 0){
                dem++;
            }
        }
        System.out.println("Có tất cả " + dem + " số chẵn");


        //while

        int i = 1;
        int dem = 0;

        while (i <= 50) {
            if (i % 2 == 0) {
                dem++;
            }
            i++;
        }

        System.out.println("Có tất cả " + dem + " số chẵn");

//        Kiểm tra điều kiện trước: i <= 50
//        Nếu điều kiện sai ngay từ đầu → không chạy lần nào
//        Phải tự tăng i (i++), nếu quên → vòng lặp vô hạn



        // do-while

        int i = 1;
        int dem = 0;

        do {
            if (i % 2 == 0) {
                dem++;
            }
            i++;
        } while (i <= 50);
        System.out.println("Có tất cả " + dem + " số chẵn");

//        Chạy thân vòng lặp trước
//        Sau đó mới kiểm tra điều kiện
//        Luôn chạy ít nhất 1 lần
//        Vẫn phải nhớ i++

    }
}
