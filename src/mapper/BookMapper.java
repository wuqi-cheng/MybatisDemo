package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.Book;

public interface BookMapper {
	@Select("select * from book")
	List<Book> selectAll();
	@Select("select * from book bid = ${bid}")
	Book findById(int bid);
	
	int insert(Book book);
	
}
