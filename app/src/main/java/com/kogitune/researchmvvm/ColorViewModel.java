package com.kogitune.researchmvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;
import android.widget.SeekBar;

/**
 * Created by takam on 2015/07/06.
 */
public class ColorViewModel extends BaseObservable {
    @Bindable
    public final ObservableInt r = new ObservableInt();
    @Bindable
    public final ObservableInt g = new ObservableInt();
    @Bindable
    public final ObservableInt b = new ObservableInt();

    public final SeekBar.OnSeekBarChangeListener onRedSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            r.set(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };
    public final SeekBar.OnSeekBarChangeListener onGreenSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            g.set(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };
    public final SeekBar.OnSeekBarChangeListener onBlueSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            b.set(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };
}
