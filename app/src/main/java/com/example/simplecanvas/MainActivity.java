package com.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.draw_imageview);
        mPaint.setColor(Color.WHITE);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(), R.color.black, null));
        mPaintText.setTextSize(60);
    }

    public void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(Color.YELLOW);

        mPaint.setColor(Color.GRAY);
        mPaint.setStrokeWidth(6);
        mCanvas.drawLine(600,200,600,400, mPaint);

        mPaint.setColor(Color.RED);
        mCanvas.drawLine(100, 200, 300, 100, mPaint);
        mCanvas.drawLine(300, 100, 800, 100, mPaint);// atap atas
        mCanvas.drawLine(800, 100, 600, 200, mPaint);
        mCanvas.drawLine(800, 100, 1000, 200, mPaint);
        mCanvas.drawLine(100, 200, 1000, 200, mPaint);// atap bawah

        mPaint.setColor(Color.WHITE);
        Rect mDinding = new Rect();
        mDinding.set(100, 200, 597, 400);
        mCanvas.drawRect(mDinding, mPaint);

        Rect mDinding2 = new Rect();
        mDinding2.set(603, 200, 1000, 400);
        mCanvas.drawRect(mDinding2, mPaint);

        int brownColor = getResources().getColor(R.color.brown);
        mPaint.setColor(brownColor);
        Rect mJendela = new Rect();
        mJendela.set(150, 225, 225, 375);
        mCanvas.drawRect(mJendela, mPaint);

        Rect mJendela2 = new Rect();
        mJendela2.set(312, 225, 387, 375);
        mCanvas.drawRect(mJendela2, mPaint);

        Rect mJendela3 = new Rect();
        mJendela3.set(475, 225, 550, 375);
        mCanvas.drawRect(mJendela3, mPaint);

        Rect mPintu1 = new Rect();
        mPintu1.set(725, 225, 799, 400);
        mCanvas.drawRect(mPintu1, mPaint);

        Rect mPintu2 = new Rect();
        mPintu2.set(801, 225, 875, 400);
        mCanvas.drawRect(mPintu2, mPaint);

        mPaint.setColor(Color.LTGRAY);
        Rect mJendela4 = new Rect();
        mJendela4.set(625, 225, 700, 375);
        mCanvas.drawRect(mJendela4, mPaint);

        Rect mJendela5 = new Rect();
        mJendela5.set(900, 225, 975, 375);
        mCanvas.drawRect(mJendela5, mPaint);

        mCanvas.drawText("HENRIKUS WAHYU SETYOBUDIWAN", 50, 500, mPaintText);
        mCanvas.drawText("19/447137/SV/16856", 50, 600, mPaintText);

        view.invalidate();
    }


}