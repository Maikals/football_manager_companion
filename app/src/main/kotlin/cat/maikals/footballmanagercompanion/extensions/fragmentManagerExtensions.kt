package cat.maikals.footballmanagercompanion.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.replace(
    @IdRes idContainer: Int = android.R.id.content,
    fragment: Fragment,
    tag: String = fragment::class.java.name
) {
    beginTransaction().replace(idContainer, fragment, tag).commitAllowingStateLoss()
}