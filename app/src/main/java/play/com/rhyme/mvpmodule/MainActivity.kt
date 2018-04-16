package play.com.rhyme.mvpmodule

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import play.com.rhyme.mvpmodule.baseIml.BaseImlActivty
import play.com.rhyme.mvpmodule.normal.NormalActivity
import play.com.rhyme.mvpmodule.simple.SimpleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv2.setOnClickListener {
            startActivity(Intent(this,SimpleActivity::class.java))
        }
        tv3.setOnClickListener {
            startActivity(Intent(this,NormalActivity::class.java))
        }
        tv5.setOnClickListener {
            startActivity(Intent(this,BaseImlActivty::class.java))
        }
    }
}
