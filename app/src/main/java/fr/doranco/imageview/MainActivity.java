package fr.doranco.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button boutonImage1, boutonImage2, boutonImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        boutonImage1 = findViewById(R.id.btnImage1);
        boutonImage2 = findViewById(R.id.btnImage2);
        boutonImage3 = findViewById(R.id.btnImage3);

        boutonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.image1);
            }
        });

        boutonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.image2);
            }
        });

        boutonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.image3);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        imageView.setImageResource(R.drawable.no_image);
    }
}