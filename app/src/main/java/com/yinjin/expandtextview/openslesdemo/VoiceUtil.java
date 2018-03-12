package com.yinjin.expandtextview.openslesdemo;

import android.content.res.AssetManager;

/**
 * desc:
 * time: 2018/3/9
 *
 * @author yinYin
 */
public class VoiceUtil {
    static {
        System.loadLibrary("native-lib");
    }

    public native void playURL(String url);

    public native void playAsset(AssetManager assetManager,String filename);
    public native void playPCM(String pamPath);

    public native void stop();
    public native void pause();
    public native void replay();
}
