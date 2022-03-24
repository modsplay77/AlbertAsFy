package com.example.afinal;
//import com.example.afinal.MusicService.MusicBinder;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController.MediaPlayerControl;

public class play extends MainActivity implements MediaPlayerControl {

   // private MusicService musicSrv;
    private Intent playIntent;
    private boolean musicBound=false;
    private boolean paused=false, playbackPaused=false;
    private MusicController controller;
    private Context mCont=this;
    private Context context;

    private void setController(){
        //set the controller up
        controller = new MusicController(this);
        controller.setMediaPlayer(this);
       // controller.setAnchorView(findViewById(R.id.playlist));
        controller.setEnabled(true);
        controller.setPrevNextListeners(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.febrer22);
                mediaPlayer.start();

            }
           /* @Override
            public void onClick(View v) {
                playNext();
            }*/
        });
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //playPrev();
            }
        };

        /*@Override
        protected void onStart() {
            super.onStart();
            if(playIntent==null){
                playIntent = new Intent(this, MusicService.class);
                bindService(playIntent, musicConnection, Context.BIND_AUTO_CREATE);
                startService(playIntent);
            }
        }*/
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        setController();


    }
/*
    //connect to the service
    private ServiceConnection musicConnection = new ServiceConnection(){

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MusicBinder binder = (MusicBinder)service;
            //get service
            musicSrv = binder.getService();
            //pass list
            musicSrv.setList(songList);
            musicBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            musicBound = false;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            //menu item selected
            switch (item.getItemId()) {
                case R.id.action_shuffle:
                    musicSrv.setShuffle();
                    break;
                case R.id.action_end:
                    stopService(playIntent);
                    musicSrv=null;
                    System.exit(0);
                    break;
            }
            return super.onOptionsItemSelected(item);
        }

        @Override
        protected void onDestroy() {
            stopService(playIntent);
            musicSrv=null;
            super.onDestroy();
        }
        @Override
        public boolean canPause() {
            return true;
        }
        @Override
        public boolean canSeekBackward() {
            return true;
        }

        @Override
        public boolean canSeekForward() {
            return true;
        }
        @Override
        public int getCurrentPosition() {
            if(musicSrv!=null &amp;&amp; musicBound &amp;&amp; musicSrv.isPng())
            return musicSrv.getPosn();
  else return 0;
        }
        @Override
        public int getDuration() {
            if(musicSrv!=null &amp;&amp; musicBound &amp;&amp; musicSrv.isPng())
            return musicSrv.getDur();
  else return 0;
        }

        @Override
        protected void onPause(){
            super.onPause();
            paused=true;
        }

        @Override
        protected void onResume(){
            super.onResume();
            if(paused){
                setController();
                paused=false;
            }
        }
        @Override
        protected void onStop() {
            controller.hide();
            super.onStop();
        }
        @Override
        public void pause() {
            playbackPaused=true;
            musicSrv.pausePlayer();
        }
    };
*/
   /* public void songPicked(View view){
        musicSrv.setSong(Integer.parseInt(view.getTag().toString()));
        musicSrv.playSong();
    }*/

    //play next
   /* private void playNext(){
        musicSrv.playNext();
        if(playbackPaused){
            setController();
            playbackPaused=false;
        }
        controller.show(0);
    }

    //play previous
    private void playPrev(){
        musicSrv.playPrev();
        if(playbackPaused){
            setController();
            playbackPaused=false;
        }
        controller.show(0);
    }

    public void songPicked(View view){
        musicSrv.setSong(Integer.parseInt(view.getTag().toString()));
        musicSrv.playSong();
        if(playbackPaused){
            setController();
            playbackPaused=false;
        }
        controller.show(0);
    }
*/
    @Override
    public void start() {
        
    }

    @Override
    public void pause() {

    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        return 0;
    }

    @Override
    public void seekTo(int i) {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public boolean canPause() {
        return false;
    }

    @Override
    public boolean canSeekBackward() {
        return false;
    }

    @Override
    public boolean canSeekForward() {
        return false;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }


/*
//Funcion PLAY segun web
    @Override
    public void Play() {

        final controles view = (controles) findViewById(R.id.controles);

        //view.toggle();

        //song = songsArray.get(id); //array dónde tengo almacenadas las canciones

        /*int resId = -1;
        switch (song.getSongId())
        {
            case :
                resId=R.raw.ale;
                break;
            case 1:
                resId=R.raw.todoelfondo;
                break;
            // (...) una manera de hacerlo es poner cada audio en un case
        }

        if (resId != -1)
        {
            mp = MediaPlayer.create(Song_detail.this, resId);
        }

/*        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.toggle();
                if (!mp.isPlaying()) { //si no suena al play
                    mp.start();
                } else if (mp.isPlaying()) { //si suena la paro
                    mp.pause();
                }
            }
        });
    }
*/

//si cierras la app, que deje de sonar
    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
        mp.release();
        mp = null;

    }

    @Override
    public void start() {

    }

    @Override
    public void pause() {

    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        return 0;
    }

    @Override
    public void seekTo(int i) {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public boolean canPause() {
        return false;
    }

    @Override
    public boolean canSeekBackward() {
        return false;
    }

    @Override
    public boolean canSeekForward() {
        return false;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }

    private class controles {
        public void toggle() {
        }
    }*/
}



