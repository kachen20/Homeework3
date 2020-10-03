package com.example.homeework3;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WordListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);


        LinearLayoutManager lm = new LinearLayoutManager(WordListActivity.this);


        MyAdapter adapter = new MyAdapter();


        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private WordItem[] items = {
            new WordItem(R.drawable.rat1, "My name is Thidaporn", "หนูชื่อนางสาวธิดาพร"),
            new WordItem(R.drawable.rat2, "Bandit", "คนไหนที่ทำดีคนร้ายมันไม่ดีต้องหาทำ"),
            new WordItem(R.drawable.rat3, "Vaenphat", "กอดมันเอาไว้เลย เฮ่อะ เห่ เหล"),
            new WordItem(R.drawable.rat4, "I'm not ladyboy", "ถ้าไม่เชื่อมาดูมิจิ"),
            new WordItem(R.drawable.rat5, "Want a job back", "ไม่ได้แล้วอยากได้เอางานทำไงดีอะแฟนคลับ"),
            new WordItem(R.drawable.rat6, "Pokemon", "โปเกม่อน ขาหมูคิดจะเบี้ยวหนีหนู"),
            new WordItem(R.drawable.rat7, "Tingnaed", "มาดูฉันแล้วจำไว้แล้วมาดูฉันแล้วฉันจะทำให้คุณดู"),
            new WordItem(R.drawable.rat8, "Nicki Rat", "โนโนโนโนโน้ ไม่ต้องมัวเซด"),
            new WordItem(R.drawable.rat9, "ThidaPink", "ไอติม มิจิ มิจิ ไอติม มิจิ!"),
            new WordItem(R.drawable.rat10, "Ratdi B", "เอาเอ๊าเอ่า เอาเอ๊าเอ่า เอาเอ๊าเอ่า")
    };

    MyAdapter() {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_word, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].word);
        holder.wordTextView2.setText(items[position].word2);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView wordTextView;
        TextView wordTextView2;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.word_text_view);
            wordTextView2 = itemView.findViewById(R.id.word_text_view2);
        }
    }

    public class WordItem {
        public final int imageResId;
        public final String word;
        public final String word2;

        public WordItem(int imageResId, String word, String word2) {
            this.imageResId = imageResId;
            this.word = word;
            this.word2 = word2;

        }


    }
}