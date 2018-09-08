package com.example.tarsbir.ecomtutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<TutorialCustom> {
    private Context mContext;
    private List<TutorialCustom> tutorialCustomList = new ArrayList<>();

    public MyAdapter(@NonNull Context context, ArrayList<TutorialCustom> list) {
        super(context, 0 , list);
        mContext = context;
        tutorialCustomList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.row,parent,false);

        TutorialCustom currentTutorialCustom = tutorialCustomList.get(position);

        TextView name = (TextView) listItem.findViewById(R.id.text);
        name.setText(currentTutorialCustom.getText());
        return listItem;
    }
}
