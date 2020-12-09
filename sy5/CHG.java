package sy5;

import java.util.Scanner;
import java.io.*;

public class CHG {
    public static void main(String args[]) {
        student xuesheng = new student();
        System.out.println("请输入班级，姓名，性别，年龄，学号，按回车确定");
        try (Scanner s = new Scanner(System.in)) {
			String cclass = s.nextLine();
			String name = s.nextLine();
			String sex = s.nextLine();
			int age = s.nextInt();
			int number = s.nextInt();
			xuesheng.setGraduate(cclass,name, sex, age, number);
		}
        try {
            FileReader fileReader = new FileReader("C:\\Users\\40354\\Documents\\CHG.txt");//读取文件A
            BufferedReader bufferedReader = new BufferedReader(fileReader);//存入缓存区
            Writer writer = new FileWriter(new File("C:\\Users\\40354\\Documents\\after.txt"));//写入文件A
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex, "$1，");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "。\n");
            }
            System.out.println(x);
            writer.write(String.valueOf(xuesheng));
            writer.write("\n");
            writer.write(String.valueOf(x));
            bufferedReader.close();//关闭缓冲区
            fileReader.close();//关闭文件读取
            writer.close();//关闭写入

            a:
            while (true) {
                System.out.println("输入1或者2选择查询字和词或者退出");
                Scanner in = new Scanner(System.in);
                int z = in.nextInt();
                switch (z) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("请输入想要查询的字:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); //使用replace方法将字符串替换为空，然后求长度
                        System.out.println(count);
                        break;
                    case 2:
                        System.out.println("退出");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出现错误!");
        }
    }
}