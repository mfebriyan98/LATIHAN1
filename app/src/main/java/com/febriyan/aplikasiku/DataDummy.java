package com.febriyan.aplikasiku;

import java.util.List;
import java.util.ArrayList;

public class DataDummy {

    private List<String> listDataDummy = new ArrayList<>();

    public DataDummy ()
    {
        listDataDummy.add("Data Satu");
        listDataDummy.add("Data Dua");
        listDataDummy.add("Data Tiga");
        listDataDummy.add("Data Empat");
        listDataDummy.add("Data Lima");
        listDataDummy.add("Data Enam");
        listDataDummy.add("Data Tujuh");
        listDataDummy.add("Data Delapan");
        listDataDummy.add("Data Sembilan");
        listDataDummy.add("Data Sepuluh");
    }

    public List<String> getListDataDummy()
    {
        return listDataDummy;
    }
}
