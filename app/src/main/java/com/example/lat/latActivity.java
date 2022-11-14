package com.example.lat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import io.grpc.InternalChannelz;

public class latActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat);

        final LinearLayout pcmLayout = findViewById(R.id.pcmLayout);
        final LinearLayout pcbLayout = findViewById(R.id.pcbLayout);
        final LinearLayout commerceMathLayout = findViewById(R.id.commerceMathLayout);
        final LinearLayout commerceLayout = findViewById(R.id.commerceLayout);
        final LinearLayout arts = findViewById(R.id.artsLayout);

        final Button startBtn  = findViewById(R.id.startQuizBtn);


        pcmLayout.setOnClickListener(v -> {

            selectedTopicName = "pcm";

            pcmLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);

            pcbLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceMathLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceLayout.setBackgroundResource(R.drawable.round_back_white10);
            arts.setBackgroundResource(R.drawable.round_back_white10);

        });

        pcbLayout.setOnClickListener(v -> {

            selectedTopicName = "pcb";

            pcbLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);

            pcmLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceMathLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceLayout.setBackgroundResource(R.drawable.round_back_white10);
            arts.setBackgroundResource(R.drawable.round_back_white10);

        });

        commerceMathLayout.setOnClickListener(v -> {

            selectedTopicName = "commerceMath";

            commerceMathLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);

            pcbLayout.setBackgroundResource(R.drawable.round_back_white10);
            pcmLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceLayout.setBackgroundResource(R.drawable.round_back_white10);
            arts.setBackgroundResource(R.drawable.round_back_white10);

        });

        commerceLayout.setOnClickListener(v -> {

            selectedTopicName = "commerce";

            commerceLayout.setBackgroundResource(R.drawable.round_back_white_stroke10);

            pcbLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceMathLayout.setBackgroundResource(R.drawable.round_back_white10);
            pcmLayout.setBackgroundResource(R.drawable.round_back_white10);
            arts.setBackgroundResource(R.drawable.round_back_white10);

        });

        arts.setOnClickListener(v -> {

            selectedTopicName = "arts";

            arts.setBackgroundResource(R.drawable.round_back_white_stroke10);

            pcbLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceMathLayout.setBackgroundResource(R.drawable.round_back_white10);
            commerceLayout.setBackgroundResource(R.drawable.round_back_white10);
            pcmLayout.setBackgroundResource(R.drawable.round_back_white10);

        });

        startBtn.setOnClickListener(v -> {
            if (selectedTopicName.isEmpty()){
                Toast.makeText(latActivity.this, "PLEASE CHOOSE YOUR CATEGORY", Toast.LENGTH_SHORT).show();
            }
            else {
                final Intent intent = new Intent(latActivity.this,QuiActivity.class);
                intent.putExtra("selectedTopic", selectedTopicName);
                startActivity(intent);

                finish();
            }
        });


    }
}
