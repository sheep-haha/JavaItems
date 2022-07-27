import java.util.Scanner;

public class Menu {


    public void m1(){
        System.out.println(" ---------------记账本-------------");
        System.out.println("1、添加账户  2、删除账户  3、查询系统  4、退出系统");
        System.out.println("请输如功能序号[1-4]：");
    }

   public void menu(){
       FirstFun firstFun = new FirstFun();
       m1();

       boolean flag = true;
       while (flag) {
           //获取主界面输入的序号
           Scanner scanner = new Scanner(System.in);
           int i = scanner.nextInt();

           switch (i) {
               //1、添加账户
               case 1:
                   firstFun.Add();
                   m1();
                   break;

               //2、删除账户
               case 2:
                   firstFun.Delete();
                   m1();
                   break;

               //3、查询系统
               case 3:
                   firstFun.Select();
                   m1();
                   break;

               //4、退出系统
               case 4:
                   System.out.println("谢谢使用，bye~");
                   flag = false;
                   break;

               default:
                   System.out.println("请重新输入：");
           }

       }
   }

}
