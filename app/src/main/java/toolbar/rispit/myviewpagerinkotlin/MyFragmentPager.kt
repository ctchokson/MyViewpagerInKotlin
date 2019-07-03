package toolbar.rispit.myviewpagerinkotlin

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import toolbar.rispit.myviewpagerinkotlin.SecondFragment
import toolbar.rispit.myviewpagerinkotlin.ThirdFragment
import toolbar.rispit.myviewpagerinkotlin.firstFragment
import java.lang.IllegalArgumentException

class MyFragmentPager(frgManager: FragmentManager): FragmentPagerAdapter(frgManager) {
    override fun getItem(position: Int)=when(position)
    {
        0 -> firstFragment()
        1 -> SecondFragment()
        2 -> ThirdFragment()
        else -> throw IllegalArgumentException("Wrong Argument")
    }

    override fun getCount() = 3

    override fun getPageTitle(position: Int)=when(position)
    {
        0 -> "RISPIT NAMES"
        1 -> "OS LISTS"
        2 -> "RISPIT FRAGMENT"
        else -> throw IllegalArgumentException("Wrong Argument")
    }
}