// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_plot.*;
import static org.bytedeco.javacpp.opencv_plot.opencv_plot.*;
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
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_dnn.*;
import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;

import static org.bytedeco.javacpp.opencv_tracking.opencv_tracking.*;


/*********************************** CSRT ************************************/
/** \brief the CSRT tracker
<p>
The implementation is based on \cite Lukezic_IJCV2018 Discriminative Correlation Filter with Channel and Spatial Reliability
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.javacpp.opencv_tracking.opencv_tracking_presets.class)
public class TrackerCSRT extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerCSRT(Pointer p) { super(p); }

  @NoOffset public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
  
    /**
    * \brief Constructor
    */
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
    * \brief Read parameters from a file
    */
    public native void read(@Const @ByRef FileNode arg0);

    /**
    * \brief Write parameters to a file
    */
    public native void write(@ByRef FileStorage fs);

    public native @Cast("bool") boolean use_hog(); public native Params use_hog(boolean use_hog);
    public native @Cast("bool") boolean use_color_names(); public native Params use_color_names(boolean use_color_names);
    public native @Cast("bool") boolean use_gray(); public native Params use_gray(boolean use_gray);
    public native @Cast("bool") boolean use_rgb(); public native Params use_rgb(boolean use_rgb);
    public native @Cast("bool") boolean use_channel_weights(); public native Params use_channel_weights(boolean use_channel_weights);
    public native @Cast("bool") boolean use_segmentation(); public native Params use_segmentation(boolean use_segmentation);

    /**  Window function: "hann", "cheb", "kaiser" */
    public native @StdString BytePointer window_function(); public native Params window_function(BytePointer window_function);
    public native float kaiser_alpha(); public native Params kaiser_alpha(float kaiser_alpha);
    public native float cheb_attenuation(); public native Params cheb_attenuation(float cheb_attenuation);

    public native float template_size(); public native Params template_size(float template_size);
    public native float gsl_sigma(); public native Params gsl_sigma(float gsl_sigma);
    public native float hog_orientations(); public native Params hog_orientations(float hog_orientations);
    public native float hog_clip(); public native Params hog_clip(float hog_clip);
    public native float padding(); public native Params padding(float padding);
    public native float filter_lr(); public native Params filter_lr(float filter_lr);
    public native float weights_lr(); public native Params weights_lr(float weights_lr);
    public native int num_hog_channels_used(); public native Params num_hog_channels_used(int num_hog_channels_used);
    public native int admm_iterations(); public native Params admm_iterations(int admm_iterations);
    public native int histogram_bins(); public native Params histogram_bins(int histogram_bins);
    public native float histogram_lr(); public native Params histogram_lr(float histogram_lr);
    public native int background_ratio(); public native Params background_ratio(int background_ratio);
    public native int number_of_scales(); public native Params number_of_scales(int number_of_scales);
    public native float scale_sigma_factor(); public native Params scale_sigma_factor(float scale_sigma_factor);
    public native float scale_model_max_area(); public native Params scale_model_max_area(float scale_model_max_area);
    public native float scale_lr(); public native Params scale_lr(float scale_lr);
    public native float scale_step(); public native Params scale_step(float scale_step);

    /** we lost the target, if the psr is lower than this. */
    public native float psr_threshold(); public native Params psr_threshold(float psr_threshold);
  }

  /** \brief Constructor
  @param parameters CSRT parameters TrackerCSRT::Params
  */
  public static native @Ptr TrackerCSRT create(@Const @ByRef Params parameters);

  public static native @Ptr TrackerCSRT create();

  public native void setInitialMask(@ByVal Mat mask);
  public native void setInitialMask(@ByVal UMat mask);
  public native void setInitialMask(@ByVal GpuMat mask);
}