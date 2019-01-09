// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_superres;

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
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;
import org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_objdetect.opencv_objdetect.*;
import org.bytedeco.javacpp.opencv_ximgproc.*;
import static org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc.*;
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_optflow.*;
import static org.bytedeco.javacpp.opencv_optflow.opencv_optflow.*;

import static org.bytedeco.javacpp.opencv_superres.opencv_superres.*;


/** \addtogroup superres
 *  \{ */

        @Namespace("cv::superres") @Properties(inherit = org.bytedeco.javacpp.opencv_superres.opencv_superres_presets.class)
public class DenseOpticalFlowExt extends Algorithm {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public DenseOpticalFlowExt(Pointer p) { super(p); }
        
            public native void calc(@ByVal Mat frame0, @ByVal Mat frame1, @ByVal Mat flow1, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat flow2);
            public native void calc(@ByVal Mat frame0, @ByVal Mat frame1, @ByVal Mat flow1);
            public native void calc(@ByVal UMat frame0, @ByVal UMat frame1, @ByVal UMat flow1, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat flow2);
            public native void calc(@ByVal UMat frame0, @ByVal UMat frame1, @ByVal UMat flow1);
            public native void calc(@ByVal GpuMat frame0, @ByVal GpuMat frame1, @ByVal GpuMat flow1, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat flow2);
            public native void calc(@ByVal GpuMat frame0, @ByVal GpuMat frame1, @ByVal GpuMat flow1);
            public native void collectGarbage();
        }