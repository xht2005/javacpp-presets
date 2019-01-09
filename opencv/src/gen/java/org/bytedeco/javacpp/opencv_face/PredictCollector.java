// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_face;

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
import org.bytedeco.javacpp.opencv_photo.*;
import static org.bytedeco.javacpp.opencv_photo.opencv_photo.*;

import static org.bytedeco.javacpp.opencv_face.opencv_face.*;

/** \addtogroup face
 *  \{
/** \brief Abstract base class for all strategies of prediction result handling
*/
@Namespace("cv::face") @Properties(inherit = org.bytedeco.javacpp.opencv_face.opencv_face_presets.class)
public class PredictCollector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PredictCollector(Pointer p) { super(p); }


    /** \brief Interface method called by face recognizer before results processing
    @param size total size of prediction evaluation that recognizer could perform
    */
    public native void init(@Cast("size_t") long size);

    /** \brief Interface method called by face recognizer for each result
    @param label current prediction label
    @param dist current prediction distance (confidence)
    */
    public native @Cast("bool") boolean collect(int label, double dist);
}