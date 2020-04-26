package cat.maikals.footballmanagercompanion.main_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cat.maikals.footballmanagercompanion.R
import cat.maikals.footballmanagercompanion.databinding.ActivityMainBinding
import cat.maikals.footballmanagercompanion.extensions.replace
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initFragment()
    }

    private fun initFragment() {
        val fragmentContainerId = R.id.nav_host_fragment
        val fragment = MainFragment.newInstance()
        supportFragmentManager.replace(fragmentContainerId, fragment, MainFragment.TAG)
    }
}