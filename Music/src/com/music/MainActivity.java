package com.music;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView myEarPiece;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myEarPiece = (TextView) this.findViewById(R.id.text_Music);

		AudioManager audio = (AudioManager) this
				.getSystemService(Context.AUDIO_SERVICE);
		if (audio.isMusicActive()) {
			myEarPiece.setText("Music Detected");

		} else {
			myEarPiece.setText("Music NOT Detected");

		}
		
	}

}
