package Collection_work725.Generic;


interface Genericimpl<T> {
    void show(T t);
}

class GenericImplClass<T> implements Genericimpl<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}


