package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView maListViewPerso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperation de la listView cree dans le fichier main.xml

        maListViewPerso = findViewById(R.id.listViewPerso);

        //creation de la ArrayList qui contiendra un objet de type HashMap et qui nous permettra de remplir la ListView

        ArrayList<HashMap<String,String>> listItem = new ArrayList<HashMap<String,String>>();

        //on declare un objet map de type HashMap qui contindra les informations pour un item

        HashMap<String,String> map;

        map = new HashMap<String, String>();

        map.put("titre", "Pokemon Unite");

        map.put("description", "Affronte des créatures extraordinaires, deviens un maître Pokémon et explore un monde vaste et mystérieux rempli d'aventures inoubliables !");

        map.put("img" ,String.valueOf(R.drawable.logo1));



        listItem.add(map);


        map = new HashMap<String, String>();

        map.put("titre", "Raft");

        map.put("description", "Survivez sur un radeau dérivant, explorez l'océan et échappez à la solitude en recherchant la terre ferme.");

        map.put("img" ,String.valueOf(R.drawable.logo10));



        listItem.add(map);



        map = new HashMap<String, String>();

        map.put("titre", "Brawl Stars");

        map.put("description", "Affrontez des adversaires dans des arènes explosives, formez une équipe avec vos amis et devenez le champion ultime dans ce jeu de combat multijoueur palpitant !");

        map.put("img" ,String.valueOf(R.drawable.logo2));



        listItem.add(map);


        map = new HashMap<String, String>();

        map.put("titre", "Chicken Crossroad");

        map.put("description", "Aidez une poule courageuse à traverser une route périlleuse, évitez les dangers et atteignez la sécurité de l'autre côté dans ce jeu d'arcade délicieusement chaotique !");

        map.put("img" ,String.valueOf(R.drawable.logo3));



        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("titre", "Mickey Snap");

        map.put("description", "Capturez les moments magiques avec Mickey et ses amis dans ce jeu de photographie passionnant, explorez des mondes enchantés et dévoilez des souvenirs inoubliables !");

        map.put("img" ,String.valueOf(R.drawable.logo4));


        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("titre", "One punch Word");

        map.put("description", "Devenez le plus puissant des héros, terrassez les ennemis d'un seul coup et protégez la ville contre les monstres dans ce jeu d'action épique basé sur le célèbre manga et anime !");

        map.put("img" ,String.valueOf(R.drawable.logo5));



        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("titre", "Xbox Arcade");

        map.put("description", "Découvrez une collection de jeux rétro et modernes, jouez seul ou avec des amis, et revivez l'excitation des arcades dans le confort de votre salon avec Xbox Arcade !");

        map.put("img" ,String.valueOf(R.drawable.logo6));



        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("titre", "Minecraft");

        map.put("description", "Explorez un monde infini de blocs, créez vos propres aventures et bâtissez tout ce que vous pouvez imaginer dans ce jeu sandbox emblématique où votre seule limite est votre créativité !");

        map.put("img" ,String.valueOf(R.drawable.logo7));



        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("titre", "Akinator");

        map.put("description", "Devinez le personnage auquel je pense, en posant des questions astucieuses, et défiez l'intelligence artificielle d'Akinator dans ce jeu de devinette captivant !");

        map.put("img" ,String.valueOf(R.drawable.logo8));



        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("titre", "Doom mobile");

        map.put("description", "Plongez dans l'action frénétique, affrontez des hordes de démons et sauvez l'humanité des enfers dans ce jeu de tir mobile inspiré du légendaire Doom !");

        map.put("img" ,String.valueOf(R.drawable.logo9));



    }
}