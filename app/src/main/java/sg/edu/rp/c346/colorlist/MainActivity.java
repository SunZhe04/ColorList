package sg.edu.rp.c346.colorlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //step 4A
    ListView IvBoxArrangement;
    ArrayList<colorItem> boxArrangementList;
    CustomerAdapter caBoxArrangement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 4B
        IvBoxArrangement = (ListView)findViewById(R.id.ListViewcolor);
        boxArrangementList = new ArrayList<colorItem>();

        caBoxArrangement = new CustomerAdapter(this,R.layout.color_row,boxArrangementList);
        IvBoxArrangement.setAdapter(caBoxArrangement);

        //step 4C
        colorItem item1 = new colorItem("blue");//create a color object
        boxArrangementList.add(item1);       // add the object to the list
        colorItem item2= new colorItem("orange");
        boxArrangementList.add(item2);
        colorItem item3 = new colorItem("brown");
        boxArrangementList.add(item3);
    }
}
