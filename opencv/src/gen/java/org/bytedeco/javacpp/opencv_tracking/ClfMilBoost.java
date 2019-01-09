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


/** \addtogroup tracking
 *  \{ */

//TODO based on the original implementation
//http://vision.ucsd.edu/~bbabenko/project_miltrack.shtml

@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_tracking.opencv_tracking_presets.class)
public class ClfMilBoost extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClfMilBoost(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ClfMilBoost(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ClfMilBoost position(long position) {
        return (ClfMilBoost)super.position(position);
    }

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
  
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native int _numSel(); public native Params _numSel(int _numSel);
    public native int _numFeat(); public native Params _numFeat(int _numFeat);
    public native float _lRate(); public native Params _lRate(float _lRate);
  }

  public ClfMilBoost() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native void init( @Const @ByRef(nullValue = "cv::ClfMilBoost::Params()") Params parameters );
  public native void init( );
  public native void update( @Const @ByRef Mat posx, @Const @ByRef Mat negx );
  public native @StdVector FloatPointer classify( @Const @ByRef Mat x, @Cast("bool") boolean logR/*=true*/ );
  public native @StdVector FloatPointer classify( @Const @ByRef Mat x );

  public native float sigmoid( float x );

}