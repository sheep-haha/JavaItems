public class UI {
    public void Ui_1(){
        System.out.println("------主菜单-----");
        System.out.println("菜单       1");
        System.out.println("已点菜品    2");
        System.out.println("买单       3");
        System.out.println("----按0返回菜单----");
    }

    public void Ui_2(){
        System.out.println("——-请你点餐---");
        new Dish_List().dish_list();
        System.out.println("----按0返回菜单----");


    }
}
