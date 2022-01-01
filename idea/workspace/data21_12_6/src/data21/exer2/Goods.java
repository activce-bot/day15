package data21.exer2;

/**
 * @author gjx
 * @create 2021-12-08 10:39
 */
public class Goods implements Comparable {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" + "name='" + name + '\'' + ", price=" + price + '}'+"\n"; }

    //对自定义类的方法comple 重写
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods =(Goods)o;
            if(this.price <goods.price){
                return -1;
            }else if(this.price >this.price){
                return 1;
            }else{
                //二级排序  加负号反向排序
                return this.name.compareTo(goods.name);
            }

//            return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
