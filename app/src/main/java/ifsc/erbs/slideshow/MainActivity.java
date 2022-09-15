package ifsc.erbs.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Integer imagens[];
    ImageView imageview;
    Integer cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagens = new Integer[]{R.drawable.cachorro, R.drawable.gardem, R.drawable.happy,
                R.drawable.patinho, R.drawable.porquinho};
        imageview=findViewById(R.id.imageView3);
        imageview.setImageResource(imagens[0]);
    }
    public void avancaFoto(View v){
        int proximaFoto;
        imageview = findViewById(R.id.imageView3);

        if(imagens.length>cont){
            imageview.setImageResource(imagens[cont++]);

        }
        else{
            imageview.setImageResource(imagens[0]);

        }

    }
    public void voltaFoto(View v){
        int proximaFoto;
        imageview = findViewById(R.id.imageView3);
        imageview.setImageResource(imagens[cont--]);

    }

}