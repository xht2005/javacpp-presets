// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_plot.*;
import static org.bytedeco.javacpp.opencv_plot.opencv_plot.*;
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
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_dnn.*;
import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;

import static org.bytedeco.javacpp.opencv_tracking.opencv_tracking.*;


/** \brief Class that manages the extraction and selection of features
<p>
\cite AAM Feature Extraction and Feature Set Refinement (Feature Processing and Feature Selection).
See table I and section III C \cite AMVOT Appearance modelling -\> Visual representation (Table II,
section 3.1 - 3.2)
<p>
TrackerFeatureSet is an aggregation of TrackerFeature
<p>
@see
   TrackerFeature
 <p>
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.javacpp.opencv_tracking.opencv_tracking_presets.class)
public class TrackerFeatureSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerFeatureSet(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackerFeatureSet(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrackerFeatureSet position(long position) {
        return (TrackerFeatureSet)super.position(position);
    }


  public TrackerFeatureSet() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief Extract features from the images collection
    @param images The input images
     */
  public native void extraction( @Const @ByRef MatVector images );

  /** \brief Identify most effective features for all feature types (optional)
     */
  public native void selection();

  /** \brief Remove outliers for all feature types (optional)
     */
  public native void removeOutliers();

  /** \brief Add TrackerFeature in the collection. Return true if TrackerFeature is added, false otherwise
    @param trackerFeatureType The TrackerFeature name
    <p>
    The modes available now:
    <p>
    -   "HAAR" -- Haar Feature-based
    <p>
    The modes that will be available soon:
    <p>
    -   "HOG" -- Histogram of Oriented Gradients features
    -   "LBP" -- Local Binary Pattern features
    -   "FEATURE2D" -- All types of Feature2D
    <p>
    Example TrackerFeatureSet::addTrackerFeature : :
    <pre>{@code
        //sample usage:

        Ptr<TrackerFeature> trackerFeature = new TrackerFeatureHAAR( HAARparameters );
        featureSet->addTrackerFeature( trackerFeature );

        //or add CSC sampler with default parameters
        //featureSet->addTrackerFeature( "HAAR" );
    }</pre>
    \note If you use the second method, you must initialize the TrackerFeature
     */
  public native @Cast("bool") boolean addTrackerFeature( @Str BytePointer trackerFeatureType );
  public native @Cast("bool") boolean addTrackerFeature( @Str String trackerFeatureType );

  /** \overload
    @param feature The TrackerFeature class
    */
  public native @Cast("bool") boolean addTrackerFeature( @Ptr @ByVal TrackerFeature feature );

  /** \brief Get the TrackerFeature collection (TrackerFeature name, TrackerFeature pointer)
     */
  public native @Const @ByRef StringTrackerFeaturePairVector getTrackerFeature();

  /** \brief Get the responses
    <p>
    \note Be sure to call extraction before getResponses Example TrackerFeatureSet::getResponses : :
     */
  public native @Const @ByRef MatVector getResponses();

}