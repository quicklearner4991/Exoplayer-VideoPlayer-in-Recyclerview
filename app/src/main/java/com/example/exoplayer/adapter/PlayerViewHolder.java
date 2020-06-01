package com.example.exoplayer.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.exoplayer.R;
import com.example.exoplayer.model.MediaObject;

/**
 * Created on : May 24, 2019
 * Author     : AndroidWave
 */
public class PlayerViewHolder extends RecyclerView.ViewHolder {

  /**
   * below view have public modifier because
   * we have access PlayerViewHolder inside the ExoPlayerRecyclerView
   */
  public FrameLayout mediaContainer;
  public ImageView mediaCoverImage, volumeControl;
  public ProgressBar progressBar;
  public RequestManager requestManager;
  private TextView title, userHandle;
  private View parent;

  public PlayerViewHolder(@NonNull View itemView) {
    super(itemView);
    parent = itemView;
    mediaContainer = itemView.findViewById(R.id.mediaContainer);
    mediaCoverImage = itemView.findViewById(R.id.ivMediaCoverImage);
    title = itemView.findViewById(R.id.tvTitle);
    userHandle = itemView.findViewById(R.id.tvUserHandle);
    progressBar = itemView.findViewById(R.id.progressBar);
    volumeControl = itemView.findViewById(R.id.ivVolumeControl);
  }

  void onBind(MediaObject mediaObject, RequestManager requestManager) {
    this.requestManager = requestManager;
    parent.setTag(this);
    title.setText(mediaObject.getTitle());
    userHandle.setText(mediaObject.getUserHandle());
    this.requestManager
        .load(mediaObject.getCoverUrl())
        .into(mediaCoverImage);
  }
}

