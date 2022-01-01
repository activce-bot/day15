package exer2;

import java.util.*;

/**
 * @author gjx
 * @create 2021-12-14 9:44
 */
public class DAO<T> {

    private HashMap<String, T> map = new HashMap<>();


    /**
     * 保存 T 类型的对象到 Map 成员
     * 变量中
     *
     * @param id
     * @param entity
     */
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * 获取对象
     *
     * @param id
     * @return
     */
    public T get(String id) {
        return map.get(id);
    }

    /**
     * 替换
     *
     * @param id
     */
    public void update(String id, T entity) {
        //找到了就添加
        if (map.get(id) != null) {
            map.put(id, entity);
            return;
        } else {
            System.out.println("没有找到对应的id");
        }
    }

    /**
     * 返回全部对象
     *
     * @return
     */
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T o : values) {
            list.add(o);
        }
        return list;
    }

    /**
     * 删除指定位置的元素
     *
     * @param id
     */
    public void delete(String id) {
        map.remove(id);
    }


}
