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


@Namespace("cv::face") @Properties(inherit = org.bytedeco.javacpp.opencv_face.opencv_face_presets.class)
public class FisherFaceRecognizer extends BasicFaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FisherFaceRecognizer(Pointer p) { super(p); }

    /**
    @param num_components The number of components (read: Fisherfaces) kept for this Linear
    Discriminant Analysis with the Fisherfaces criterion. It's useful to keep all components, that
    means the number of your classes c (read: subjects, persons you want to recognize). If you leave
    this at the default (0) or set it to a value less-equal 0 or greater (c-1), it will be set to the
    correct number (c-1) automatically.
    @param threshold The threshold applied in the prediction. If the distance to the nearest neighbor
    is larger than the threshold, this method returns -1.
    <p>
    ### Notes:
    <p>
    -   Training and prediction must be done on grayscale images, use cvtColor to convert between the
        color spaces.
    -   **THE FISHERFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
        SIZE.** (caps-lock, because I got so many mails asking for this). You have to make sure your
        input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
        the images.
    -   This model does not support updating.
    <p>
    ### Model internal data:
    <p>
    -   num_components see FisherFaceRecognizer::create.
    -   threshold see FisherFaceRecognizer::create.
    -   eigenvalues The eigenvalues for this Linear Discriminant Analysis (ordered descending).
    -   eigenvectors The eigenvectors for this Linear Discriminant Analysis (ordered by their
        eigenvalue).
    -   mean The sample mean calculated from the training data.
    -   projections The projections of the training data.
    -   labels The labels corresponding to the projections.
     */
    public static native @Ptr FisherFaceRecognizer create(int num_components/*=0*/, double threshold/*=DBL_MAX*/);
    public static native @Ptr FisherFaceRecognizer create();
}