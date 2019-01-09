// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;


@Convention("CV_CDECL") @Properties(inherit = org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc_presets.class)
public class CvDistanceFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvDistanceFunction(Pointer p) { super(p); }
    protected CvDistanceFunction() { allocate(); }
    private native void allocate();
    public native float call( @Const FloatPointer a, @Const FloatPointer b, Pointer user_param );
}