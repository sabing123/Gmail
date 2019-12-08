package com.sabin.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.awt.font.TextAttribute;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class mailAdapter extends RecyclerView.Adapter<mailAdapter.MailViewHolder> {

    Context mcontext;
    List<mail> mailList;

    public mailAdapter(Context mcontext, List<mail> mailList) {
        this.mcontext = mcontext;
        this.mailList = mailList;
    }


    @NonNull
    @Override
    public MailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_mail,parent,false);
        return new MailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MailViewHolder holder, int position) {
        mail mail = mailList.get(position);
        holder.imgprofile.setImageResource(mail.getImageId());
        holder.name.setText(mail.getName());
        holder.title.setText(mail.getTitle());
        holder.date.setText(mail.getDate());
        holder.message.setText(mail.getMessage());

    }

    @Override
    public int getItemCount() {
        return mailList.size();
    }

    public class MailViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgprofile;
        TextView name, title, date, message;

        public MailViewHolder(@NonNull View itemView) {
            super(itemView);

            imgprofile = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);
            message = itemView.findViewById(R.id.message);


        }
    }

}
