package com.yuji.dex.x.fragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.yuji.dex.x.R


class DefaultAppsPreferences : PreferenceFragmentCompat() {
    override fun onCreatePreferences(arg0: Bundle?, arg1: String?) {
        setPreferencesFromResource(R.xml.preferences_default_apps, arg1)
    }
}
