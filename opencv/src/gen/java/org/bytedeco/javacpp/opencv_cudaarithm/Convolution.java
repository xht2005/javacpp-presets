// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_cudaarithm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

import static org.bytedeco.javacpp.opencv_cudaarithm.opencv_cudaarithm.*;


/** \brief Base class for convolution (or cross-correlation) operator. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.javacpp.opencv_cudaarithm.opencv_cudaarithm_presets.class)
public class Convolution extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Convolution(Pointer p) { super(p); }

    /** \brief Computes a convolution (or cross-correlation) of two images.
    <p>
    @param image Source image. Only CV_32FC1 images are supported for now.
    @param templ Template image. The size is not greater than the image size. The type is the same as
    image .
    @param result Result image. If image is *W x H* and templ is *w x h*, then result must be *W-w+1 x
    H-h+1*.
    @param ccorr Flags to evaluate cross-correlation instead of convolution.
    @param stream Stream for the asynchronous version.
     */
    public native void convolve(@ByVal Mat image, @ByVal Mat templ, @ByVal Mat result, @Cast("bool") boolean ccorr/*=false*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void convolve(@ByVal Mat image, @ByVal Mat templ, @ByVal Mat result);
    public native void convolve(@ByVal UMat image, @ByVal UMat templ, @ByVal UMat result, @Cast("bool") boolean ccorr/*=false*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void convolve(@ByVal UMat image, @ByVal UMat templ, @ByVal UMat result);
    public native void convolve(@ByVal GpuMat image, @ByVal GpuMat templ, @ByVal GpuMat result, @Cast("bool") boolean ccorr/*=false*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void convolve(@ByVal GpuMat image, @ByVal GpuMat templ, @ByVal GpuMat result);
}