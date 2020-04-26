package cat.maikals.footballmanagercompanion.ui.team_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import cat.maikals.footballmanagercompanion.databinding.FragmentTeamListBinding

class TeamListFragment : Fragment() {
    private var _binding: FragmentTeamListBinding? = null
    private val binding
        get() = _binding!!

    private val gridLayoutManager: GridLayoutManager by lazy {
        GridLayoutManager(requireContext(), 2)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTeamListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.teamList.layoutManager = gridLayoutManager
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "TeamListFragment"

        fun newInstance() = TeamListFragment()
    }
}