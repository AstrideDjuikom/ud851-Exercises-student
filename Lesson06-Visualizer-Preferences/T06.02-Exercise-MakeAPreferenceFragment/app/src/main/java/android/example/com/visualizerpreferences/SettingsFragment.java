package android.example.com.visualizerpreferences;

import android.os.Bundle;

public class SettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle bundle, String s) {


        addPreferencesFromResource(R.xml.pref_visualizer);


    }
}
