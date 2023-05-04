package com.itdevstar.qrscannerlib.camera;

import com.itdevstar.qrscannerlib.SourceData;

/**
 * Callback for camera previews.
 */
public interface PreviewCallback {
    void onPreview(SourceData sourceData);
    void onPreviewError(Exception e);
}
