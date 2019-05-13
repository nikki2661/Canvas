package com.example.nikita.canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;

/**
 * CanvasExample shows how to create a custom view and draw on its canvas.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyCanvasView myCanvasView;
        // No XML file; just one custom view created programmatically.
        myCanvasView = new MyCanvasView(this);
        // Request the full available screen for layout.
        myCanvasView.setSystemUiVisibility(SYSTEM_UI_FLAG_FULLSCREEN);
        setContentView(myCanvasView);
    }
}