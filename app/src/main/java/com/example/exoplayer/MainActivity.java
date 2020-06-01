package com.example.exoplayer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.exoplayer.adapter.MediaRecyclerAdapter;
import com.example.exoplayer.model.MediaObject;
import com.example.exoplayer.utils.ExoPlayerRecyclerView;

import java.util.ArrayList;

import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {

    ExoPlayerRecyclerView mRecyclerView;

    private ArrayList<MediaObject> mediaObjectList = new ArrayList<>();
    private MediaRecyclerAdapter mAdapter;
    private boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        // Prepare demo content
        prepareVideoList();

        //set data object
        mRecyclerView.setMediaObjects(mediaObjectList);
        mAdapter = new MediaRecyclerAdapter(mediaObjectList, initGlide());

        //Set Adapter
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.smoothScrollToPosition(1);
      //mRecyclerView.smoothScrollToPosition(1);
 /*   if (firstTime) {
      new Handler(Looper.getMainLooper()).post(new Runnable() {
        @Override
        public void run() {
          mRecyclerView.playVideo(false);
        }
      });
      firstTime = false;
    }*/
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.exoPlayerRecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private RequestManager initGlide() {
        RequestOptions options = new RequestOptions();

        return Glide.with(this)
                .setDefaultRequestOptions(options);
    }

    @Override
    protected void onDestroy() {
        if (mRecyclerView != null) {
            mRecyclerView.releasePlayer();
        }
        super.onDestroy();
    }

    private void prepareVideoList() {
        MediaObject mediaObject = new MediaObject();
        mediaObject.setId(1);
        mediaObject.setUserHandle("User 1");
        mediaObject.setTitle(
                "Item 1");
        mediaObject.setCoverUrl(
                "https://www.muscleandfitness.com/wp-content/uploads/2019/04/7-Demonized-BodyBuilding-Food-Gallery.jpg?w=940&h=529&crop=1");
        mediaObject.setUrl("https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.mp4");

        MediaObject mediaObject2 = new MediaObject();
        mediaObject2.setId(2);
        mediaObject2.setUserHandle("user 2");
        mediaObject2.setTitle(
                "Item 2");
        mediaObject2.setCoverUrl(
                "https://www.muscleandfitness.com/wp-content/uploads/2019/04/7-Demonized-BodyBuilding-Food-Gallery.jpg?w=940&h=529&crop=1");
        mediaObject2.setUrl("https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.mp4");

        MediaObject mediaObject3 = new MediaObject();
        mediaObject3.setId(3);
        mediaObject3.setUserHandle("User 3");
        mediaObject3.setTitle("Item 3");
        mediaObject3.setCoverUrl(
                "https://www.muscleandfitness.com/wp-content/uploads/2019/04/7-Demonized-BodyBuilding-Food-Gallery.jpg?w=940&h=529&crop=1");
        mediaObject3.setUrl("https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.mp4");

        MediaObject mediaObject4 = new MediaObject();
        mediaObject4.setId(4);
        mediaObject4.setUserHandle("User 4");
        mediaObject4.setTitle("Item 4");
        mediaObject4.setCoverUrl(
                "https://www.muscleandfitness.com/wp-content/uploads/2019/04/7-Demonized-BodyBuilding-Food-Gallery.jpg?w=940&h=529&crop=1");
        mediaObject4.setUrl("https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.mp4");

        MediaObject mediaObject5 = new MediaObject();
        mediaObject5.setId(5);
        mediaObject5.setUserHandle("User 5");
        mediaObject5.setTitle("Item 5");
        mediaObject5.setCoverUrl(
                "https://www.muscleandfitness.com/wp-content/uploads/2019/04/7-Demonized-BodyBuilding-Food-Gallery.jpg?w=940&h=529&crop=1");
        mediaObject5.setUrl("https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/Sending+Data+to+a+New+Activity+with+Intent+Extras.mp4");

        mediaObjectList.add(mediaObject);
        mediaObjectList.add(mediaObject2);
        mediaObjectList.add(mediaObject3);
        mediaObjectList.add(mediaObject4);
        mediaObjectList.add(mediaObject5);
    }
}
