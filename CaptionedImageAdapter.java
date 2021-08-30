package com.example.a726version;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
class CaptionedImageAdapter extends RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder> {

private String[] captions;
private int[] imageIds;
//private int[] videoIds;
    private Listener listener;

    interface Listener{
        void onClick(int position);
    }
 public static class ViewHolder extends RecyclerView.ViewHolder{
     private CardView cardview;
     public ViewHolder(CardView v){
         super(v);
         cardview=v;

     }

 }

 public CaptionedImageAdapter(String[] captions, int[] imageIds){
     this.captions=captions;
     this.imageIds=imageIds;
    // this.videoIds=videoIds;
 }
     public int getItemCount(){
     return captions.length;
     }

     public void setListener(Listener listener){
        this.listener=listener;
     }

     public CaptionedImageAdapter.ViewHolder onCreateViewHolder(
             ViewGroup parent,int viewTpye){
     CardView cv=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_introdution_iandv,parent,false);
     return new ViewHolder(cv);
     }

     public void CaptionedImageAdapter(ViewHolder holder, int position) {

     }

     public void onBindViewHolder(ViewHolder holder,int position){
     CardView cardview=holder.cardview;
         ImageView imageView=(ImageView) cardview.findViewById(R.id.info_image);
         Drawable drawable = ContextCompat.getDrawable(cardview.getContext(),imageIds[position]);
         imageView.setImageDrawable(drawable);
         imageView.setContentDescription(captions[position]);
         TextView textView=(TextView) cardview.findViewById(R.id.info_text);
         textView.setText(captions[position]);
         cardview.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 if(listener!=null)
                 {
                     listener.onClick(position);
                 }
             }
         });
        // VideoView videoView=(VideoView) cardview.findViewById(R.id.info_video);
        // videoView.

     }

 }
