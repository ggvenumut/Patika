package Nested_Sinif.Generic_Interface;

public interface IDatabase <T> {

    public boolean insert(T data);
    public boolean delete(T data);
    public boolean update(T data );
    public boolean select();



}
