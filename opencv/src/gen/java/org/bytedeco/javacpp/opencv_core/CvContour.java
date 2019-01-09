// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.opencv_core.*;


@Properties(inherit = org.bytedeco.javacpp.opencv_core.opencv_core_presets.class)
public class CvContour extends CvSeq {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvContour() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvContour(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvContour(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvContour position(long position) {
        return (CvContour)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvContour flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvContour header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvContour h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvContour h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvContour v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvContour v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvContour total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvContour elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvContour block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvContour ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvContour delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvContour storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvContour free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvContour first(CvSeqBlock first);
    public native @ByRef CvRect rect(); public native CvContour rect(CvRect rect);
    public native int color(); public native CvContour color(int color);
    public native int reserved(int i); public native CvContour reserved(int i, int reserved);
    @MemberGetter public native IntPointer reserved();
}