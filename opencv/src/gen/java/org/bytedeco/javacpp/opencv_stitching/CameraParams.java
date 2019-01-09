// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_stitching;

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
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_ml.*;
import static org.bytedeco.javacpp.opencv_ml.opencv_ml.*;
import org.bytedeco.javacpp.opencv_shape.*;
import static org.bytedeco.javacpp.opencv_shape.opencv_shape.*;
import org.bytedeco.javacpp.opencv_xfeatures2d.*;
import static org.bytedeco.javacpp.opencv_xfeatures2d.opencv_xfeatures2d.*;

import static org.bytedeco.javacpp.opencv_stitching.opencv_stitching.*;


/** \addtogroup stitching
 *  \{
<p>
/** \brief Describes camera parameters.
<p>
\note Translation is assumed to be zero during the whole stitching pipeline. :
 */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_stitching.opencv_stitching_presets.class)
public class CameraParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CameraParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CameraParams position(long position) {
        return (CameraParams)super.position(position);
    }

    public CameraParams() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CameraParams(@Const @ByRef CameraParams other) { super((Pointer)null); allocate(other); }
    private native void allocate(@Const @ByRef CameraParams other);
    public native @ByRef @Name("operator =") CameraParams put(@Const @ByRef CameraParams other);
    public native @ByVal Mat K();

    public native double focal(); public native CameraParams focal(double focal); // Focal length
    public native double aspect(); public native CameraParams aspect(double aspect); // Aspect ratio
    public native double ppx(); public native CameraParams ppx(double ppx); // Principal point X
    public native double ppy(); public native CameraParams ppy(double ppy); // Principal point Y
    public native @ByRef Mat R(); public native CameraParams R(Mat R); // Rotation
    public native @ByRef Mat t(); public native CameraParams t(Mat t); // Translation
}