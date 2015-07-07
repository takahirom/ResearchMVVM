package com.kogitune.researchmvvm.binding;

import android.databinding.BindingAdapter;
import android.databinding.ObservableInt;
import android.widget.SeekBar;

/**
 * Created by takam on 2015/07/07.
 */
public class SeekBarBindings {

    @SuppressWarnings("unchecked")
    @BindingAdapter("seekValue")
    public static void setItems(SeekBar seekBar, final ObservableInt colorNotionInt) {
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                colorNotionInt.set(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
