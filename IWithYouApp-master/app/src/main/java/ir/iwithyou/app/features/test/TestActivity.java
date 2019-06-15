package ir.iwithyou.app.features.test;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ir.iwithyou.app.R;

public class TestActivity extends AppCompatActivity {

ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        img=findViewById(R.id.img);

        Intent intent =getIntent();
        Uri imageUri = intent.getData();
        Picasso.get().load(imageUri).into(img);




    }
}
