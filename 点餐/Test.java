import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double sum = 0;
        List<Dish> list2 = new ArrayList<>();
        //打印UI界面
        UI ui = new UI();
        ui.Ui_1();

        Scanner s = new Scanner(System.in);

        while (true){
            switch (s.nextInt()){
                case 0:
                    //打印主菜单
                    ui.Ui_1();
                    break;
                case 1:
                    while (true){
                        //展示菜单
                        ui.Ui_2();
                        //输入0则 退回主菜单
                        int id = s.nextInt();
                        if(id==0) {
                            ui.Ui_1();
                            break;
                        }
                        //输入其他：存储选择的菜品
                        Dish d = new Dish_List().dish_list().get(id - 1);
                        System.out.println('\n');
                        System.out.println("选择了"+d);
                        System.out.println('\n');
                        list2.add(d);
                    }
                    break;

                case 2:
                    //展示已经选择的菜
                    Iterator<Dish> iterator = list2.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case 3:
                    //总价
                    Iterator<Dish> it = list2.iterator();
                    while (it.hasNext()){
                        sum = sum+ it.next().getPrice();
                    }
                    System.out.println("总消费为：" +sum+ "元");
                    break;
            }
        }


    }
}
