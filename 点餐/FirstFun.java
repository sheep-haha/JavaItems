
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;



public class FirstFun {


    ArrayList<Data> arrayListdata = new ArrayList<>();

    ListData listData = new ListData();

    public void Add(){

        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请按照序号输入ID：");
        data.setID(scanner.nextInt());
        System.out.println("请输入类别：");
        data.setName(scanner.next());
        System.out.println("请输入账户：");
        data.setAccount(scanner.next());
        System.out.println("请输入支出收入类型：");
        data.setType(scanner.next());
        System.out.println("请输入金额：");
        data.setTotal(scanner.nextInt());
        System.out.println(" 请输入时间：");
        data.setTime(scanner.next());
        System.out.println("请输入备注：");
        data.setDesc(scanner.next());

        List_Date().add(data);
        System.out.println("添加账户成功！");

    }

    public void Delete(){
        System.out.println("Delete");
    }

    public void Select(){

        System.out.println("【查询系统】："+ "\n"+ "1、查询所有 2、按时间查询 3、按照支出支入"+"\n"+"请输如功能序号[1-3]：");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            //3.1 查询所有
            case 1:
                SelectAll();
                break;

            //3.2、按时间查询
            case 2:
                SelectByTime();
                break;

            //3.3、按照支出支入
            case 3:
                SelectByType();
                break;
            default:
                System.out.println("请重新输入：");
        }


    }

    private void SelectByType() {


        System.out.println("[3.3按照支出支入]："+ "\n" + "请输入要查询的类型：支出 | 支入");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        //set注入
        listData.setArrayList(List_Date());
        ArrayList<Data> arrayList = listData.getArrayList();
        //怎么利用集合实现查询呢？-------stream流
        List<Data> stream = arrayList.stream()
                .filter(arrayListdata->{
                    String type1 = arrayListdata.getType();
                    return type1.equals(type);
                }).collect(Collectors.toList());


        Iterator<Data> iterator = stream.iterator();
        System.out.println("ID  类别    账户  类型  金额    时间         备注  ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private void SelectByTime() {

        //创建时间格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("[3.2按时间查询]："+ "\n" + "请输入查询起始时间：");

        Scanner scanner = new Scanner(System.in);
        String startTime = scanner.next();
        System.out.println("请输入查询截止时间：");
        String endTime = scanner.next();

        //set注入
        listData.setArrayList(List_Date());
        ArrayList<Data> arrayList = listData.getArrayList();
        //怎么利用集合实现查询呢？-------stream流
        List<Data> stream = arrayList.stream()
                .filter(arrayListdata->{
                    String time = arrayListdata.getTime();
                    try {
                        Date startDate = simpleDateFormat.parse(startTime);
                        Date endDate = simpleDateFormat.parse(endTime);
                        Date timeDate = simpleDateFormat.parse(time);

                        if(timeDate.before(endDate) && timeDate.after(startDate)){
                            return true;
                        }

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return false;
                }).collect(Collectors.toList());


        Iterator<Data> iterator = stream.iterator();
        System.out.println("ID  类别    账户  类型  金额    时间         备注  ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


    private void SelectAll() {
        //set注入
        listData.setArrayList(List_Date());
        ArrayList<Data> arrayList = listData.getArrayList();

        Iterator<Data> iterator = arrayList.iterator();
        System.out.println("ID  类别    账户  类型  金额    时间         备注  ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    public ArrayList<Data> List_Date () {

            Data d1 = new Data(1, "吃饭支出", "交行", "支出", 100, "2021-03-01", "家庭聚餐");
            Data d2 = new Data(2, "工资收入", "交行", "收入", 100, "2021-03-02", "发工资");
            Data d3 = new Data(3, "服装支出", "交行", "支出", 100, "2021-03-03", "买衣服A");
            Data d4 = new Data(4, "股票收入", "现金", "收入", 100, "2021-03-04", "股票涨了");
            Data d5 = new Data(5, "礼金支出", "现金", "支出", 100, "2021-03-05", "婚礼");
            Data d6 = new Data(6, "交通支出", "现金", "支出", 100, "2021-03-06", "汽油费");
            Data d7 = new Data(7, "其他支出", "工行", "支出", 100, "2021-03-07", "丢钱");
            Data d8 = new Data(8, "吃饭支出", "工行", "支出", 100, "2021-03-08", "家庭聚餐");
            Data d9 = new Data(9, "服装支出", "工行", "支出", 100, "2021-03-09", "买衣服B");
            Data d10 = new Data(10,"礼金支出","工行","支出",  100,"2021-03-10",  "满月");


            arrayListdata.add(d1);
            arrayListdata.add(d2);
            arrayListdata.add(d3);
            arrayListdata.add(d4);
            arrayListdata.add(d5);
            arrayListdata.add(d6);
            arrayListdata.add(d7);
            arrayListdata.add(d8);
            arrayListdata.add(d9);
            arrayListdata.add(d10);




            return arrayListdata;
        }
        
}
