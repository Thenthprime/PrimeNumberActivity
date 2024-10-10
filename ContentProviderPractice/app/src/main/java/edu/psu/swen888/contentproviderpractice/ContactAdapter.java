package edu.psu.swen888.contentproviderpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Contact>{
    private Context context;
    private Button detailsButton;



    public ListViewAdapter(Context context, ArrayList<Contact> contacts){
        super(context, 0, contacts);
        this.context = context;
    }
    @NonNull
    @Override

    //adatpter's getView method to populate the data from the list into the listview position
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact_item, parent, false);
        }

        Contact contact = getItem(position);
        TextView textViewTitle = convertView.findViewById(R.id.textview_contact_name);
        TextView textViewType = convertView.findViewById(R.id.textview_contact_phone);

        String eventTitle = "Contact: " + String.valueOf(contact.getName());
        String eventType = "Type: " + String.valueOf(contact.getPhone());



        textViewTitle.setText(eventTitle);
        textViewType.setText(eventType);


        return convertView;
    }
}