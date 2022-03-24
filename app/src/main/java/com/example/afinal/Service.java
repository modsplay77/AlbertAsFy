package com.example.afinal;
/*
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentUris;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class MusicService<quot> extends Service implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener,
        MediaPlayer.OnCompletionListener{

    //shufle
    private boolean shuffle=false;
    private Random rand;
    //cancion id
    private String songTitle=&quot;&quot;;
    private static final int NOTIFY_ID=1
    //media player
    private MediaPlayer player;
    //song list
    private ArrayList<Song> songs;
    //current position
    private int songPosn;
    private final IBinder musicBind = new MusicBinder();
    private Object Playing;

    public void onCreate(){
        //create the service
        super.onCreate();
//initialize position
        songPosn=0;
//create player
        player = new MediaPlayer();
        player.setOnPreparedListener(this);
        player.setOnCompletionListener(this);
        player.setOnErrorListener(this);
        initMusicPlayer();

        //randown
        rand=new Random();
    }
    /*@Override
    public boolean isPlaying() {
        if(musicSrv!=null &amp;&amp; musicBound)
        return musicSrv.isPng();
        return false;
    }
    @Override
    public void pause() {
        musicSrv.pausePlayer();
    }

    @Override
    public void seekTo(int pos) {
        musicSrv.seek(pos);
    }

    @Override
    public void start() {
        musicSrv.go();
    }


    @Override
    public void onPrepared(MediaPlayer mp) {
        //start playback
        mp.start();
        Intent notIntent = new Intent(this, MainActivity.class);
        notIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendInt = PendingIntent.getActivity(this, 0,
                notIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder builder = new Notification.Builder(this);

        builder.setContentIntent(pendInt)
                .setSmallIcon(R.drawable.play)
                .setTicker(songTitle)
                .setOngoing(true)
                .setContentTitle(&quot;Playing&quot;)
   .setContentText(songTitle);
        Notification not = builder.build();

        startForeground(NOTIFY_ID, not);
    }

    private void setContentText(String songTitle) {
    }

    @Override
    public boolean onUnbind(Intent intent){
        player.stop();
        player.release();
        return false;
    }
    //get song
    Song playSong = songs.get(songPosn);
    //get id
    long currSong = playSong.getID();
    //set uri
    Uri trackUri = ContentUris.withAppendedId(
            android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
            currSong);
    try{
        player.setDataSource(getApplicationContext(), trackUri);
    }
catch(Exception e){
        Log.e("MUSIC SERVICE", "Error setting data source", e);
    }
    player.prepareAsync();

    public void playSong(){
        player.reset();
        (Song playSong = songs.get(songPosn);
        songTitle=playSong.getTitle();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return musicBind;
    }
    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {
        mp.reset();
        return false;
    }
    @Override
    public void onCompletion(MediaPlayer mp) {
        if(player.getCurrentPosition()&gt;0){
            mp.reset();
            playNext();
        }
    }

}
public void initMusicPlayer(){
    //set player properties
    player.setWakeMode(getApplicationContext(),
            PowerManager.PARTIAL_WAKE_LOCK);
    player.setAudioStreamType(AudioManager.STREAM_MUSIC);
}

    public void setList(ArrayList<Song> theSongs){
        songs=theSongs;
    }
    public void setSong(int songIndex){
        songPosn=songIndex;
    }

    public int getPosn(){
        return player.getCurrentPosition();
    }

    public int getDur(){
        return player.getDuration();
    }

    public boolean isPng(){
        return player.isPlaying();
    }

    public void pausePlayer(){
        player.pause();
    }

    public void seek(int posn){
        player.seekTo(posn);
    }

    public void go(){
        player.start();
    }
    public void playPrev(){
        songPosn--;
        if(songPosn&lt;0) songPosn=songs.size()-1;
        playSong();
    }

    //skip to next
    public void playNext(){
        if(shuffle){
            int newSong = songPosn;
            while(newSong==songPosn){
                newSong=rand.nextInt(songs.size());
            }
            songPosn=newSong;
        }
        else{
            songPosn++;
            if(songPosn&gt;=songs.size()) songPosn=0;
        }
        playSong();
    }

    //metodo randowq
    public void setShuffle(){
        if(shuffle) shuffle=false;
        else shuffle=true;
    }



public class MusicBinder extends Binder {
    MusicService getService() {
        return MusicService.this;
    }
}
*/