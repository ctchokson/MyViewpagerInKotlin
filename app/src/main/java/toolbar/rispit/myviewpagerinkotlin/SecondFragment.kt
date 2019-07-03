package toolbar.rispit.myviewpagerinkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.list_layout.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.list_layout, container, false)
        val listView = view.findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter<String>(context,android.R.layout.simple_list_item_1, listOf<String>("WINDOW","APPLE","ANDROID"))
        listView.adapter = adapter
        return view

    }


}
