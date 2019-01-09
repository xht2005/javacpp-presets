// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_features2d;

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

import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;


/** \brief kmeans -based class to train visual vocabulary using the *bag of visual words* approach. :
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_features2d.opencv_features2d_presets.class)
public class BOWKMeansTrainer extends BOWTrainer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BOWKMeansTrainer(Pointer p) { super(p); }

    /** \brief The constructor.
    <p>
    @see cv::kmeans
    */
    public BOWKMeansTrainer( int clusterCount, @Const @ByRef(nullValue = "cv::TermCriteria()") TermCriteria termcrit,
                          int attempts/*=3*/, int flags/*=cv::KMEANS_PP_CENTERS*/ ) { super((Pointer)null); allocate(clusterCount, termcrit, attempts, flags); }
    private native void allocate( int clusterCount, @Const @ByRef(nullValue = "cv::TermCriteria()") TermCriteria termcrit,
                          int attempts/*=3*/, int flags/*=cv::KMEANS_PP_CENTERS*/ );
    public BOWKMeansTrainer( int clusterCount ) { super((Pointer)null); allocate(clusterCount); }
    private native void allocate( int clusterCount );

    // Returns trained vocabulary (i.e. cluster centers).
    public native @ByVal @Override Mat cluster();
    public native @ByVal @Override Mat cluster( @Const @ByRef Mat descriptors );
}