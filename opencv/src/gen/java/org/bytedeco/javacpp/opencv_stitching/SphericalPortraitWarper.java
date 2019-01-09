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



// Projects image onto unit sphere with origin at (0, 0, 0).
// Poles are located NOT at (0, -1, 0) and (0, 1, 0) points, BUT at (1, 0, 0) and (-1, 0, 0) points.
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.javacpp.opencv_stitching.opencv_stitching_presets.class)
public class SphericalPortraitWarper extends RotationWarper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SphericalPortraitWarper(Pointer p) { super(p); }

    public SphericalPortraitWarper(float scale) { super((Pointer)null); allocate(scale); }
    private native void allocate(float scale);
}