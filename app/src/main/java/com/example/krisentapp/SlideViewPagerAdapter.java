package com.example.krisentapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideViewPagerAdapter extends PagerAdapter {

    Context ctx;

    public SlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_screen,container,false);

        ImageView head= view.findViewById(R.id.head);

        ImageView icon1 = view.findViewById(R.id.icon1);
        ImageView icon2 = view.findViewById(R.id.icon2);
        ImageView icon3 = view.findViewById(R.id.icon3);
        ImageView icon4 = view.findViewById(R.id.icon4);
        ImageView icon5 = view.findViewById(R.id.icon5);

        TextView title = view.findViewById(R.id.title);
        TextView desc = view.findViewById(R.id.desc);

        Button btnjoin = view.findViewById(R.id.btnjoin);
        btnjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,HomeActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
        });

        switch (position)
        {
            case 0:
                head.setImageResource(R.drawable.krisent);
                icon1.setImageResource(R.drawable.rect);
                icon2.setImageResource(R.drawable.circle);
                icon3.setImageResource(R.drawable.circle);
                icon4.setImageResource(R.drawable.circle);

                title.setText("We Secure The World");
                desc.setText("Krisent Technologies, the time to maket company, is premier electronic product development company. Krisent was established to help companies design and manufacture quality electronic products worldwide");
                btnjoin.setVisibility(View.GONE);
                break;
            case 1:
                head.setImageResource(R.drawable.logo2);
                icon1.setImageResource(R.drawable.circle);
                icon2.setImageResource(R.drawable.rect);
                icon3.setImageResource(R.drawable.circle);
                icon4.setImageResource(R.drawable.circle);

                title.setText("GSM Shutter Intruder");
                desc.setText("Krisent Technologies, the time to maket company, is premier electronic product development company. Krisent was established to help companies design and manufacture quality electronic products worldwide");
                btnjoin.setVisibility(View.GONE);
                break;
            case 2:
                head.setImageResource(R.drawable.logo3);
                icon1.setImageResource(R.drawable.circle);
                icon2.setImageResource(R.drawable.circle);
                icon3.setImageResource(R.drawable.rect);
                icon4.setImageResource(R.drawable.circle);

                title.setText("Wireless GSM Multi Shutter Siren");
                desc.setText("Krisent Technologies, the time to maket company, is premier electronic product development company. Krisent was established to help companies design and manufacture quality electronic products worldwide");
                btnjoin.setVisibility(View.GONE);
                break;
            case 3:
                head.setImageResource(R.drawable.krisent);
                icon1.setImageResource(R.drawable.circle);
                icon2.setImageResource(R.drawable.circle);
                icon3.setImageResource(R.drawable.circle);
                icon4.setImageResource(R.drawable.rect);

                title.setText("GSM Shutter Intruder");
                desc.setText("Krisent Technologies, the time to maket company, is premier electronic product development company. Krisent was established to help companies design and manufacture quality electronic products worldwide");
                break;
        }

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
