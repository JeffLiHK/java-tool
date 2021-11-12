package data_structure.list;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Jeff Li, Kong Shuen
 * @version v1.0
 * @date 2021/9/12 - 2:06
 * @description
 */
public interface List<E> extends Collection<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<E> iterator();

    Object[] toArray();

    // TODO: Complete this interface by reference Java interface List source code.


}
