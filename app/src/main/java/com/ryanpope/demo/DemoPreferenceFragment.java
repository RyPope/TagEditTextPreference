package com.ryanpope.demo;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DemoPreferenceFragment extends PreferenceFragment {
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        addPreferencesFromResource(R.xml.preferences);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
