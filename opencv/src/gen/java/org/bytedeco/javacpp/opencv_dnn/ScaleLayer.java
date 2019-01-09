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


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_dnn.opencv_dnn_presets.class)
public class ScaleLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ScaleLayer(Pointer p) { super(p); }
    
        public native @Cast("bool") boolean hasBias(); public native ScaleLayer hasBias(boolean hasBias);
        public native int axis(); public native ScaleLayer axis(int axis);

        public static native @Ptr ScaleLayer create(@Const @ByRef LayerParams params);
    }