package Nested_Sinif.Generic_Interface;

public class Student<T> implements IDatabase<T>{


    @Override
    public boolean insert(T data) {
        return false;
    }

    @Override
    public boolean delete(T data) {
        return false;
    }

    @Override
    public boolean update(T data) {
        return false;
    }

    @Override
    public boolean select() {
        return false;
    }
}
