// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;

import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;


    /* Activations */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.javacpp.opencv_dnn.opencv_dnn_presets.class)
public class ActivationLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ActivationLayer(Pointer p) { super(p); }
    
        public native void forwardSlice(@Const FloatPointer src, FloatPointer dst, int len,
                                          @Cast("size_t") long outPlaneSize, int cn0, int cn1);
        public native void forwardSlice(@Const FloatBuffer src, FloatBuffer dst, int len,
                                          @Cast("size_t") long outPlaneSize, int cn0, int cn1);
        public native void forwardSlice(@Const float[] src, float[] dst, int len,
                                          @Cast("size_t") long outPlaneSize, int cn0, int cn1);
    }