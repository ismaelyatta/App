package fr.isen.francoisyatta.projectv2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*


class MyAdapter (val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: Model) {

            itemView.titleTv.text = model.title
            itemView.descriptionTv.text = model.des
            itemView.imageIv.setImageResource(model.image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            if (position == 0) {
                Toast.makeText(
                    context,
                    "Click sur Ma consommation",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 1) {
                Toast.makeText(
                    context,
                    "Click sur Bilan carbone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 2) {
                Toast.makeText(
                    context,
                    "Click sur Détection d'anomalies",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 3) {
                Toast.makeText(
                    context,
                    "Click sur Maintenance prédictive",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 4) {
                Toast.makeText(
                    context,
                    "Click sur Aide",
                    Toast.LENGTH_LONG
                ).show()
            }


            //avoir position de l'item selectionné
            val model = arrayList.get(position)

            //avoir le titre de l'item selectionné
            var gTitle : String = model.title

            //creation de l'intent
            val intent1 = Intent(context, maconso::class.java)
            val intent2 = Intent(context, bilancarbone::class.java)
            val intent3 = Intent(context, anomalies::class.java)
            val intent4 = Intent(context, maintenance::class.java)
            val intent5 = Intent(context, aide::class.java)

            //prendre tous ces élements avec putExtra intent
            intent1.putExtra("iTitle" , gTitle)
            intent2.putExtra("iTitle" , gTitle)
            intent3.putExtra("iTitle" , gTitle)
            intent4.putExtra("iTitle" , gTitle)
            intent5.putExtra("iTitle" , gTitle)

            //start les activités
            context.startActivity(intent1)
            context.startActivity(intent2)
            context.startActivity(intent3)
            context.startActivity(intent4)
            context.startActivity(intent5)

        }
    }
}