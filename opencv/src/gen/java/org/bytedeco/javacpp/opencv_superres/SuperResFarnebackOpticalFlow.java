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



        @Name("cv::superres::FarnebackOpticalFlow") @Properties(inherit = org.bytedeco.javacpp.opencv_superres.opencv_superres_presets.class)
public class SuperResFarnebackOpticalFlow extends DenseOpticalFlowExt {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public SuperResFarnebackOpticalFlow(Pointer p) { super(p); }
        
            /** @see setPyrScale */
            public native double getPyrScale();
            /** \copybrief getPyrScale @see getPyrScale */
            public native void setPyrScale(double val);
            /** @see setLevelsNumber */
            public native int getLevelsNumber();
            /** \copybrief getLevelsNumber @see getLevelsNumber */
            public native void setLevelsNumber(int val);
            /** @see setWindowSize */
            public native int getWindowSize();
            /** \copybrief getWindowSize @see getWindowSize */
            public native void setWindowSize(int val);
            /** @see setIterations */
            public native int getIterations();
            /** \copybrief getIterations @see getIterations */
            public native void setIterations(int val);
            /** @see setPolyN */
            public native int getPolyN();
            /** \copybrief getPolyN @see getPolyN */
            public native void setPolyN(int val);
            /** @see setPolySigma */
            public native double getPolySigma();
            /** \copybrief getPolySigma @see getPolySigma */
            public native void setPolySigma(double val);
            /** @see setFlags */
            public native int getFlags();
            /** \copybrief getFlags @see getFlags */
            public native void setFlags(int val);
        }