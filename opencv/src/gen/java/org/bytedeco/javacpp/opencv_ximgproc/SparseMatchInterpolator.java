// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_ximgproc;

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

import static org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc.*;


/** \addtogroup ximgproc_filters
 *  \{
<p>
/** \brief Main interface for all filters, that take sparse matches as an
input and produce a dense per-pixel matching (optical flow) as an output.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.javacpp.opencv_ximgproc.opencv_ximgproc_presets.class)
public class SparseMatchInterpolator extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMatchInterpolator(Pointer p) { super(p); }

    /** \brief Interpolate input sparse matches.
    <p>
    @param from_image first of the two matched images, 8-bit single-channel or three-channel.
    <p>
    @param from_points points of the from_image for which there are correspondences in the
    to_image (Point2f vector, size shouldn't exceed 32767)
    <p>
    @param to_image second of the two matched images, 8-bit single-channel or three-channel.
    <p>
    @param to_points points in the to_image corresponding to from_points
    (Point2f vector, size shouldn't exceed 32767)
    <p>
    @param dense_flow output dense matching (two-channel CV_32F image)
     */
    public native void interpolate(@ByVal Mat from_image, @ByVal Mat from_points,
                                         @ByVal Mat to_image, @ByVal Mat to_points,
                                         @ByVal Mat dense_flow);
    public native void interpolate(@ByVal UMat from_image, @ByVal UMat from_points,
                                         @ByVal UMat to_image, @ByVal UMat to_points,
                                         @ByVal UMat dense_flow);
    public native void interpolate(@ByVal GpuMat from_image, @ByVal GpuMat from_points,
                                         @ByVal GpuMat to_image, @ByVal GpuMat to_points,
                                         @ByVal GpuMat dense_flow);
}