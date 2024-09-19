package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieList = ArrayList<MovieModel>()

        movieList.add(MovieModel(R.drawable.prom_seven,"promoOne"))
        movieList.add(MovieModel(R.drawable.prom_eight,"promoOne"))
        movieList.add(MovieModel(R.drawable.promo_three,"promoOne"))
        movieList.add(MovieModel(R.drawable.promo_four,"promoOne"))
        movieList.add(MovieModel(R.drawable.promo_five,"promoOne"))
        movieList.add(MovieModel(R.drawable.promo_six,"promoOne"))
        movieList.add(MovieModel(R.drawable.promo_2,"promoOne"))
        movieList.add(MovieModel(R.drawable.prom0_one,"promoOne"))
        movieList.add(MovieModel(R.drawable.prom_nine,"promoOne"))


        val adapter = MovieAdapter(movieList)
        binding.apply {
            corouselrecyclerview.adapter = adapter
            corouselrecyclerview.set3DItem(true)
            corouselrecyclerview.setAlpha(true)
            corouselrecyclerview.setInfinite(true)
        }

    }
}