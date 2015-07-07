package com.kogitune.researchmvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;

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

    public final ObservableInt getRed(){
        return r;
    }

    public final ObservableInt getGreen(){
        return g;
    }

    public final ObservableInt getBlue(){
        return b;
    }


}
