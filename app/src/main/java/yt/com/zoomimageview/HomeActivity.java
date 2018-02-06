package yt.com.zoomimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ZoomImageView zoomImageView = (ZoomImageView) findViewById(R.id.zoom_view);
        zoomImageView.setupView();
        zoomImageView.setImageResource(R.drawable.item1);
    }
}
