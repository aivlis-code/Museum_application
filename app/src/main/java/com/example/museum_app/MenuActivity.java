package com.example.museum_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity {
    //j'ai décidé de créer une instance d'activité pour pouvoir ensuite réutiliser ce code dans autres classes

    public static void setupMenuButtons(Activity activity) {
        //on récupere les boutons
        ImageButton btnHistoire = activity.findViewById(R.id.histoire);
        ImageButton btnOeuvres = activity.findViewById(R.id.oeuvres);
        ImageButton btnHome = activity.findViewById(R.id.home);
        ImageButton btnLocation = activity.findViewById(R.id.imageLocation);
        ImageButton btnInfo = activity.findViewById(R.id.info);

        //avec la méthode OnClickListener on definit les écuteurs d'événements pour les boutons
        btnHistoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //avec intent on lui determine l'activité à faire
                Intent intent = new Intent(activity, HistoireMuseeActivity.class);
                activity.startActivity(intent);
            }
        });

        btnOeuvres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, CarrouselActivity.class);
                activity.startActivity(intent);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, MenuGeneral.class);
                activity.startActivity(intent);
            }
        });

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, MapActivity.class);
                activity.startActivity(intent);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, InfosActivity.class);
                activity.startActivity(intent);
            }
        });
    }
}
