package cat.maikals.footballmanagercompanion.ui.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cat.maikals.footballmanagercompanion.ui.container_screen.ContainerActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, ContainerActivity::class.java))
    }
}
