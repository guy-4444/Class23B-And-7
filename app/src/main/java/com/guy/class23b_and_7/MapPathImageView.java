package com.guy.class23b_and_7;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

import java.util.List;
import com.guy.class23b_and_7.PathImageGenerator.LatLng;

public class MapPathImageView extends AppCompatImageView {

    public MapPathImageView(@NonNull Context context) {
        super(context);
    }

    public MapPathImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MapPathImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setPath(List<LatLng> latLngList) {
        Bitmap bitmap = PathImageGenerator.generatePath(latLngList);
        setImageBitmap(bitmap);
    }
}
