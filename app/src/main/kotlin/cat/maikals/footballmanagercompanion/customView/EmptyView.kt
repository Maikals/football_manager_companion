package cat.maikals.footballmanagercompanion.customView

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import cat.maikals.footballmanagercompanion.R
import cat.maikals.footballmanagercompanion.databinding.EmptyViewBinding

class EmptyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val binding: EmptyViewBinding by lazy {
        EmptyViewBinding.inflate(LayoutInflater.from(context), this)
    }

    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.EmptyView, 0, 0)
            .apply {
                try {
                    val text = getText(R.styleable.EmptyView_text)
                    setEmptyText(text.toString())
                    val drawable = getDrawable(R.styleable.EmptyView_src)
                    setEmptyImage(drawable!!)
                }
                finally {
                    recycle()
                }
            }
    }

    fun setEmptyImage(@DrawableRes drawableId: Int) =
        try {
            setEmptyImage(ContextCompat.getDrawable(context, drawableId)!!)
        } catch (e: Exception) {
            throw e
        }

    private fun setEmptyImage(drawable: Drawable) {
        binding.emptyViewImage.setImageDrawable(drawable)
    }

    fun setEmptyText(@StringRes textId: Int) =
        setEmptyText(context.getString(textId))

    fun setEmptyText(text: String) {
        binding.emptyViewText.text = text
    }
}