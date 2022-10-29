package me.kavin.piped.utils.obj;

public class PlaylistItem extends ContentItem {

    public final String type = "playlist";

    public String name;
    public String thumbnail;
    public String uploaderName;
    public String playlistType;

    public long videos;


    public PlaylistItem(String url, String name, String thumbnail, String uploaderName, String playlistType, long videos) {
        super(url);
        this.name = name;
        this.thumbnail = thumbnail;
        this.uploaderName = uploaderName;
        this.playlistType = playlistType;
        this.videos = videos;
    }
}