package com.example.exoplayer.model;

public class MediaObject {
  private int uId;
  private String title;
  private String mediaUrl;
  private String mediaCoverImgUrl;
  private String userHandle;

  public String getUserHandle() {
    return userHandle;
  }

  public void setUserHandle(String mUserHandle) {
    this.userHandle = mUserHandle;
  }

  public int getId() {
    return uId;
  }

  public void setId(int uId) {
    this.uId = uId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String mTitle) {
    this.title = mTitle;
  }

  public String getUrl() {
    return mediaUrl;
  }

  public void setUrl(String mUrl) {
    this.mediaUrl = mUrl;
  }

  public String getCoverUrl() {
    return mediaCoverImgUrl;
  }

  public void setCoverUrl(String mCoverUrl) {
    this.mediaCoverImgUrl = mCoverUrl;
  }
}
