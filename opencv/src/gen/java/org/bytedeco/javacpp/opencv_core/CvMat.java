// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.opencv_core.*;

// #endif

/** Matrix elements are stored row by row. Element (i, j) (i - 0-based row index, j - 0-based column
index) of a matrix can be retrieved or modified using CV_MAT_ELEM macro:
    <p>
    uchar pixval = CV_MAT_ELEM(grayimg, uchar, i, j)
    CV_MAT_ELEM(cameraMatrix, float, 0, 2) = image.width*0.5f;
<p>
To access multiple-channel matrices, you can use
CV_MAT_ELEM(matrix, type, i, j\*nchannels + channel_idx).
<p>
@deprecated CvMat is now obsolete; consider using Mat instead.
 */
@NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_core.opencv_core_presets.class)
public class CvMat extends AbstractCvMat {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvMat position(long position) {
        return (CvMat)super.position(position);
    }

    public native int type(); public native CvMat type(int type);
    public native int step(); public native CvMat step(int step);

    /* for internal use only */
    public native IntPointer refcount(); public native CvMat refcount(IntPointer refcount);
    public native int hdr_refcount(); public native CvMat hdr_refcount(int hdr_refcount);

        @Name("data.ptr") public native @Cast("uchar*") BytePointer data_ptr(); public native CvMat data_ptr(BytePointer data_ptr);
        @Name("data.s") public native ShortPointer data_s(); public native CvMat data_s(ShortPointer data_s);
        @Name("data.i") public native IntPointer data_i(); public native CvMat data_i(IntPointer data_i);
        @Name("data.fl") public native FloatPointer data_fl(); public native CvMat data_fl(FloatPointer data_fl);
        @Name("data.db") public native DoublePointer data_db(); public native CvMat data_db(DoublePointer data_db);

// #ifdef __cplusplus
        public native int rows(); public native CvMat rows(int rows);
        public native int height(); public native CvMat height(int height);
        public native int cols(); public native CvMat cols(int cols);
        public native int width(); public native CvMat width(int width);
// #else
// #endif

// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvMat() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvMat(@Const @ByRef Mat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Mat m);
// #endif
}