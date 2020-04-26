package cat.maikals.footballmanagercompanion.ui.container_screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cat.maikals.footballmanagercompanion.extensions.replace
import cat.maikals.footballmanagercompanion.ui.main_screen.MainFragment

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFragment()
    }

    private fun initFragment() {
        val fragmentContainerId = android.R.id.content
        val fragment = MainFragment.newInstance()
        supportFragmentManager.replace(fragmentContainerId, fragment, MainFragment.TAG)
    }
}