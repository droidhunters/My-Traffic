package com.droidhunters.master.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin_Local on 5/6/2559.
 */
public class MyAdapter extends BaseAdapter{
    //Mainclass

    //Explicit
    private Context context;  // ตัวแปร ctrl+space เพื่อโค้ดอัตโนมัติ
    private int[] ints; // name+ctrl space
    private String[] nameStrings, detailStrings; // name+ctrl space

    //alt+insert เพื่อสร้าง constractor โดยสร้างให้ทั้งหมด
    public MyAdapter(Context context,
                     int[] ints,
                     String[] nameStrings,
                     String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.nameStrings = nameStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return ints.length; //ให้นับเอง
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        //For Image
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        imageView.setImageResource(ints[i]);
        //

        //For TextView
        TextView nameTextView = (TextView) view1.findViewById(R.id.textView2); //alt+enter
        nameTextView.setText(nameStrings[i]);

        //For Detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3); //
        detailTextView.setText(detailStrings[i]);







        //

        return view1;
    }
}
