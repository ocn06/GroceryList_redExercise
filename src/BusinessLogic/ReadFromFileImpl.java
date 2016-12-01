package BusinessLogic;

import DAO.FetchContent;
import DAO.FetchContentImpl;

/**
 * Created by Olivi on 11-11-2016.
 */
public class ReadFromFileImpl implements ReadFromFile {

    FetchContent fetchContent;

    public ReadFromFileImpl() {
        this.fetchContent = new FetchContentImpl();
    }

    @Override
    public String readFromFile(String fileName) {
        return fetchContent.fetchContent(fileName);
    }
}
