// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_highgui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;

import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;


@Convention("CV_CDECL") @Properties(inherit = org.bytedeco.javacpp.opencv_highgui.opencv_highgui_presets.class)
public class CvTrackbarCallback2 extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvTrackbarCallback2(Pointer p) { super(p); }
    protected CvTrackbarCallback2() { allocate(); }
    private native void allocate();
    public native void call(int pos, Pointer userdata);
}