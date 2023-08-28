package CaseStudy.repository;

import java.util.List;

public interface IFurameRepo<E> {
    void add(E e);

    void delete(E e);

    List<E> display();
}
