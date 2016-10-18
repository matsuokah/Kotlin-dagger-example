package jp.matsuokah.kotlin_dagger_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import jp.matsuokah.kotlin_dagger_sample.math.RandomNumberCreator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var randomNumberCreator: RandomNumberCreator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initInjection()
    }

    fun initInjection() {
        val sampleApp = application as? SampleApplication
        sampleApp?.let {
            it.applicationComponent.inject(this)
        }
    }

    fun onClick(v: View) {
        val text = findViewById(R.id.text) as TextView
        text.text = randomNumberCreator?.create().toString()
    }
}
