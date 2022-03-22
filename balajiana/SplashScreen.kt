package android.app.balajiana

import android.app.anainfoapp.MainActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashScreen : AppCompatActivity() {
   private val splashScreentimeout: Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
          startActivity(Intent(this, MainActivity::class.java))
        }, splashScreentimeout)


    }
}