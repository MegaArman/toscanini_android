package com.studionobume.musicalgoogle.Interactions;

/**
 * Created by Togame on 4/29/2017.
 */

public interface RetainedFragmentInteraction {
    public String getActiveFragmentTag();
    public void setActiveFragmentTag(String s);
    public void startBackgroundServiceNeeded();
}
