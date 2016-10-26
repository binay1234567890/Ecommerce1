package project.ecommerce.com.technozlife.binay.ecommerce1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class full_details extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout = null;
            ImageView img ;
            TextView title, brand , cate, price, desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_details);

        img = (ImageView) findViewById(R.id.profile_id);
        title = (TextView)  findViewById(R.id.ftitle);
        brand = (TextView)  findViewById(R.id.pBrand);
        cate = (TextView)  findViewById(R.id.pCate);
        price = (TextView)  findViewById(R.id.pPrice);
        desc = (TextView)  findViewById(R.id.pDes);




        //img.setImageResource(getIntent().getIntExtra("img_id" ,00));
        Picasso.with(getApplicationContext()).load("http://192.168.0.103/ecommerce/images/"+getIntent().getStringExtra("img_id"))
                .resize(1080, 1080).into(img);
        title.setText(getIntent().getStringExtra("name"));
        brand.setText(getIntent().getStringExtra("brand"));
        cate.setText(getIntent().getStringExtra("cate"));
        desc.setText(getIntent().getStringExtra("desc"));
        price.setText( getIntent().getStringExtra("price"));

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);


        dynamicToolbarColor();

        toolbarTextAppernce();
    }


    private void dynamicToolbarColor() {

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.biscuits);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {

                collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(getResources().getColor(R.color.colorPrimary)));
                collapsingToolbarLayout.setStatusBarScrimColor(palette.getMutedColor(getResources().getColor(R.color.colorPrimaryDark)));

            }
        });
    }


    private void toolbarTextAppernce() {
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedappbar);
    }

}

