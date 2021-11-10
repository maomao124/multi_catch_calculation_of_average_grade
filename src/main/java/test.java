import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project name(项目名称)：多重catch 计算平均成绩
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 13:45
 * Version(版本): 1.0
 * Description(描述)： 编写一个程序，根据用户输入的总人数和总成绩计算平均成绩。要求程序能够处理总人数或者总成绩不是数字时的情况。
 */

public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.println("请输入班级总人数：");
            int count = input.nextInt();
            System.out.println("请输入总成绩：");
            int score = input.nextInt();
            int avg = score / count; // 获取平均分
            System.out.println("本次考试的平均分为：" + avg);
        }
        catch (InputMismatchException e1)
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("输入数值有误！");
        }
        catch (ArithmeticException e2)
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("输入的总人数不能为0！");
        }
        catch (Exception e3)
        {
            e3.printStackTrace();
            System.out.println("发生错误！" + e3.getMessage());
        }
    }
}

