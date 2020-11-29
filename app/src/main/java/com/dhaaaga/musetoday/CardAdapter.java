package com.dhaaaga.musetoday;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<CardModel> categoryModelList;

    public CardAdapter(List<CardModel> categoryModelList) {


        this.categoryModelList = categoryModelList;

    }

    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);


        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {

        String username = categoryModelList.get(position).getCard_username();
        String link = categoryModelList.get(position).getCard_link();
        holder.setCardUname(username);
        holder.setCardlink(link);

        /*
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (position!=0) {

                    Log.d("Element Tapped", "Movie Poster tapped at :" + position);
                    Intent intent = new Intent(v.getContext(), StreamingNowMainPage.class);
                    intent.putExtra("SICON", categoryModelList.get(position).getCategoryIconLink());
                    intent.putExtra("STEXT", categoryModelList.get(position).getCategory_name());

                    v.getContext().startActivity(intent);
                }

                if(position ==0){

                            v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ZuYoEtEI_go")));
                            Log.i("Video", "Video Playing....");

                }

            }



        });

         */

    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView Username;
        private TextView SongLink;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Username = itemView.findViewById(R.id.username);
            SongLink = itemView.findViewById(R.id.link);


        }

        private void setCardUname(String uname) {

            Username.setText(uname);

        }

        private void setCardlink(String songlink) {

            SongLink.setText(songlink);
        }
    }
}
