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



        @Namespace("cv::superres") @Properties(inherit = org.bytedeco.javacpp.opencv_superres.opencv_superres_presets.class)
public class BroxOpticalFlow extends DenseOpticalFlowExt {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public BroxOpticalFlow(Pointer p) { super(p); }
        
            /** \brief Flow smoothness
            /** @see setAlpha */
            public native double getAlpha();
            /** \copybrief getAlpha @see getAlpha */
            public native void setAlpha(double val);
            /** \brief Gradient constancy importance
            /** @see setGamma */
            public native double getGamma();
            /** \copybrief getGamma @see getGamma */
            public native void setGamma(double val);
            /** \brief Pyramid scale factor
            /** @see setScaleFactor */
            public native double getScaleFactor();
            /** \copybrief getScaleFactor @see getScaleFactor */
            public native void setScaleFactor(double val);
            /** \brief Number of lagged non-linearity iterations (inner loop)
            /** @see setInnerIterations */
            public native int getInnerIterations();
            /** \copybrief getInnerIterations @see getInnerIterations */
            public native void setInnerIterations(int val);
            /** \brief Number of warping iterations (number of pyramid levels)
            /** @see setOuterIterations */
            public native int getOuterIterations();
            /** \copybrief getOuterIterations @see getOuterIterations */
            public native void setOuterIterations(int val);
            /** \brief Number of linear system solver iterations
            /** @see setSolverIterations */
            public native int getSolverIterations();
            /** \copybrief getSolverIterations @see getSolverIterations */
            public native void setSolverIterations(int val);
        }