package yvg68.measurer.crc10_20211203
//
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MyTAG"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MyActivity_onCreate")

        // connecting fragment by activity
        val startFragment = StartFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, startFragment)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"MyActivity_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"MyActivity_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"MyActivity_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"MyActivity_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"MyActivity_onDestroy")
    }
}