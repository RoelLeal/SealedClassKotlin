package com.sealedclass.sealedclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sealedclass.sealedclass.model.GameError
import com.sealedclass.sealedclass.model.GameModel

class MainActivity : AppCompatActivity() {

    private val gameList = listOf(
        GameModel("Mario", "1234", GameError.Internet),
        GameModel("Warzone", "6567", GameError.Internet),
        GameModel("Fortnite", "5156", GameError.Ejecuccion),
        GameModel("Rocket league", "5166", GameError.Peso),
        GameModel("God of war", "3312", GameError.Archivo)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameList.forEach { i ->
            when(i.error) {
                GameError.Peso -> downloadAgain()
                GameError.Internet -> badRequest()
                GameError.Ejecuccion -> badRequest()
                GameError.Peso -> badRequest()
                GameError.Archivo -> badRequest()
            }
        }

    }

    private fun badRequest() {
        Toast.makeText(this, "Refresh the game", Toast.LENGTH_LONG).show()
    }

    private fun downloadAgain() {
        Toast.makeText(this, "Download again", Toast.LENGTH_LONG).show()
    }
}