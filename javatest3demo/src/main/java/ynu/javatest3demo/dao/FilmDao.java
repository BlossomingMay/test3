package ynu.javatest3demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FilmDao {

    @Insert("insert into film (title,description,language_id) values(#{title},#{description},#{language_id})")
    void insertFilm(@Param("title") String title, @Param("description") String description, @Param("language_id") int language_id);

}
