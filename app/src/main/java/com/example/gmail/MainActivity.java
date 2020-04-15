package com.example.gmail;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String mTiTle[] = {"Truong", "Dung", "DHBKHN", "Bao", "CNTT" };
    String mDescription[] = {"Hi", "Hello", "Thanks", "alo", "blo"};
    int Image[] = {R.id.icon1, R.id.icon1, R.id.icon1, R.id.icon1, R.id.icon1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTiTle, mDescription, Image);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_LONG).show();
                }
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
                }
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "Thanks", Toast.LENGTH_LONG).show();
                }
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "alo", Toast.LENGTH_LONG).show();
                }
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "blo", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.r, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View r = layoutInflater.inflate(R.layout.r, parent, false);
            TextView images = r.findViewById(R.id.icon1);
            TextView myTitle = r.findViewById(R.id.textView1);
            TextView myDescription = r.findViewById(R.id.textView2);

            images.setText(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return r;
        }
    }
}
