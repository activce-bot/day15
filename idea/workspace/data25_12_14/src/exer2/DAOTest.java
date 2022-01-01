package exer2;

import java.util.Iterator;
import java.util.List;

/**
 * @author gjx
 * @create 2021-12-14 9:47
 */
public class DAOTest {
    public static void main(String[] args) {
        //使用泛型来调用User！！！！
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1001",new User(1001,18,"caixujkun1"));
        userDAO.save("1002",new User(1002,20,"caixujkun3"));
        userDAO.save("1003",new User(1003,24,"caixujkun5"));
        userDAO.save("1004",new User(1004,17,"caixujkun4"));
        userDAO.save("1005",new User(1005,30,"caixujkun2"));

        userDAO.update("1001",new User(1001,100, "kk"));
        List<User> list1 = userDAO.list();
//
        System.out.println("*************");
        Iterator<User> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(userDAO.get("1003"));
        userDAO.delete("1001");
        System.out.println("***********删除后的************");
//
        List<User> list2 = userDAO.list();
        System.out.println(list2);


    }
}
