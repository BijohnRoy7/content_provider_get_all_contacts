package invenz.roy.contentprovidergetcontacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter{

    private Context context;
    private List<Contact> contactList;

    public CustomAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_contact, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.idName);
        TextView tvNum = convertView.findViewById(R.id.idNumber);

        Contact contact = contactList.get(position);
        tvName.setText(contact.getName());
        tvNum.setText(contact.getNumber());

        return convertView;
    }
}
