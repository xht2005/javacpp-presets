// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_img_hash;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;

import static org.bytedeco.javacpp.opencv_img_hash.opencv_img_hash.*;


/** \addtogroup img_hash
 *  \{
<p>
/** \brief Computes average hash value of the input image
<p>
This is a fast image hashing algorithm, but only work on simple case. For more details, please
refer to \cite lookslikeit
*/
@Namespace("cv::img_hash") @Properties(inherit = org.bytedeco.javacpp.opencv_img_hash.opencv_img_hash_presets.class)
public class AverageHash extends ImgHashBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AverageHash(Pointer p) { super(p); }

    public static native @Ptr AverageHash create();
}