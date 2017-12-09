package geon.g_button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;

public class GButton extends android.support.v7.widget.AppCompatButton {

    public GButton(Context context) {
        super(context);

        init();
    }

    public GButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public GButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        setBackground(getResources().getDrawable(R.mipmap.ic_launcher));
    }

    public StateListDrawable drawPress(Drawable normal, Drawable pressed) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[] {-android.R.attr.state_pressed}, normal); // Normal
        drawable.addState(new int[] {android.R.attr.state_pressed}, pressed); // Pressed

        return drawable;
    }
}
