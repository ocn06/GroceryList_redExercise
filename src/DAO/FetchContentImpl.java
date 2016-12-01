package DAO;

import BusinessLogic.ReadFromFile;
import BusinessLogic.ReadFromFileImpl;

/**
 * Created by Olivi on 11-11-2016.
 */
public class FetchContentImpl implements FetchContent {
    @Override
    public String fetchContent() {

        ReadFromFile readFromFile = new ReadFromFileImpl();
        String s = readFromFile.readFromFile("grocery.txt");

        return s;
    }
}
