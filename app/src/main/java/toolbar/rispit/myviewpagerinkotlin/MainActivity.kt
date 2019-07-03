package toolbar.rispit.myviewpagerinkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    val nameList= ArrayList<String>()
    val myList= listOf("Rispit","Chocolate","Tchokson","Trocadero")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title="Rispit Toolbar"
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setLogo(R.drawable.tab_new_r)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        val frgmentAdapter = MyFragmentPager(supportFragmentManager)
        viewPager.adapter = frgmentAdapter
        tabLayout.setupWithViewPager(viewPager)
        Toast.makeText(this,"my slice: ${myList.slice(0..2)}",Toast.LENGTH_LONG).show()
    }

   override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

   override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> Toast.makeText(this,"Home Clicked",Toast.LENGTH_LONG).show()
            // action with ID action_refresh was selected
            R.id.action_refresh -> Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT)
                    .show()
            // action with ID action_settings was selected
            R.id.action_settings -> Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                    .show()
            else -> {
                Toast.makeText(this,"Id not recognized",Toast.LENGTH_LONG).show()
            }
        }

        return true
    }
}
