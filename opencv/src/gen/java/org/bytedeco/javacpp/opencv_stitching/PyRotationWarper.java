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

    @Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_stitching.opencv_stitching_presets.class)
public class PyRotationWarper extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PyRotationWarper(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PyRotationWarper(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PyRotationWarper position(long position) {
            return (PyRotationWarper)super.position(position);
        }
    
        public PyRotationWarper(@Str BytePointer type, float scale) { super((Pointer)null); allocate(type, scale); }
        private native void allocate(@Str BytePointer type, float scale);
        public PyRotationWarper(@Str String type, float scale) { super((Pointer)null); allocate(type, scale); }
        private native void allocate(@Str String type, float scale);
        public PyRotationWarper() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** \brief Projects the image point.
        <p>
        @param pt Source point
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @return Projected point
        */
        public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal Mat K, @ByVal Mat R);
        public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal UMat K, @ByVal UMat R);
        public native @ByVal Point2f warpPoint(@Const @ByRef Point2f pt, @ByVal GpuMat K, @ByVal GpuMat R);

        /** \brief Builds the projection maps according to the given camera data.
        <p>
        @param src_size Source image size
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @param xmap Projection map for the x axis
        @param ymap Projection map for the y axis
        @return Projected image minimum bounding box
        */
        public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat xmap, @ByVal Mat ymap);
        public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat xmap, @ByVal UMat ymap);
        public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat xmap, @ByVal GpuMat ymap);

        /** \brief Projects the image.
        <p>
        @param src Source image
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @param interp_mode Interpolation mode
        @param border_mode Border extrapolation mode
        @param dst Projected image
        @return Project image top-left corner
        */
        public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                    @ByVal Mat dst);
        public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                    @ByVal UMat dst);
        public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                    @ByVal GpuMat dst);

        /** \brief Projects the image backward.
        <p>
        @param src Projected image
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @param interp_mode Interpolation mode
        @param border_mode Border extrapolation mode
        @param dst_size Backward-projected image size
        @param dst Backward-projected image
        */
        public native void warpBackward(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode,
                    @ByVal Size dst_size, @ByVal Mat dst);
        public native void warpBackward(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode,
                    @ByVal Size dst_size, @ByVal UMat dst);
        public native void warpBackward(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode,
                    @ByVal Size dst_size, @ByVal GpuMat dst);

        /**
        @param src_size Source image bounding box
        @param K Camera intrinsic parameters
        @param R Camera rotation matrix
        @return Projected image minimum bounding box
        */
        public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R);
        public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R);
        public native @ByVal Rect warpRoi(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R);

        public native float getScale();
        public native void setScale(float arg0);
    }