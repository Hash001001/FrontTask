package com.example.metafrontsample.ui.adapters

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.example.metafrontsample.model.ViewPagerModel
import com.example.metafrontsample.ui.fargments.viewPagerFragments.VpFragment1

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int = 6

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> return VpFragment1(ViewPagerModel("Das Angebot klingt total verrückt. Wo ist hier der Haken?", "Bei GIGAFIBER gibt es keinen Haken. Keine versteckten Kosten. Das Angebot gilt genauso, wie es hier kommuniziert wird."))
            1-> return VpFragment1(ViewPagerModel("Ist das 0€ GIGA FIBER Internet wirklich kostenlos?", "Ja. GIGA FIBER bietet Dir einen kostenlosen Glasfaseranschluss an. Es gibt keine Kosten, die auf Dich zukommen. Das GIGA FIBER Internet bleibt dauerhaft kostenlos für Dich. *"))
            2 -> return VpFragment1(ViewPagerModel("Was muss ich für einen GIGA FIBER Glasfaser-anschluss tun?", "Was Du dafür tun musst, ist deine Daten in der App eintippen, Antrag absenden, abwarten und den Ausbaustatus in der App checken. Alles drum herum erledigen wir."))
            3 -> return VpFragment1(ViewPagerModel("Bleibt das GIGA FIBER Glasfaserinternet kostenlos?", "Ja. Das versprechen wir dir! GIGA FIBER Internet bleibt bei 0€. Dauerhaft. Es gibt keine versteckten Kosten. *"))
            4 -> return VpFragment1(ViewPagerModel("Was passiert mit meinen Daten?", "Wir verwenden deine Daten ausschließlich um den Glasfaserausbau zu Strukturieren und zu Clustern. Das bedeutet, wir sammeln Daten und sortieren Sie, damit eine Region ausgebaut wird. Deine Daten werden."))
            5 -> return VpFragment1(ViewPagerModel("Wie geht 0€ Internet?", "GIGA FIBER trägt zur Digitalisierung Deutschlands bei. Wir übernehmen alle Kosten für den Ausbau, sodass Du kostenlos in Highspeed zu Hause Surfen und Streamen kannst. *  Refinanziert wird das alles über unsere."))
            else -> {
                return VpFragment1(ViewPagerModel("Das Angebot klingt total verrückt. Wo ist hier der Haken?", "Bei GIGAFIBER gibt es keinen Haken. Keine versteckten Kosten. Das Angebot gilt genauso, wie es hier kommuniziert wird."))

            }
        }
    }

}