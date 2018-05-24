package helper;

import java.util.List;

public interface IBaseDao {
    Object findAll();

    Object findById(int id);

    boolean save();

    boolean update(int id);

    boolean delete(int id);
}
