package com.itdevstar.qrscannerlib;

/**
 *
 */
public interface RotationCallback {
    /**
     * Rotation changed.
     *
     * @param rotation the current value of windowManager.getDefaultDisplay().getRotation()
     */
    void onRotationChanged(int rotation);
}
