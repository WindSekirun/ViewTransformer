package pyxis.uzuki.live.viewtransformer.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pyxis.uzuki.live.richutilskt.utils.selector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnButton.setOnClickListener { selectLanguage { startActivity(if (it) KtButton::class.java else JaButton::class.java) } }
        btnCompoundButton.setOnClickListener { selectLanguage { startActivity(if (it) KtCompoundButton::class.java else JaCompoundButton::class.java) } }
        btnEditText.setOnClickListener { selectLanguage { startActivity(if (it) KtEditText::class.java else JaEditText::class.java) } }
        btnImageView.setOnClickListener { selectLanguage { startActivity(if (it) KtImageView::class.java else JaImageView::class.java) } }
        btnTextView.setOnClickListener { selectLanguage { startActivity(if (it) KtTextView::class.java else JaTextView::class.java) } }
    }

    private fun startActivity(cls: Class<*>) {
        val intent = Intent(this, cls)
        startActivity(intent)
    }

    private fun selectLanguage(callback: (Boolean) -> Unit) {
        val items = arrayListOf("Kotlin", "Java")
        selector(items, { _, _, pos: Int -> callback(pos == 0) })
    }
}
