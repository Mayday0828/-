import java.util.Random;

public class qiuhhe {
    public static void main(String[] args) {
        //生成10个1到100的随机数存入数组1）求和2）求平均数3）统计多少个数据比平均数小
         int arr[] = new int [10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;//随机数存入数组
        }
        int sum = 0;//随机数的和
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        int avg = sum / arr.length;//随机数的平均值
        System.out.println(avg);
        int count = 0;//求比平均数小的数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count++;
            }
        }
        System.out.println(count);


    }
}
