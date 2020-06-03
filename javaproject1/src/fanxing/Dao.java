package fanxing;

import java.util.*;

/**
 * @author wu
 * @create 2019-09-06   17:16
 */
public class Dao<T> {
    private Map<String, T> map;

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        T entity = map.get(id);
        return entity;
    }

    public void update(String id, T entity) {
        Object obj = (Object) entity;
        save(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        map=new HashMap<>();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String id = iterator.next();
            T t = get(id);
            update(id,t);
            list.add();
        }
    }

    public void delete(String id) {
        map.remove(id);
    }

}
