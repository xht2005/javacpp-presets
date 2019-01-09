// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_videostab;

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
import org.bytedeco.javacpp.opencv_photo.*;
import static org.bytedeco.javacpp.opencv_photo.opencv_photo.*;

import static org.bytedeco.javacpp.opencv_videostab.opencv_videostab.*;


@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_videostab.opencv_videostab_presets.class)
public class WeightingDeblurer extends DeblurerBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WeightingDeblurer(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WeightingDeblurer(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WeightingDeblurer position(long position) {
        return (WeightingDeblurer)super.position(position);
    }

    public WeightingDeblurer() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native void setSensitivity(float val);
    public native float sensitivity();

    public native void deblur(int idx, @ByRef Mat frame);
}