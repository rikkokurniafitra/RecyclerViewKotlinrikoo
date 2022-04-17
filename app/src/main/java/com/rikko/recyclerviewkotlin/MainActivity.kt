package com.rikko.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rikko.recyclerview.SuperheroAdapter

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Superhero(
                R.drawable.captainamerica,
                "Captain America",
                "Captain America adalah pahlawan super dari Marvel."
            ),
            Superhero(
                R.drawable.doctorstrange,
                "Doctor Strange",
                "Doctor Strange adalah pesulap terkuat di kosmos."
            ),
            Superhero(
                R.drawable.captainmarvel,
                "Captain Marvel",
                "Captain Marvel adalah Dia dijuluki pahlawan wanita Marvel terbesar, dan sangat mungkin adalah Avenger Marvel yang terkuat."
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics."
            ),
            Superhero(
                R.drawable.blackwidow,
                "Black Widow",
                "Black Widow memiliki kecerdasan yang berbakat"
            ),
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}