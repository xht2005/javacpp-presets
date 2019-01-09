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


@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_stitching.opencv_stitching_presets.class)
public class BestOf2NearestRangeMatcher extends BestOf2NearestMatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BestOf2NearestRangeMatcher(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BestOf2NearestRangeMatcher(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BestOf2NearestRangeMatcher position(long position) {
        return (BestOf2NearestRangeMatcher)super.position(position);
    }

    public BestOf2NearestRangeMatcher(int range_width/*=5*/, @Cast("bool") boolean try_use_gpu/*=false*/, float match_conf/*=0.3f*/,
                                int num_matches_thresh1/*=6*/, int num_matches_thresh2/*=6*/) { super((Pointer)null); allocate(range_width, try_use_gpu, match_conf, num_matches_thresh1, num_matches_thresh2); }
    private native void allocate(int range_width/*=5*/, @Cast("bool") boolean try_use_gpu/*=false*/, float match_conf/*=0.3f*/,
                                int num_matches_thresh1/*=6*/, int num_matches_thresh2/*=6*/);
    public BestOf2NearestRangeMatcher() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @Name("operator ()") void apply(@StdVector ImageFeatures features, @StdVector MatchesInfo pairwise_matches,
                         @Const @ByRef(nullValue = "cv::UMat()") UMat mask);
    public native @Name("operator ()") void apply(@StdVector ImageFeatures features, @StdVector MatchesInfo pairwise_matches);
}