package goncalves.com.readinglist.Models.Abstract;
import java.util.List;

/**
 * Created by rafagonc on 1/5/16.
 */
public interface Author {

    //region Properties
    public String getName();
    //endregion

    //region Relationships
    public List<? extends Book> getBooks();
    //endregion

}