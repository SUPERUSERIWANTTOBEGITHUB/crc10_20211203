package yvg68.measurer.crc10_20211203

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
private const val TAG = "MyTAG"
class StartFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "StartFragment_onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "StartFragment_onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)

        //val button: View = view.findViewById(R.id.button1)
        Log.d(TAG, "StartFragment_onCreateView")
        return view
        //return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "StartFragment_onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "StartFragment_onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "StartFragment_onResume")
        }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "StartFragment_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "StartFragment_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "StartFragment_onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "StartFragment_onDetach")
    }

// 1 выносим вью в отдельную переменную
// 2 совершаем работу с вью
// 3 возвращаем вью
}