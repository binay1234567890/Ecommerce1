package project.ecommerce.com.technozlife.binay.ecommerce1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

/**
 * Created by Binay on 01/10/2016.
 */

public class MycustomAdapter extends RecyclerView.Adapter<MycustomAdapter.MyViewHolder> {


    Context context;
    ArrayList<Information> data;
    LayoutInflater inflater;

    public MycustomAdapter(Context content, ArrayList<Information> data) {

        this.context = content;
        this.data = data;
        inflater = LayoutInflater.from(content);
    }

    public MycustomAdapter(ArrayList<Information> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = inflater.inflate(R.layout.list_row_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view , context , data);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        String imgurl = "http://192.168.0.103/ecommerce/images/"+data.get(position).getImageId();
        holder.text.setText(data.get(position).ptitle);
        Picasso.with(context).load(imgurl).resize(1080, 1080).into(holder.img);
      //  holder.img.setImageResource(data.get(position).ImageId);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }








    class MyViewHolder extends  RecyclerView.ViewHolder implements  View.OnClickListener{

        TextView text;
        ImageView img;
        Button btn;
        Context ctx;
        ArrayList<Information> data = new ArrayList<Information>();

         public MyViewHolder(View View, Context ctx , ArrayList<Information> data ) {
             super(View);
             this.ctx = ctx;
             this.data = data;
             View.setOnClickListener(this);
             text =(TextView) itemView.findViewById(R.id.row_title);
             img = (ImageView) itemView.findViewById(R.id.row_img);


         }

        @Override
        public void onClick(View v) {

                int position  = getAdapterPosition();
                Information inform  = this.data.get(position);
                Intent i = new Intent(this.ctx , full_details.class);
                i.putExtra("img_id", inform.getImageId());
                i.putExtra("name", inform.getPtitle());
                 i.putExtra("brand", inform.getpBrand());
            i.putExtra("cate", inform.getpCategory());
            i.putExtra("desc", inform.getpDescription());
            i.putExtra("pid", inform.getpId());
            i.putExtra("key", inform.getpKeyword());
            i.putExtra("price", inform.getpPrice());

                this.ctx.startActivity(i);




        }
    }
}
