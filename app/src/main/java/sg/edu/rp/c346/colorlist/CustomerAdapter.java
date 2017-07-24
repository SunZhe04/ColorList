package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15039608 on 24/7/2017.
 */

public class CustomerAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<colorItem> boxList;

    public CustomerAdapter(Context context, int resource, ArrayList<colorItem> objects){ //change 3rd argument only
        super(context, resource,objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);


        ImageView ivBox1 = (ImageView) rowView.findViewById(R.id.imageViewBox1);
        ImageView ivBox2 =(ImageView) rowView.findViewById(R.id.imageViewBox2);

        colorItem currentItem = boxList.get(position);//standard code

        if (currentItem.getColour().equals("blue")){
            ivBox1.setImageResource(R.drawable.blue_box);
            ivBox2.setImageResource(R.drawable.blue_box);
        }else if (currentItem.getColour().equals("orange")){
            ivBox1.setImageResource(R.drawable.orange_box);
            ivBox2.setImageResource(R.drawable.orange_box);
        }else {
            ivBox1.setImageResource(R.drawable.brown_box);
            ivBox2.setImageResource(R.drawable.brown_box);
        }
        return rowView;

    }

}
