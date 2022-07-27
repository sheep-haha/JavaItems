/**
 *     ID
 *     类别 type
 *     账户 account
 *     类型 type
 *     金额 total
 *     时间 time
 *     备注 desc
 */

public class Data {
    private int ID;
    private String name;
    private String account;
    private String type;
    private double total;
    private String time;
    private String desc;

    public Data() {
    }

    public Data(int ID, String name, String account, String type, double total, String time, String desc) {
        this.ID = ID;
        this.name = name;
        this.account = account;
        this.type = type;
        this.total = total;
        this.time = time;
        this.desc = desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return ID + "  " + name + "  " + account + "  " + type + "  " + total + "  " + time + "  " + desc;
    }
}