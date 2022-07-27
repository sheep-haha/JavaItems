import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dish_List {
    public List<Dish> dish_list(){
        Dish d1 = new Dish(1 ,"香辣肉丝" ,39.0);
        Dish d2 = new Dish(2 ,"炖王八 "  ,58.0);
        Dish d3 = new Dish(3 ,"竹笋炒肉" ,21.0);
        Dish d4 = new Dish(4 ,"口水鸡"   ,29.0);
        Dish d5 = new Dish(5 ,"地三鲜"   ,28.0);

        List<Dish> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);

        Iterator<Dish> iterator = list.iterator();
        while (iterator.hasNext()){
            Dish d= iterator.next();
            System.out.println(d);
        }
        return list;
    }


}
