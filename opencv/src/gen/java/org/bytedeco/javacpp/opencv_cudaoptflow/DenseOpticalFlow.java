// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_cudaoptflow;

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
import org.bytedeco.javacpp.opencv_cudaarithm.*;
import static org.bytedeco.javacpp.opencv_cudaarithm.opencv_cudaarithm.*;
import org.bytedeco.javacpp.opencv_cudafilters.*;
import static org.bytedeco.javacpp.opencv_cudafilters.opencv_cudafilters.*;
import org.bytedeco.javacpp.opencv_cudaimgproc.*;
import static org.bytedeco.javacpp.opencv_cudaimgproc.opencv_cudaimgproc.*;
import org.bytedeco.javacpp.opencv_cudawarping.*;
import static org.bytedeco.javacpp.opencv_cudawarping.opencv_cudawarping.*;

import static org.bytedeco.javacpp.opencv_cudaoptflow.opencv_cudaoptflow.*;


/** \addtogroup cudaoptflow
 *  \{ */

//
// Interface
//

/** \brief Base interface for dense optical flow algorithms.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.javacpp.opencv_cudaoptflow.opencv_cudaoptflow_presets.class)
public class DenseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseOpticalFlow(Pointer p) { super(p); }

    /** \brief Calculates a dense optical flow.
    <p>
    @param I0 first input image.
    @param I1 second input image of the same size and the same type as I0.
    @param flow computed flow image that has the same size as I0 and type CV_32FC2.
    @param stream Stream for the asynchronous version.
     */
    public native void calc(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow);
    public native void calc(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow);
    public native void calc(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow);
}