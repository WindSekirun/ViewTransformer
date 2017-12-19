package pyxis.uzuki.live.viewtransformer.demo

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * TextViewChanger
 * Class: BaseActivity
 * Created by Pyxis on 2017-12-19.
 *
 * Description:
 */

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
}
