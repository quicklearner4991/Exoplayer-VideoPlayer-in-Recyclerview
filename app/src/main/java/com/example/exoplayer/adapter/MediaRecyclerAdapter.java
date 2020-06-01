package com.example.exoplayer.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.exoplayer.R;
import com.example.exoplayer.model.MediaObject;

import java.util.ArrayList;

public class MediaRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

  private ArrayList<MediaObject> mediaObjects;
  private RequestManager requestManager;

  public MediaRecyclerAdapter(ArrayList<MediaObject> mediaObjects,
                              RequestManager requestManager) {
    this.mediaObjects = mediaObjects;
    this.requestManager = requestManager;
  }

  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    return new PlayerViewHolder(
        LayoutInflater.from(viewGroup.getContext())
            .inflate(R.layout.layout_media_list_item, viewGroup, false));
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    ((PlayerViewHolder) viewHolder).onBind(mediaObjects.get(i), requestManager);
  }

  @Override
  public int getItemCount() {
    return mediaObjects.size();
  }
}
