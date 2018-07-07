package com.padcmyanmar.fun5.helloworld.viewpods;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.padcmyanmar.fun5.helloworld.R;
import com.padcmyanmar.fun5.helloworld.utils.GlideApp;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EmptyViewPod extends RelativeLayout {

    @BindView(R.id.iv_empty_img)
    ImageView ivEmptyImg;

    @BindView(R.id.tv_empty_text)
    TextView tvEmptyText;

    public EmptyViewPod(Context context) {
        super(context);
    }

    public EmptyViewPod(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyViewPod(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this,this);
    }

    public void setEmptyData(String emptyImageUrl, String emptyMsg) {
        GlideApp.with(getContext())
                .load(emptyImageUrl)
                .into(ivEmptyImg);

        tvEmptyText.setText(emptyMsg);
    }

    public void setEmptyData(int emptyImageResource, String emptyMsg) {
        ivEmptyImg.setImageResource(emptyImageResource);
        tvEmptyText.setText(emptyMsg);
    }
}
