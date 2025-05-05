import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilapp.GundemMaddesi
import com.example.mobilapp.R

class GundemAdapter(private val gundemListesi: ArrayList<GundemMaddesi>) :
    RecyclerView.Adapter<GundemAdapter.GundemViewHolder>() {

    class GundemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val baslikTextView: TextView = itemView.findViewById(R.id.textViewGundemBaslik)
        val detayTextView: TextView = itemView.findViewById(R.id.textViewGundemDetay)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GundemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemgundem, parent, false) // Her bir öğenin layout'u
        return GundemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GundemViewHolder, position: Int) {
        val currentItem = gundemListesi[position]
        holder.baslikTextView.text = currentItem.baslik
        holder.detayTextView.text = currentItem.detay
    }

    override fun getItemCount() = gundemListesi.size
}