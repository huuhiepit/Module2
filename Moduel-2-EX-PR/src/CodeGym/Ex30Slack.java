package CodeGym;

import java.util.Arrays;

public class Ex30Slack {
    public static void main(String[] args) {
        /**
         *  System.out.println(totalNumberBfBiggerNumberAt(numbers));
         *  double [] numbers = {1.6, -1.3, -1.8, 1.9, -1.7, 2.1};
         *  System.out.println(avgPositive(numbers));
         *  int [] numbers = {1, 3, 6, 2, 0, 9, 15};
         *  giveHeadDivisible3(numbers);
         *  int [] numbers = {1, 3, 6, 2, 0, 9, 15};
         *  reverseArrayNumber(numbers);
         *  listNumberInXY(numbers, 3, 7);
         *  9 System.out.println(countIsNumberPrime(numbers));
         *  10 System.out.println(countNumberAdjacentNumberEven(numbers));
         *  11 System.out.println(arrayIsSymmetry(numbers01));
         *  12 System.out.println(isAscending(numbers));
         *  13 System.out.println(isInside(numbers, numbers01));
         *  14 System.out.println(isArrayNumberAllPositive(matrix));
         *  15 System.out.println(isColumnDecrease(matrix, 0));
         *  16 System.out.println(oddNumbersExist(matrix));
         *  17 rowDecrease(matrix);
         *  18 System.out.println(firstEvenNumberInMatrix(matrix));
         *  19 System.out.println(evenNumberMaxInMatrix(matrix));
         *  20 listRowTotalMax(matrix);
         */
        int[] numbers = {1, 3, 6, 2, 10, 9, 8, 5, 11};
        int[] numbers01 = {1, 3, 6, 7};
        int[][] matrix = {
                {4, 2, 4}, {2, 0, 8}, {2, 0, -4}
        };
//        System.out.println(evenNumberMaxInMatrix(matrix));
        listRowTotalMax(matrix);

    }

    //Bài 1: Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực
    public static double totalNumberBfBiggerNumberAt(double[] numbers) {
        if (numbers.length != 0) {
            double total = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    total += numbers[i];
                }
            }
            return total;
        } else {
            throw new RuntimeException("Array Error");
        }
    }

    //Bài 2: Tính trung bình cộng các số dương trong mảng 1 chiều các số thực
    public static double avgPositive(double[] numbers) {
        if (numbers.length != 0) {
            double total = 0;
            double count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    total += numbers[i];
                    count++;
                }
            }
            return total / count;
        } else {
            throw new RuntimeException("Array Error");
        }

    }

    //Bài 3: Đưa các số chia hết cho 3 về đầu mảng
    public static void giveHeadDivisible3(int[] numbers) {
        //Numbers = [1, 3, 6, 0, 9, 15] => [3, 6, 9, 15, 0, 1]
        if (numbers.length != 0) {
            int index = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 3 == 0) {
                    int temp = numbers[index];
                    numbers[index] = numbers[i];
                    numbers[i] = temp;
                    index++;
                }
            }
            System.out.println("Array new: " + Arrays.toString(numbers));
        } else {
            throw new RuntimeException("Array Error");
        }
    }

    //Bài 4: Đảo ngược một mảng ban đầu
    public static void reverseArrayNumber(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        int star = 0, end = numbers.length - 1;
        while (star < end) {
            int temp = numbers[star];
            numbers[star] = numbers[end];
            numbers[end] = temp;
            star++;
            end--;
        }
        System.out.println("Array new: " + Arrays.toString(numbers));
    }

    //Bài 5: Hãy liệt kê các số có trong mảng 1 chiều từ [x, y] cho trước
    public static void listedNumberInXY(int[] numbers, int x, int y) {
        if (numbers.length == 0) {
            throw new RuntimeException("Erorr Array");
        }
        System.out.print("Các số nằm trong đoạn [" + x + ", " + y + "]: ");
        for (int number : numbers) {
            if (number >= x && number <= y) {
                System.out.print(number + " ");
            }
        }

    }

    //Bài 6: Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó
    public static void listedNumberBiggerNumberAbsAt(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        System.out.print("Các số thỏa đều kiện: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > Math.abs(numbers[i + 1])) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    //Bài 7: Hãy liệt kê các vị trí mà giá trị tại đó là số chính phương trong mảng 1 chiều các số nguyên
    public static void listedSquare(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        System.out.println("Vị trí các số chính phương nằm trong mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            if (Math.sqrt(numbers[i]) % 1 == 0) {
                System.out.println("Số chính phương: " + numbers[i] + "có vị trí " + i);
            }
        }
    }

    //Bài 8: Đếm số dương chia hết cho 7 trong mảng
    public static int countNumberDivisible7(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Mảng không hợp lệ");
        }

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0 && numbers[i] >= 0) {
                count++;
            }
        }
        return count;

    }

    //Bài 9: Đếm số nguyên tố trong mảng
    public static int countIsNumberPrime(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Erorr");
        }

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    //Bài 10: Hãy xác định số lượng phần tử kề nhau mà cả 2 đều chẵn
    public static int countNumberAdjacentNumberEven(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Erorr");
        }

        int count = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0 || numbers[i] % 2 == 0 && numbers[i - 1] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Bài 11: Kiểm tra mảng có đối xứng không? Có trả về 1, không có trả về 0
    public static byte arrayIsSymmetry(int[] numbers) {
        if (numbers.length == 0 || numbers.length == 1) return 0;
        int start = 0, end = numbers.length - 1;
        if (start < end) {
            if (numbers[start] != numbers[end]) {
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }

    //Bài 12: Kiểm tra mảng có tăng dần hay không
    public static boolean isAscending(int[] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //Bài 13: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
    public static boolean isInside(int[] numbers01, int[] numbers02) {
        if (numbers01.length == 0 || numbers02.length == 0) {
            throw new RuntimeException("Array Error");
        }
        if (numbers01.length > numbers02.length) return false;
        for (int i = 0; i < numbers01.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers02.length; j++) {
                if (numbers01[i] == numbers02[j]) {
                    count++;
                }
            }
            if (count == 0) return false;
        }
        return true;
    }

    //Bài 14: Kiểm tra ma trận 2 chiều có toàn dương hay không
    public static boolean isArrayNumberAllPositive(int[][] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        for (int[] numbers01 : numbers) {
            for (int number : numbers01) {
                if (number < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Bài 15: Kiểm tra một cột ma trận có giảm dần hay không
    public static boolean isColumnDecrease(int[][] numbers, int column) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        int j = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i].length != numbers[i + 1].length) {
                return false;
            }
            if (numbers[i][column] < numbers[i + 1][column]) {
                return false;
            }
            j++;
        }
        return true;
    }

    //Bài 16: Kiểm tra ma trận có tồn tại số lẻ hay không
    public static boolean oddNumbersExist(int[][] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        for (int[] numbers01 : numbers) {
            for (int number : numbers01) {
                if (number == 1) {
                    return true;
                }
                for (int i = 3; i < 10; i += 2) {
                    if (number % i == 0 && number != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Bài 17: Liệt kê các dòng giảm dần trong ma trận
    public static void rowDecrease(int[][] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;
            for (int j = 0; j < numbers[i].length - 1; j++) {
                if (numbers[i][j] < numbers[i][j + 1]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Array row " + i + ": " + Arrays.toString(numbers[i]));
            }
        }
    }

    //Bài 18: Tìm số chẵn đầu tiên trong ma trận
    public static int firstEvenNumberInMatrix(int[][] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        for (int[] numbers01 : numbers) {
            for (int number : numbers01) {
                if (number % 2 == 0)
                    return number;
            }
        }
        return -1;
    }

    //Bài 19: Tìm số chẵn lớn nhất trong ma trận
    public static int evenNumberMaxInMatrix(int[][] numbers) {
        if (numbers.length == 0) {
            throw new RuntimeException("Array Error");
        }
        int max = firstEvenNumberInMatrix(numbers);
        for (int[] numbers01 : numbers) {
            for (int number : numbers01) {
                if (number % 2 == 0 && number > max) {
                    max = number;
                }
            }
        }
        return max;
    }

    //Bài 20: Liệt kê các dòng có tổng lớn nhất trong ma trận
    public static void listRowTotalMax(int[][] matrix) {
//        int max = 0, total, countList = 1;
//        for (int i = 0; i < matrix.length; i++) {
//            total = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                total += matrix[i][j];
//            }
//            if (max == total) {
//                countList++;
//            }
//            if (total > max) {
//                max = total;
//                countList = 1;
//            }
//
//        }
//        int[] listIndex = new int[countList];
//        int index = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            total = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                total += matrix[i][j];
//            }
//            if (total == max) {
//                listIndex[index] = i;
//                index++;
//            }
//        }
//        System.out.println("Các dòng có tổng cao nhất: ");
//        for (int item : listIndex) {
//            System.out.println(Arrays.toString(matrix[item]));
//        }
        //Cach 2:
        int[] maxRowIndices = new int[matrix.length];
        int max = 0, count = 0;
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
            if(total > max) {
                max = total;
                maxRowIndices[count] = i;
                count = 1;
            } else if(max == total) {
                maxRowIndices[count] = i;
                count++;
            }
        }
        System.out.println("Các dòng có tổng cao nhất: ");
        for(int k = 0; k < count; k++) {
            System.out.println(Arrays.toString(matrix[maxRowIndices[k]]));
        }
    }
	//Bài 21: Tạo hàm đệ quy
	public static int factorial(int number) {
		if(number < 0) return -1;
		if(number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number -1);
	}
	
	//Bài 22: Find the index of the First Occurrence in a String
	public static int strStr(String haystack, String needle) {
	
	}
}
