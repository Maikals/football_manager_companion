package cat.maikals.footballmanagercompanion.ui.main_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cat.maikals.footballmanagercompanion.R
import cat.maikals.footballmanagercompanion.databinding.FragmentMainBinding
import cat.maikals.footballmanagercompanion.extensions.replace
import cat.maikals.footballmanagercompanion.ui.team_list.TeamListFragment

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeFragment()
        setOnClickListeners()
    }

    private fun initializeFragment() = openTeamList()

    private fun setOnClickListeners() =
        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_team_list -> openTeamList()
            }
            true
        }

    private fun openTeamList() =
        parentFragmentManager.replace(
            R.id.fragmentContainer,
            TeamListFragment.newInstance(),
            TeamListFragment.TAG
        )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "MainFragment"

        @JvmStatic
        fun newInstance() =
            MainFragment()
    }
}